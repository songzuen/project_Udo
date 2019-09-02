package com.wad.udo.rv.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wad.udo.rv.service.DeleteService;

@RestController
public class DelController {

	@Autowired
	private DeleteService deleteService;
	
	@CrossOrigin
	@DeleteMapping("/rv/delete/{rv_idx}")
	public ResponseEntity<String> reservation(@PathVariable("rv_idx") int rv_idx){
		
		int cnt = deleteService.delService(rv_idx);
		
		System.out.println("삭제 할 번호는 ::::::: " + rv_idx);
		System.out.println("삭제 값은 ::::::: " + cnt);
		
		return new ResponseEntity<String>(cnt > 0 ? "success" : "fail", HttpStatus.OK);
	}
}
