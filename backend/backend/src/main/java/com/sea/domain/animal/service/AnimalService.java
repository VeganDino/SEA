package com.sea.domain.animal.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.sea.domain.animal.response.AnimalDetailGetRes;
import com.sea.domain.animal.response.AnimalListGetRes;

public interface AnimalService {

	Page<AnimalListGetRes> getAnimalList(Pageable pageable); // 상품 전체 조회
	
	AnimalDetailGetRes animalDetail(int animalId); // 상품 상세 조회
	
	Page<AnimalListGetRes> getAnimalListByName(Pageable pageable, String animalName);
}
