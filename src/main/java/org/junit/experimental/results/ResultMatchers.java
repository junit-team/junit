package org.junit.experimental.results;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

import static org.hamcrest.CoreMatchers.equalTo;

/**
 * Matchers on a PrintableResult, to enable JUnit self-tests.
 * For example:
 *
 * <pre>
 * assertThat(testResult(HasExpectedException.class), isSuccessful());
 * </pre>
 */
public class ResultMatchers {

    /**
     * Do not instantiate.
     * @deprecated will be private soon.
     */
    @Deprecated
    public ResultMatchers() {
    }

    /**
     * Matches if the tests are all successful
     */
    public static Matcher<PrintableResult> isSuccessful() {
        return failureCountIs(0);
    }

    /**
     * Matches if there are {@code count} failures
     */
    public static Matcher<PrintableResult> failureCountIs(final int count) {
        return failureCount(equalTo(count));
    }

    /**
     * Matches if the number of failures matches {@code countMatcher}
     */
    public static Matcher<PrintableResult> failureCount(final Matcher<Integer> countMatcher) {
        return new TypeSafeMatcher<PrintableResult>() {
            public void describeTo(Description description) {
                description.appendText("has a number of failures matching " + countMatcher);
            }

            @Override
            public boolean matchesSafely(PrintableResult item) {
                return countMatcher.matches(item.failureCount());
            }
        };
    }

    /**
     * Matches if the result has exactly one failure, and it contains {@code string}
     */
    public static Matcher<Object> hasSingleFailureContaining(final String string) {
        return new BaseMatcher<Object>() {
            public boolean matches(Object item) {
                return item.toString().contains(string) && failureCountIs(1).matches(item);
            }

            public void describeTo(Description description) {
                description.appendText("has single failure containing " + string);
            }
        };
    }

    /**
     * Matches if the result has one or more failures, and at least one of them
     * contains {@code string}
     */
    public static Matcher<PrintableResult> hasFailureContaining(final String string) {
        return new TypeSafeMatcher<PrintableResult>() {
            public boolean matchesSafely(PrintableResult item) {
                return item.failureCount() > 0 && item.toString().contains(string);
            }

            public void describeTo(Description description) {
                description.appendText("has failure containing " + string);
            }
        };
    }
}
