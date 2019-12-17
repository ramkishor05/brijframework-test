package org.brijframework.boot;

import org.brijframework.boot.runner.ApplicationContextRunner;
import org.brijframework.dao.Address;
import org.brijframework.model.context.ModelContext;
import org.brijframework.model.context.factories.ModelContextFactory;
import org.brijframework.util.printer.LoggerConsole;

public class ModelContextTest {

	public static void main(String[] args) {
		ApplicationContextRunner.run().getApplicationContext();
		
		ModelContext modelContext=ModelContextFactory.getFactory().getModelContext();
		
		LoggerConsole.screen("ModelResource");
		LoggerConsole.screen("ModelResourceNames()",""+modelContext.getModelResourceNames());
		LoggerConsole.screen("ModelResourceNames(\"Address\")",""+modelContext.getModelResourceNames("Address"));
		LoggerConsole.screen("ModelResource(\"Address_001\")",""+modelContext.getModelResource("Address_001"));
		LoggerConsole.screen("ModelResourceList()",""+modelContext.getModelResourceList());
		LoggerConsole.screen("ModelResourceList(\"Address_001\")",""+modelContext.getModelResourceList("Address_001"));
				
		LoggerConsole.screen("ModelMetaData");
		LoggerConsole.screen("ModelMetaDataNames()",""+modelContext.getModelMetaDataNames());
		LoggerConsole.screen("ModelMetaDataNames(\"Address\")",""+modelContext.getModelMetaDataNames("Address"));
		LoggerConsole.screen("ModelMetaData(\"Address_001\")",""+modelContext.getModelMetaData("Address_001"));
		LoggerConsole.screen("ModelMetaDataList()",""+modelContext.getModelMetaDataList());
		LoggerConsole.screen("ModelMetaDataList(Address.class)",""+modelContext.getModelMetaDataList(Address.class));
		
	}
}
