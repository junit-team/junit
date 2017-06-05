package org.junit.experimental.runners.customizable;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;

public class ReflectionTestFactory implements TestFactory {

	public List<FrameworkTest> computeTestMethods(TestClass testClass,
			List<Throwable> errors) {
		List<FrameworkTest> result= new ArrayList<FrameworkTest>();

		for (FrameworkMethod eachTestMethod : testClass
				.getAnnotatedMethods(Test.class)) {
			if (errors != null) {
				eachTestMethod.validatePublicVoidNoArg(false, errors);
			}
			result.add(createTest(testClass, eachTestMethod));
		}

		return result;
	}

	protected FrameworkTest createTest(TestClass testClass, FrameworkMethod eachTestMethod) {
		return new AnnotatedFrameworkTest(testClass, eachTestMethod);
	}
}
