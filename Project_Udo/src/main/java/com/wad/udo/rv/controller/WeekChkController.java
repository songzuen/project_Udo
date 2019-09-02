package com.wad.udo.rv.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wad.udo.rv.domain.ChkRvAm;
import com.wad.udo.rv.domain.ChkRvPm;
import com.wad.udo.rv.domain.WeekChkInfo;
import com.wad.udo.rv.domain.WeekInfo;
import com.wad.udo.rv.service.WeekChkService;

@RestController
public class WeekChkController {

	@Autowired
	private WeekChkService service;
	
	@CrossOrigin
	@GetMapping("/rv/weekChk/{rv_bike}")
	public ResponseEntity<WeekChkInfo> getWeek(@PathVariable("rv_bike") int rv_bike) {
		
		List<WeekInfo> weekInfoList = service.getWeekInfo();
		List<ChkRvAm> chkRvAmList = service.getChkRvAm(rv_bike);
		List<ChkRvPm> chkRvPmList = service.getChkRvPm(rv_bike);
		
		WeekChkInfo weekChkInfo = new WeekChkInfo();
		
		weekChkInfo.setWeekInfoList(weekInfoList);
		weekChkInfo.setChkRvAmList(chkRvAmList);
		weekChkInfo.setChkRvPmList(chkRvPmList);
		
		ResponseEntity<WeekChkInfo> entity = new ResponseEntity<WeekChkInfo>(weekChkInfo, HttpStatus.OK);
		
		return entity;
	}
}
