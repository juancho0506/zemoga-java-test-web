/**
 * 
 */
package com.zemoga.test.core.service;

import java.util.List;

import com.zemoga.test.core.persistence.model.Product;

/**
 * Product interface for the product services.
 * @author Rodrigo
 *
 */
public interface IProductService {
	
	/**
	 * Service that returns all the products in the persistence.
	 * @return The list of products in the persitence.
	 */
	public List<Product> getAllProducts() throws ServiceException;
}
