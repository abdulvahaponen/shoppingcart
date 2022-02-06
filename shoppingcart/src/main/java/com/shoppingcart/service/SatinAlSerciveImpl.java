package com.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.model.SatinAl;
import com.shoppingcart.repository.SatinAlRepository;

@Service
public class SatinAlSerciveImpl implements SatinAlService{
@Autowired
SatinAlRepository satinAlRepository;
	@Override
	public void urunAl(SatinAl satinAl) {
		// TODO Auto-generated method stub
		satinAlRepository.save(satinAl);
	}

}
