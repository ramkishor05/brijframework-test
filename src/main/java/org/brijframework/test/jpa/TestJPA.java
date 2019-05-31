package org.brijframework.test.jpa;

import org.brijframework.jpa.context.EntityContext;
import org.brijframework.jpa.processor.internal.EntityProcessorImpl;
import org.brijframework.jpa.util.EntityConstants;

public class TestJPA {
	public static void main(String[] args) {
		 EntityContext context=new EntityContext();
		 context.setProperty(EntityConstants.IMPORT_IMPORT_FILES, "E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\JPA\\");
		 context.setProperty(EntityConstants.IMPORT_ADPTER_CLASS, EntityProcessorImpl.class.getName());
		 context.start();
	}
}
