package com.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingcart.model.Uye;
import com.shoppingcart.service.UyeService;

@Controller
public class UyeController {
@Autowired
UyeService uyeService;
@GetMapping("/yeniUyeForm")
public String yeniUyeForm(Model model) {
	Uye uye=new Uye();
	model.addAttribute("uye",uye);
	return "uyeForm";
}
@PostMapping("/yeniUye")
public String uyeEkle(@ModelAttribute("uye")Uye uye) {
	uyeService.uyeOl(uye);
	return "redirect:/index";
}
}
