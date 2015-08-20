package com.ap.biz;

import javax.ejb.Local;

import com.ap.entity.product.Product;


@Local
public interface CartLocal {
	
	  void addProductToCart(Product product);
	  
	  void checkOut();

}
