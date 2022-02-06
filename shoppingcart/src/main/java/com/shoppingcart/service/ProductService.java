package com.shoppingcart.service;

import java.util.List;

import com.shoppingcart.model.Product;

public interface ProductService {
List<Product> getAllProduct();
Product productDetay(Long productId);
}
