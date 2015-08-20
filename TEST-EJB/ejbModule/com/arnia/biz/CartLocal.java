package com.arnia.biz;

import javax.ejb.Local;

import com.arnia.entity.product.Product;


@Local
public interface CartLocal {
	
	  void addProductToCart(Product product);
	  
	  void checkOut();

}
