/**
 * 
 */
package com.zemoga.test.core.persistence.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * Entity class for Product Table
 * @author Rodrigo
 *
 */
@Entity
@Table(name = "PRODUCT")
@NamedQueries(
		@NamedQuery(name = "Product.getAll", query = "SELECT p FROM Product p ORDER BY p.name")
)
public class Product implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7368032635770157471L;

	private String name;
	
	private String sku;
	
	private BigDecimal price;

	@Column(name = "NAME")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Id
	@Column(name = "SKU")
	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}
	
	@Column(name = "PRICE")
	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
