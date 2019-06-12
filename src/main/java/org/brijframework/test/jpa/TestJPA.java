package org.brijframework.test.jpa;

import java.sql.Connection;
import java.sql.SQLException;

import org.brijframework.jdbc.factories.SchemaFactory;
import org.brijframework.model.context.ModelContext;

public class TestJPA {
	public static void main(String[] args) {
		/*
		 * EntityContext context=new EntityContext();
		 * context.setProperty(EntityConstants.IMPORT_IMPORT_FILES,
		 * "E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\JPA\\");
		 * context.setProperty(EntityConstants.IMPORT_ADPTER_CLASS,
		 * EntityProcessorImpl.class.getName()); context.start();
		 */
		ModelContext context=new ModelContext();
		context.startup();
		Connection dataSource;
		try {
			dataSource = SchemaFactory.factory().getConnection("DEV_DATA_SOURCE");
			System.out.println(dataSource);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
