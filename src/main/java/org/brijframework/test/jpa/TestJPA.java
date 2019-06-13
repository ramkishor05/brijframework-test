package org.brijframework.test.jpa;

import java.sql.Connection;
import java.sql.SQLException;

import org.brijframework.jdbc.constants.JdbcMeta;
import org.brijframework.jdbc.context.JdbcContext;
import org.brijframework.jdbc.factories.asm.DataSourceJdbcFactory;
import org.brijframework.jdbc.util.JdbcUtil;
import org.brijframework.model.context.ModelContext;
import org.brijframework.model.env.PropEnvironment;

public class TestJPA {
	public static void main(String[] args) {
		/*
		 * EntityContext context=new EntityContext();
		 * context.setProperty(EntityConstants.IMPORT_IMPORT_FILES,
		 * "E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\JPA\\");
		 * context.setProperty(EntityConstants.IMPORT_ADPTER_CLASS,
		 * EntityProcessorImpl.class.getName()); context.start();
		 */
		PropEnvironment environment=new PropEnvironment();
		
		
		
		ModelContext context = new ModelContext();
		context.startup();
		
		JdbcContext jdbcContext=new JdbcContext();
		
		Connection jdbcConnection;
		try {
			jdbcConnection = DataSourceJdbcFactory.factory().getConnection("DEV_DATA_SOURCE");
			System.out.println(JdbcUtil.getTablesList(jdbcConnection,JdbcMeta.TABLE.toString()));
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
