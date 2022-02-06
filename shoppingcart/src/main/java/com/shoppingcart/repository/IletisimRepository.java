package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.model.Iletisim;

@Repository
public interface IletisimRepository extends JpaRepository<Iletisim, Long>{

}
