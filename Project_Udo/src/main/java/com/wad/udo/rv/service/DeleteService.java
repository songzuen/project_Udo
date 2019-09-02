package com.wad.udo.rv.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wad.udo.rv.dao.RvSessionDao;

@Service("delService")
public class DeleteService {

	@Autowired
	private SqlSessionTemplate template;
	
	private RvSessionDao dao;
	
	public int delService(int rv_idx) {
		
		dao = template.getMapper(RvSessionDao.class);
		
		int rCnt = dao.deleteRv(rv_idx);
		
		System.out.println("삭제 결과값은 "+rCnt);
		
		return rCnt;
	}
}
