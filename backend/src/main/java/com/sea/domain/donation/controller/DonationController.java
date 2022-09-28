package com.sea.domain.donation.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sea.common.model.response.BaseResponseBody;
import com.sea.domain.donation.db.entity.Donation;
import com.sea.domain.donation.dto.DonationDto;
import com.sea.domain.donation.dto.MyDonationDto;
import com.sea.domain.donation.request.DonationRegisterPostReq;
import com.sea.domain.donation.response.MyDonationListGetRes;
import com.sea.domain.donation.service.DonationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/v1/donation")
public class DonationController {

	@Autowired
	DonationService donationService;
	
	
	@ApiOperation(value = "기부하기")
	@PostMapping()
	public ResponseEntity<? extends BaseResponseBody> registerDonation(@RequestBody DonationRegisterPostReq registerInfo){
		
		Donation donation = donationService.createDonation(registerInfo);
		return ResponseEntity.status(200).body(BaseResponseBody.of(200, "Success"));
	}
	
	// READ
	@ApiOperation(value = "내 기부 내역 확인")
	@GetMapping()
	@ApiResponses({ @ApiResponse(code = 200, message = "성공", response = DonationDto.class), })
	public ResponseEntity<? extends BaseResponseBody> getDonationList(@RequestParam(value = "walletAddress") String walletAddress) {
		
		List<MyDonationDto> list = donationService.getDonationList(walletAddress);
		return ResponseEntity.status(200).body(MyDonationListGetRes.of(200, "Success", list));
	}
}
