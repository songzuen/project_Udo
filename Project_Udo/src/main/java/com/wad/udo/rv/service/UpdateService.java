package com.wad.udo.rv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wad.udo.rv.dao.RvSessionDao;
import com.wad.udo.rv.domain.RvInfo;

@Service("updateService")
public class UpdateService {
	
	@Autowired
	private SqlSessionTemplate template;
	
	private RvSessionDao dao;

	public int updateRv(RvInfo rvInfo) {
		
		dao = template.getMapper(RvSessionDao.class);
		
		int rCnt = dao.updateRv(rvInfo);
		
		System.out.println("업데이트 결과값은 "+rCnt);
		
		return rCnt;
	}
}
