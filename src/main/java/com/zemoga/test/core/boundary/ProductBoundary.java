/**
 * 
 */
package com.zemoga.test.core.boundary;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.zemoga.test.core.persistence.model.Product;

/**
 * Boundary that implements the persistence services for products.
 * @author Rodrigo
 *
 */
@Component
@Transactional
public class ProductBoundary {
	
	@Autowired
    private SessionFactory sessionFactory;
	
	/**
	 * The hibernate session for queries.
	 * @return
	 */
	private Session getCurrentSession(){
      return sessionFactory.getCurrentSession();
	}
	
	/**
	 * Returns the list of products of the persistence.
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public List<Product> getAllProducts() throws HibernateException{
		return this.getCurrentSession().getNamedQuery("Product.getAll").list();
	}
}
