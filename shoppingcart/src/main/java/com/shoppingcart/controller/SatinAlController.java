package com.shoppingcart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.shoppingcart.model.SatinAl;
import com.shoppingcart.service.SatinAlService;

@Controller
public class SatinAlController {
@Autowired
SatinAlService satinAlService;
@GetMapping("/satinAlForm")
public String satinAlForm(Model model) {
	SatinAl satinAl=new SatinAl();
    model.addAttribute("satinAl",satinAl);
    return "satinAlFrom";
    }
@PostMapping("/satinAl")
public String satinAl( @ModelAttribute("satinAl")SatinAl satinAl) {
   satinAlService.urunAl(satinAl);
   return "satisBilgileri";
}
}
