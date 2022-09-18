package com.sea.domain.animal.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AnimalImagePostReq {
	int animalId;
	String animalEnglishName;
	String animalKoreanName;
}
