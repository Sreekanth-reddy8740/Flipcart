package org.sreekanth.Flipkart.util;

import java.util.Properties;

public class ConnectionPropertiesUtil {

	public static Properties getMysqlDbProperties() {
	
		Properties properties = new Properties();
		properties.setProperty("connection.driver_class", "com.mysql.cj.jdbc.Driver");
		properties.setProperty("hibernate.connection.url", "jdbc:mysql://localhost:3306/flipkart");
		properties.setProperty("hibernate.connection.username", "root");	
		properties.setProperty("hibernate.connection.password", "password");	
		properties.setProperty("hibernate.show_query", "true");
		return properties;
	}
	
	
}
