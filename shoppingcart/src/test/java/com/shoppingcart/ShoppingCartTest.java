package com.shoppingcart;

import static org.hamcrest.CoreMatchers.nullValue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.shoppingcart.model.Product;
import com.shoppingcart.service.ProductService;
import com.shoppingcart.service.ProductServiceImpl;
@Component
public class ShoppingCartTest implements CommandLineRunner{
	@Autowired
	ProductServiceImpl productServiceImpl=null;
@Override
public void run(String... args) throws Exception {
	// TODO Auto-generated method stub
	Product product=new Product();
	productServiceImpl.productDetay((long) 1);
	System.out.println(product.getAciklama());
}
}
