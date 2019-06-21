package org.brijframework.boot;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Map;

import org.brijframework.context.ApplicationContext;
import org.brijframework.jdbc.constants.JdbcMeta;
import org.brijframework.jdbc.factories.asm.DataSourceJdbcFactory;
import org.brijframework.jdbc.util.JdbcUtil;

public class AppBoot {

	public static void main(String[] args) {
		ApplicationContext context=new  ApplicationContext();
		context.startup();
		
		try {
			Connection connection=DataSourceJdbcFactory.factory().getConnection("PROD_DATA_SOURCE");
			for(Map<String, String> map:JdbcUtil.getTablesList(connection, JdbcMeta.TABLE)) {
				System.out.println(map);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
