package org.brijframework.test.jpa;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
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
		ModelContext context = new ModelContext();
		context.startup();

		Connection jdbcConnection;
		try {
			jdbcConnection = SchemaFactory.factory().getConnection("DEV_DATA_SOURCE");
			DatabaseMetaData metaData=jdbcConnection.getMetaData();
			ResultSet tables = metaData.getTables(null, null, null, 
			         new String[] {"TABLE"});
			while (tables.next()) {
				System.out.println(tables.getRow()+"table = " + tables.getString("TABLE_NAME"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
