package com.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.model.Odeme;
import com.shoppingcart.repository.OdemeRepository;
@Service
public class OdemeServiceImpl implements OdemeService{
@Autowired
OdemeRepository odemeRepository;
	@Override
	public void odemeYap(Odeme odeme) {
		odemeRepository.save(odeme);
		// TODO Auto-generated method stub
		
	}

}
