package com.shoppingcart.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shoppingcart.model.Product;
import com.shoppingcart.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
@Autowired
ProductRepository productRepository;
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return this.productRepository.findAll();
	}
	@Override
	public Product productDetay(Long productId) {
		// TODO Auto-generated method stub
		Optional<Product> optional=productRepository.findById(productId);
		Product product=null;
		if (optional.isPresent()) {
			product=optional.get();
			}else {
				throw new RuntimeException("product bulunamadı"+productId);
			}
		return product;
	}
	 
	 
	 
}
