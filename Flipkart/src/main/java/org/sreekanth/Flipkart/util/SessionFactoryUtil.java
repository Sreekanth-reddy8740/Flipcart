package org.sreekanth.Flipkart.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.sreekanth.Flipkart.entity.ProductEntity;
import org.sreekanth.Flipkart.entity.StackEntity;

public class SessionFactoryUtil {

	private static SessionFactory sessionfactory=null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionfactory==null) {
			Configuration cfg = new Configuration();
			cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
			cfg.addAnnotatedClass(ProductEntity.class);
			cfg.addAnnotatedClass(StackEntity.class);
			sessionfactory=cfg.buildSessionFactory();
		}
		return sessionfactory;
	}
	
}
