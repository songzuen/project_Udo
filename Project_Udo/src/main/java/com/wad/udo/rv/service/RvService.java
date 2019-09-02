package com.wad.udo.rv.service;

import javax.servlet.http.HttpServletRequest;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wad.udo.rv.dao.RvSessionDao;
import com.wad.udo.rv.domain.RvInfo;
import com.wad.udo.rv.domain.RvRegInfo;

@Service("reservationService")
public class RvService {

	@Autowired
	private SqlSessionTemplate template;
	
	private RvSessionDao dao;
	
	public int insertRv(RvRegInfo regInfo, HttpServletRequest request, int idx) {
		
		dao = template.getMapper(RvSessionDao.class);
		
		RvInfo rvInfo = regInfo.toRvInfo();
		
		rvInfo.setIdx(idx);
		
		int rCnt = dao.insertRv(rvInfo);

		System.out.println("예약 결과값은 "+rCnt);
		
		return rCnt;
	}

}
