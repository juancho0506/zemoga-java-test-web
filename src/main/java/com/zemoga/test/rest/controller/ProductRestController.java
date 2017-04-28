/**
 * 
 */
package com.zemoga.test.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zemoga.test.core.persistence.model.Product;
import com.zemoga.test.core.service.IProductService;
import com.zemoga.test.core.service.ServiceException;

/**
 * Clase Rest Controller para los servicios relacionados con  la 
 * entidad Producto.
 * @author Rodrigo Torres
 *
 */
@Controller
@RequestMapping(value = "/getProducts")
public class ProductRestController {
	
	@Autowired
	private IProductService service;
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Product> getAllProducts() {
		try {
			return service.getAllProducts();
		} catch (ServiceException e) {
			e.printStackTrace();
			return new ArrayList<Product>();
		}
	}
	
	@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
	public String displayMessage(@PathVariable String msg, ModelMap model) {
		model.addAttribute("messageUrl", msg);
		return "hello";
	}
}
