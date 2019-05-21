package org.brijframework.test.builder;

import org.brijframework.builder.factories.impl.CodeBuilderFactory;
import org.brijframework.model.beans.ModelBean;
import org.brijframework.model.factories.ModelFactory;

public class BuilderTesting {

	public static void main(String[] args) {
		
		CodeBuilderFactory.getFactory();
		
		ModelBean model=ModelFactory.getFactory().getModel("Md_001");
		//model.setProperty("id", "1");
		model.setProperty("name", "Ram");
		System.out.println("model="+model);
	}
}
