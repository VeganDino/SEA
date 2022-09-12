package com.sea.domain.animal.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sea.domain.animal.db.entity.Animal;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Integer>{

}
