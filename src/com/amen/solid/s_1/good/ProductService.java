package com.amen.solid.s_1.good;

import java.util.LinkedList;
import java.util.List;

import com.amen.solid.s_1.Product;

/**
 * Service responsible for managing products.
 * 
 * @author AmeN
 */
public class ProductService {

	private List<Product> products;
	
	public ProductService() {
		products = new LinkedList<>();
	}
	
	public void addProduct(Product givenProduct){
		products.add(givenProduct);
	}
	
	public void removeProduct(Product givenProduct){
		products.remove(givenProduct);
	}
	
	public boolean hasProduct(Product givenProduct){
		return products.contains(givenProduct);
	}
	
	public int containsCount(Product givenProduct){
		int count = 0;
		
		for(Product singleProduct : products){
			if(singleProduct == givenProduct){
				count++;
			}
		}
		
		return count;
	}
}
