package org.sreekanth.Flipkart.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.sreekanth.Flipkart.entity.ProductEntity;
import org.sreekanth.Flipkart.util.SessionFactoryUtil;

public class FlipkartRepository {

	public void saveProductDetails(ProductEntity productEntity) {
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.merge(productEntity);
		transaction.commit();
	}
	
	public ProductEntity findById(long id) {
		
		SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		return session.get(ProductEntity.class, id);
		
	}
}
