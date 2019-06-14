package org.brijframework.test.jpa;

import org.brijframework.asm.context.ApplicationContext;
import org.brijframework.model.env.PropEnvironment;
import org.brijframework.resources.asm.container.FileResourceContainer;
import org.brijframework.resources.container.ResourceContainer;

public class TestJPA {
	public static void main(String[] args) {
		/*
		 * EntityContext context=new EntityContext();
		 * context.setProperty(EntityConstants.IMPORT_IMPORT_FILES,
		 * "E:\\brijframe\\org.brijframework-test\\src\\main\\resources\\JPA\\");
		 * context.setProperty(EntityConstants.IMPORT_ADPTER_CLASS,
		 * EntityProcessorImpl.class.getName()); context.start();
		 */
		ApplicationContext context=new  ApplicationContext();
		context.startup();
		
		/*
		 * PropEnvironment environment=new PropEnvironment();
		 * System.out.println(environment.getProperties());
		 */
		/*
		 * ModelContext context = new ModelContext();
		 * 
		 * context.startup();
		 * 
		 * JdbcContext jdbcContext=new JdbcContext();
		 * 
		 * Connection jdbcConnection; try { jdbcConnection =
		 * DataSourceJdbcFactory.factory().getConnection("DEV_DATA_SOURCE");
		 * System.out.println(JdbcUtil.getTablesList(jdbcConnection,JdbcMeta.TABLE.
		 * toString())); } catch (SQLException e) { e.printStackTrace(); }
		 */

	}
}
