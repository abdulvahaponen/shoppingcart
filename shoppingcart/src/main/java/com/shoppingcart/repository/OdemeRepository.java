package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.model.Odeme;

@Repository
public interface OdemeRepository extends JpaRepository<Odeme, Long>{

}
