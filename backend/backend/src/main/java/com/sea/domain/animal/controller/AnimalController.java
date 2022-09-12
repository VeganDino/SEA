package com.sea.domain.animal.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sea.domain.animal.response.AnimalDetailGetRes;
import com.sea.domain.animal.response.AnimalListGetRes;
import com.sea.domain.animal.service.AnimalService;

import javax.transaction.Transactional;

import io.swagger.annotations.*;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/vi/animal")
public class AnimalController {
	
	@Autowired
    AnimalService animalService;


    // READ
    @ApiOperation(value = "동물조회")
    @GetMapping("")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공", response = AnimalListGetRes.class),
    })
    public ResponseEntity<Page<AnimalListGetRes>> getProductList(@PageableDefault(page = 0, size = 10) Pageable pageable){
        log.info("getProductList - 호출");
        Page<AnimalListGetRes> animals = animalService.getAnimalList(pageable);

        return ResponseEntity.status(200).body(animals);
    }


    @ApiOperation(value = "동물 상세보기")
    @GetMapping("/{animalNo}")
    public AnimalDetailGetRes animalDetail(@ApiParam(value = "동물키") @PathVariable("animalNo") int animalNo){
        log.info("animalDetail - 호출");
        return animalService.animalDetail(animalNo);
    }

    // /name-list
    @GetMapping("/name-list")
    @ApiOperation(value = "동물 이름 리스트")
    @ApiResponses({
            @ApiResponse(code = 200, message = "성공", response = AnimalListGetRes.class),

    })
    public ResponseEntity<Page<AnimalListGetRes>> getAnimalListByName(@PageableDefault(page = 0, size = 10) Pageable pageable,
                                                                         @ApiParam(value = "동물이름") @PathVariable("animalName") String animalName){

        log.info("productTitle - 호출");
        Page<AnimalListGetRes> animals = animalService.getAnimalListByName(pageable,animalName);

        return ResponseEntity.status(200).body(animals);
    }

    // /my-list

}
