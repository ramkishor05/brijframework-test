package org.brijframework.test.builder;

import org.brijframework.builder.factories.impl.JavassistBuilderFactory;

public class BuilderTesting {

	public static void main(String[] args) {
		
		JavassistBuilderFactory.getFactory().loadFactory("E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\build\\build_model.json");
	}
}
