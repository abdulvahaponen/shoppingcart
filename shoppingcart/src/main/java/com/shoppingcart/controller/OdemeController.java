package com.shoppingcart.controller;

import java.security.PublicKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingcart.model.Odeme;
import com.shoppingcart.service.OdemeService;

@Controller
public class OdemeController {
@Autowired
OdemeService odemeService;
@GetMapping("/odemeYapForm")
public String odemeYapForm(Model model) {
	Odeme odeme=new Odeme();
	model.addAttribute("odeme",odeme);
	return "odemeYapForm";
}
@PostMapping("/odemeYap")
public String odemeYap(@ModelAttribute("odeme")Odeme odeme) {
	odemeService.odemeYap(odeme);
	return "redirect:/index";
}
}
