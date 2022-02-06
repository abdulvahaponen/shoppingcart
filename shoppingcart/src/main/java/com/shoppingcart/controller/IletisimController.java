package com.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingcart.model.Iletisim;
import com.shoppingcart.service.IletisimService;

@Controller
public class IletisimController {
@Autowired
IletisimService iletisimService;
@GetMapping("/iletisimForm")
public String iletisimForm(Model model) {
	Iletisim iletisim=new Iletisim();
	model.addAttribute("iletisim",iletisim);
	return "iletisimForm";
}
@PostMapping("/iletisim")
public String iletisim(@ModelAttribute("iletisim")Iletisim iletisim) {
	iletisimService.iletisimEkle(iletisim);
	return "redirect:/index";
}
}
