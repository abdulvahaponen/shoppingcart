package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.model.Uye;

@Repository
public interface UyeRepository extends JpaRepository<Uye, Long>{

}
