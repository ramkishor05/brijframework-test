package org.brijframework.test.jpa;

import java.util.Map.Entry;

import org.brijframework.asm.context.ApplicationContext;
import org.brijframework.resources.factory.yaml.YamlResourceFactory;

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
		
		/*PropEnvironment environment=new PropEnvironment();
		System.out.println(environment.getProperties());
		 */
		YamlResourceFactory factory=YamlResourceFactory.factory();
		for(Entry<Object, Object> entry:factory.getResource("application.yml").getProperties().entrySet())
		System.out.println(entry.getKey()+"="+entry.getValue());
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
