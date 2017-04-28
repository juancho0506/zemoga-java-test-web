/**
 * 
 */
package com.zemoga.test.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zemoga.test.core.boundary.ProductBoundary;
import com.zemoga.test.core.persistence.model.Product;

/**
 * Class that implements the IProductService interface.
 * @author Rodrigo
 *
 */
@Component
public class DefaultProductService implements IProductService {
	
	@Autowired
	private ProductBoundary productBoundary;

	/* (non-Javadoc)
	 * @see com.zemoga.test.core.service.IProductService#getAllProducts()
	 */
	public List<Product> getAllProducts() {
		return productBoundary.getAllProducts();
	}

}
