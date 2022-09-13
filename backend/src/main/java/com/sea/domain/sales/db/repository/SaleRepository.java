package com.sea.domain.sales.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sea.domain.sales.db.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer>{

	
}
