package com.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.model.Uye;
import com.shoppingcart.repository.UyeRepository;

@Service
public class UyeServiceImpl  implements UyeService{
@Autowired
UyeRepository uyeRepository;
	@Override
	public void uyeOl(Uye uye) {
		// TODO Auto-generated method stub
		uyeRepository.save(uye);
	}

}
