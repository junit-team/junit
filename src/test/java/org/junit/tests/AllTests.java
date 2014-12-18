package org.junit.tests;

import junit.framework.JUnit4TestAdapter;
import junit.framework.Test;
import junit.samples.money.MoneyTest;
import org.junit.AssumptionViolatedExceptionTest;
import org.junit.experimental.categories.CategoryFilterFactoryTest;
import org.junit.internal.MethodSorterTest;
import org.junit.internal.matchers.StacktracePrintingMatcherTest;
import org.junit.internal.matchers.ThrowableCauseMatcherTest;
import org.junit.rules.DisableOnDebugTest;
import org.junit.rules.StopwatchTest;
import org.junit.runner.FilterFactoriesTest;
import org.junit.runner.FilterOptionIntegrationTest;
import org.junit.runner.JUnitCommandLineParseResultTest;
import org.junit.runner.JUnitCoreTest;
import org.junit.runner.RunWith;
import org.junit.runner.notification.ConcurrentRunNotifierTest;
import org.junit.runner.notification.RunNotifierTest;
import org.junit.runner.notification.SynchronizedRunListenerTest;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runners.model.FrameworkFieldTest;
import org.junit.runners.model.FrameworkMethodTest;
import org.junit.runners.model.TestClassTest;
import org.junit.runners.parameterized.ParameterizedNamesTest;
import org.junit.runners.parameterized.TestWithParametersTest;
import org.junit.tests.assertion.AssertionTest;
import org.junit.tests.assertion.ComparisonFailureTest;
import org.junit.tests.assertion.MultipleFailureExceptionTest;
import org.junit.tests.description.AnnotatedDescriptionTest;
import org.junit.tests.description.SuiteDescriptionTest;
import org.junit.tests.description.TestDescriptionMethodNameTest;
import org.junit.tests.description.TestDescriptionTest;
import org.junit.tests.experimental.AssumptionTest;
import org.junit.tests.experimental.ExperimentalTests;
import org.junit.tests.experimental.MatcherTest;
import org.junit.tests.experimental.categories.CategoriesAndParameterizedTest;
import org.junit.tests.experimental.categories.CategoryTest;
import org.junit.tests.experimental.categories.CategoryValidatorTest;
import org.junit.tests.experimental.categories.JavadocTest;
import org.junit.tests.experimental.categories.MultiCategoryTest;
import org.junit.tests.experimental.max.DescriptionTest;
import org.junit.tests.experimental.max.JUnit38SortingTest;
import org.junit.tests.experimental.max.MaxStarterTest;
import org.junit.tests.experimental.parallel.ParallelClassTest;
import org.junit.tests.experimental.parallel.ParallelMethodTest;
import org.junit.tests.experimental.rules.BlockJUnit4ClassRunnerOverrideTest;
import org.junit.tests.experimental.rules.ClassRulesTest;
import org.junit.tests.experimental.rules.ExpectedExceptionTest;
import org.junit.tests.experimental.rules.ExternalResourceRuleTest;
import org.junit.tests.experimental.rules.MethodRulesTest;
import org.junit.tests.experimental.rules.NameRulesTest;
import org.junit.tests.experimental.rules.RuleChainTest;
import org.junit.tests.experimental.rules.RuleMemberValidatorTest;
import org.junit.tests.experimental.rules.TempFolderRuleTest;
import org.junit.tests.experimental.rules.TemporaryFolderUsageTest;
import org.junit.tests.experimental.rules.TestRuleTest;
import org.junit.tests.experimental.rules.TestWatcherTest;
import org.junit.tests.experimental.rules.TimeoutRuleTest;
import org.junit.tests.experimental.rules.VerifierRuleTest;
import org.junit.tests.experimental.theories.TestedOnSupplierTest;
import org.junit.tests.experimental.theories.internal.AllMembersSupplierTest;
import org.junit.tests.experimental.theories.internal.ParameterizedAssertionErrorTest;
import org.junit.tests.experimental.theories.internal.SpecificDataPointsSupplierTest;
import org.junit.tests.experimental.theories.runner.FailingDataPointMethods;
import org.junit.tests.experimental.theories.runner.TheoriesPerformanceTest;
import org.junit.tests.experimental.theories.runner.TypeMatchingBetweenMultiDataPointsMethod;
import org.junit.tests.experimental.theories.runner.WithAutoGeneratedDataPoints;
import org.junit.tests.experimental.theories.runner.WithDataPointMethod;
import org.junit.tests.experimental.theories.runner.WithNamedDataPoints;
import org.junit.tests.experimental.theories.runner.WithParameterSupplier;
import org.junit.tests.internal.runners.ErrorReportingRunnerTest;
import org.junit.tests.internal.runners.statements.FailOnTimeoutTest;
import org.junit.tests.junit3compatibility.AllTestsTest;
import org.junit.tests.junit3compatibility.ClassRequestTest;
import org.junit.tests.junit3compatibility.ForwardCompatibilityPrintingTest;
import org.junit.tests.junit3compatibility.ForwardCompatibilityTest;
import org.junit.tests.junit3compatibility.InitializationErrorForwardCompatibilityTest;
import org.junit.tests.junit3compatibility.JUnit38ClassRunnerTest;
import org.junit.tests.junit3compatibility.OldTestClassAdaptingListenerTest;
import org.junit.tests.junit3compatibility.OldTests;
import org.junit.tests.junit3compatibility.SuiteMethodTest;
import org.junit.tests.listening.ListenerTest;
import org.junit.tests.listening.RunnerTest;
import org.junit.tests.listening.TestListenerTest;
import org.junit.tests.listening.TextListenerTest;
import org.junit.tests.listening.UserStopTest;
import org.junit.tests.manipulation.FilterTest;
import org.junit.tests.manipulation.FilterableTest;
import org.junit.tests.manipulation.SingleMethodTest;
import org.junit.tests.manipulation.SortableTest;
import org.junit.tests.running.classes.BlockJUnit4ClassRunnerTest;
import org.junit.tests.running.classes.ClassLevelMethodsWithIgnoredTestsTest;
import org.junit.tests.running.classes.EnclosedTest;
import org.junit.tests.running.classes.IgnoreClassTest;
import org.junit.tests.running.classes.ParameterizedTestTest;
import org.junit.tests.running.classes.ParentRunnerFilteringTest;
import org.junit.tests.running.classes.ParentRunnerTest;
import org.junit.tests.running.classes.RunWithTest;
import org.junit.tests.running.classes.SuiteTest;
import org.junit.tests.running.classes.UseSuiteAsASuperclassTest;
import org.junit.tests.running.core.CommandLineTest;
import org.junit.tests.running.core.JUnitCoreReturnsCorrectExitCodeTest;
import org.junit.tests.running.core.SystemExitTest;
import org.junit.tests.running.methods.AnnotationTest;
import org.junit.tests.running.methods.ExpectedTest;
import org.junit.tests.running.methods.InheritedTestTest;
import org.junit.tests.running.methods.ParameterizedTestMethodTest;
import org.junit.tests.running.methods.TestMethodTest;
import org.junit.tests.running.methods.TimeoutTest;
import org.junit.tests.validation.FailedConstructionTest;
import org.junit.tests.validation.ValidationTest;
import org.junit.validator.PublicClassValidatorTest;

// These test files need to be cleaned. See
// https://sourceforge.net/pm/task.php?func=detailtask&project_task_id=136507&group_id=15278&group_project_id=51407

@RunWith(Suite.class)
@SuiteClasses({
        AssumptionTest.class,
        ClassRequestTest.class,
        ListenerTest.class,
        FailedConstructionTest.class,
        TestDescriptionTest.class,
        TestDescriptionMethodNameTest.class,
        SuiteDescriptionTest.class,
        AllTestsTest.class,
        AnnotationTest.class,
        AssertionTest.class,
        CommandLineTest.class,
        ExpectedTest.class,
        ComparisonFailureTest.class,
        MultipleFailureExceptionTest.class,
        ForwardCompatibilityTest.class,
        OldTests.class,
        ParameterizedTestTest.class,
        RunWithTest.class,
        RunnerTest.class,
        SuiteTest.class,
        TestListenerTest.class,
        TestMethodTest.class,
        TextListenerTest.class,
        TimeoutTest.class,
        EnclosedTest.class,
        ParameterizedTestMethodTest.class,
        InitializationErrorForwardCompatibilityTest.class,
        SingleMethodTest.class,
        ClassLevelMethodsWithIgnoredTestsTest.class,
        ValidationTest.class,
        UserStopTest.class,
        SortableTest.class,
        JUnit38ClassRunnerTest.class,
        SystemExitTest.class,
        JUnitCoreReturnsCorrectExitCodeTest.class,
        SuiteMethodTest.class,
        IgnoreClassTest.class,
        OldTestClassAdaptingListenerTest.class,
        AnnotatedDescriptionTest.class,
        AssumptionViolatedExceptionTest.class,
        ExperimentalTests.class,
        InheritedTestTest.class,
        TestClassTest.class,
        AllMembersSupplierTest.class,
        SpecificDataPointsSupplierTest.class,
        ParameterizedAssertionErrorTest.class,
        WithDataPointMethod.class,
        WithNamedDataPoints.class,
        WithAutoGeneratedDataPoints.class,
        MatcherTest.class,
        ObjectContractTest.class,
        TheoriesPerformanceTest.class,
        UseSuiteAsASuperclassTest.class,
        FilterableTest.class,
        FilterTest.class,
        MaxStarterTest.class,
        JUnit38SortingTest.class,
        MethodRulesTest.class,
        TestRuleTest.class,
        TimeoutRuleTest.class,
        ParallelClassTest.class,
        ParallelMethodTest.class,
        ParentRunnerTest.class,
        NameRulesTest.class,
        ClassRulesTest.class,
        ExpectedExceptionTest.class,
        TempFolderRuleTest.class,
        TemporaryFolderUsageTest.class,
        ExternalResourceRuleTest.class,
        VerifierRuleTest.class,
        CategoryTest.class,
        CategoriesAndParameterizedTest.class,
        MultiCategoryTest.class,
        JavadocTest.class,
        ParentRunnerFilteringTest.class,
        BlockJUnit4ClassRunnerOverrideTest.class,
        RuleMemberValidatorTest.class,
        RuleChainTest.class,
        BlockJUnit4ClassRunnerTest.class,
        MethodSorterTest.class,
        TestedOnSupplierTest.class,
        StacktracePrintingMatcherTest.class,
        StopwatchTest.class,
        RunNotifierTest.class,
        ConcurrentRunNotifierTest.class,
        SynchronizedRunListenerTest.class,
        FilterOptionIntegrationTest.class,
        JUnitCommandLineParseResultTest.class,
        FilterFactoriesTest.class,
        CategoryFilterFactoryTest.class,
        FrameworkFieldTest.class,
        FrameworkMethodTest.class,
        FailOnTimeoutTest.class,
        JUnitCoreTest.class,
        TestWithParametersTest.class,
        ParameterizedNamesTest.class,
        PublicClassValidatorTest.class,
        DisableOnDebugTest.class,
        ThrowableCauseMatcherTest.class,
        TestWatcherTest.class,
        WithParameterSupplier.class,
        FailingDataPointMethods.class,
        TypeMatchingBetweenMultiDataPointsMethod.class,
        TheoriesPerformanceTest.class,
        MoneyTest.class,
        CategoryValidatorTest.class,
        ForwardCompatibilityPrintingTest.class,
        DescriptionTest.class,
        ErrorReportingRunnerTest.class
})
public class AllTests {
    public static Test suite() {
        return new JUnit4TestAdapter(AllTests.class);
    }
}
