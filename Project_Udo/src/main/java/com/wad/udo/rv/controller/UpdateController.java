package com.wad.udo.rv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wad.udo.rv.domain.RvInfo;
import com.wad.udo.rv.service.UpdateService;

@RestController
public class UpdateController {

	@Autowired
	private UpdateService updateService;

	@CrossOrigin
	@PutMapping("/rv/reservation")
	public ResponseEntity<String> reservation(@RequestBody RvInfo rvInfo){
		
		System.out.println(rvInfo);
		
		int cnt = updateService.updateRv(rvInfo);
		
		return new ResponseEntity<String>(cnt > 0 ? "success" : "fail", HttpStatus.OK);
	}
}
