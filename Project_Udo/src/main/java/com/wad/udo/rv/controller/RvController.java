package com.wad.udo.rv.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wad.udo.rv.domain.RvRegInfo;
import com.wad.udo.rv.service.RvService;

@RestController
public class RvController {

	@Autowired
	private RvService rvService;

	@CrossOrigin
	@PostMapping("/rv/reservation/{idx}")
	public ResponseEntity<String> reservation(RvRegInfo regInfo, HttpServletRequest request, @PathVariable("idx") int idx) {
		
		System.out.println(regInfo);
		
		int cnt = rvService.insertRv(regInfo, request, idx);

		return new ResponseEntity<String>(cnt > 0 ? "success" : "fail", HttpStatus.OK);
	}
}
