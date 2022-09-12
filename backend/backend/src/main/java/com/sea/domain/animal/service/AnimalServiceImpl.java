package com.sea.domain.animal.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.sea.domain.animal.db.entity.Animal;
import com.sea.domain.animal.db.repository.AnimalRepository;
import com.sea.domain.animal.response.AnimalDetailGetRes;
import com.sea.domain.animal.response.AnimalListGetRes;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AnimalServiceImpl implements AnimalService{
	
	@Autowired
    AnimalRepository animalRepository;
	
	
	@Override
    public Page<AnimalListGetRes> getAnimalList(Pageable pageable) {
        Page<Animal> animals = AnimalRepositorySupport.findAnimalList(pageable);
        List<AnimalListGetRes> animalListGetRes = new ArrayList<>();

        long total = animals.getTotalElements();

        for(Animal a : animals.getContent()){
            AnimalListGetRes animalList = new AnimalListGetRes();

//          User user = userRepositorySupport.findMintingUserByProductId(a.getProductId());

            animalList.setAnimalId(a.getAnimalId());
            animalList.setAnimalName(a.getAnimalName());
            animalList.setAnimalScientificName(a.getAnimalScientificName());
            animalList.setAnimalDesc(a.getAnimalDesc());
            animalList.setAnimalMaxItem(a.getAnimalMaxItem());
            animalList.setAnimalNowItem(a.getAnimalNowItem());
            animalList.setAnimalImg(a.getAnimalImg());
            //기부중 여부 제외
            animalList.setAnimalEndangeredLevel(a.getAnimalEndangeredLevel());
            animalList.setAnimalType(a.getAnimalType());
            animalListGetRes.add(animalList);
        }
        Page<AnimalListGetRes> res = new PageImpl<>(animalListGetRes, pageable, total);
        return res;
    }
	
	//동물 상세보기
	@Override
    public AnimalDetailGetRes animalDetail(int animalId) {
        Animal a = animalRepository.findById(animalId).get();

        AnimalDetailGetRes animalDetailGetRes = new AnimalDetailGetRes();

        animalDetailGetRes.setAnimalId(a.getAnimalId());
        animalDetailGetRes.setAnimalName(a.getAnimalName());
        animalDetailGetRes.setAnimalScientificName(a.getAnimalScientificName());
        animalDetailGetRes.setAnimalDesc(a.getAnimalDesc());
        animalDetailGetRes.setAnimalMaxItem(a.getAnimalMaxItem());
        animalDetailGetRes.setAnimalNowItem(a.getAnimalNowItem());
        animalDetailGetRes.setAnimalImg(a.getAnimalImg());
        //기부중 여부 제외
        animalDetailGetRes.setAnimalEndangeredLevel(a.getAnimalEndangeredLevel());
        animalDetailGetRes.setAnimalType(a.getAnimalType());
        return animalDetailGetRes;
    }
	
	//동물 이름
	@Override
    public Page<AnimalListGetRes> getAnimalListByName(Pageable pageable, String animalName)  {
        Page<Animal> animals = animalRepositorySupport.findProductListByTitle(pageable, animalName);
        List<AnimalListGetRes> animalListGetRes = new ArrayList<>();

        long total = animals.getTotalElements();

        for(Animal a : animals.getContent()){
            AnimalListGetRes animalList = new AnimalListGetRes();

            animalList.setAnimalId(a.getAnimalId());
            animalList.setAnimalName(a.getAnimalName());

            animalListGetRes.add(animalList);
        }

        Page<AnimalListGetRes> res = new PageImpl<>(animalListGetRes, pageable, total);

        return res;
    }
}
