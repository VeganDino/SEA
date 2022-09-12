package com.sea.domain.animal.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@ApiModel("AnimalDetailGetRes")
public class AnimalDetailGetRes {
	@ApiModelProperty(value = "동물키")
	int animalId;
	
	@ApiModelProperty(value = "동물명")
	String animalName;
	
	@ApiModelProperty(value = "동물학명")
	String animalScientificName;
	
	@ApiModelProperty(value = "동물설명")
	String animalDesc;
	
	@ApiModelProperty(value = "최대nft수량")
	int animalMaxItem;
	
	@ApiModelProperty(value = "남은nft수량")
	int animalNowItem;
	
	@ApiModelProperty(value = "동물이미지")
	String animalImg;
	
	//tinyInt 추가 
	@ApiModelProperty(value = "기부중 여부")
	int animalYn;
	
	@ApiModelProperty(value = "멸종위기등급")
	int animalEndangeredLevel;
	
	@ApiModelProperty(value = "동물종류")
	String animalType;
}
