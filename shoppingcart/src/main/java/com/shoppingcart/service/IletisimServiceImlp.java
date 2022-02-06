package com.shoppingcart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shoppingcart.model.Iletisim;
import com.shoppingcart.repository.IletisimRepository;
@Service
public class IletisimServiceImlp implements IletisimService{
@Autowired
IletisimRepository iletisimRepository;
	@Override
	public void iletisimEkle(Iletisim iletisim) {
		// TODO Auto-generated method stub
		iletisimRepository.save(iletisim);
	}

}
