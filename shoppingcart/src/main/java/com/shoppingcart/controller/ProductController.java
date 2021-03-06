package com.shoppingcart.controller;

import java.security.PublicKey;

import javax.crypto.spec.DHPublicKeySpec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingcart.model.Iletisim;
import com.shoppingcart.service.ProductService;

@Controller
public class ProductController {
@Autowired
ProductService productService;
@GetMapping("/index")
public String anasayfa(Model model) {
	model.addAttribute("products",productService.getAllProduct());
	return "index";
}
@GetMapping("/product/{id}")
public String productDetay(@PathVariable(value = "id")Long id,Model model) {
   	model.addAttribute("productDetay",productService.productDetay(id));
	return "productDetay";
}
@GetMapping("/hakkimizda")
public String hakkimizda(Model model) {
	return "hakkimizda";
}
}