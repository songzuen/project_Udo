package com.wad.udo.rv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wad.udo.rv.domain.RvInfo;
import com.wad.udo.rv.service.ListService;

@RestController
public class ListController {

	@Autowired
	private ListService service;
	
	//admin이 자신의 예약정보 조회
	@CrossOrigin
	@GetMapping("/rv/list/allList")
	public ResponseEntity<List<RvInfo>> getAllList() {

		List<RvInfo> list = service.selectAllList();

		ResponseEntity<List<RvInfo>> entity = new ResponseEntity<List<RvInfo>>(list, HttpStatus.OK);

		return entity;
	}

	//회원이 자신의 예약 정보 조회
	@CrossOrigin
	@GetMapping("/rv/list/myRvList/{idx}")
	public ResponseEntity<List<RvInfo>> getBikeIdx(@PathVariable("idx") int idx) {
		
		List<RvInfo> list = service.selectListByIdx(idx);

		ResponseEntity<List<RvInfo>> entity = new ResponseEntity<List<RvInfo>>(list, HttpStatus.OK);

		return entity;
	}
}
