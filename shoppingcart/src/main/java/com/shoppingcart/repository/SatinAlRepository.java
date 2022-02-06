package com.shoppingcart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.model.SatinAl;

@Repository
public interface SatinAlRepository extends JpaRepository<SatinAl, Long>{

}
