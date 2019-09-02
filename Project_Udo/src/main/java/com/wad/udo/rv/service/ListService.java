package com.wad.udo.rv.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wad.udo.rv.dao.RvSessionDao;
import com.wad.udo.rv.domain.RvInfo;

@Service("listService")
public class ListService {

	@Autowired
	private SqlSessionTemplate template;

	private RvSessionDao dao;

	// 전체 리스트 출력
	public List<RvInfo> selectAllList() {

		dao = template.getMapper(RvSessionDao.class);

		List<RvInfo> list = dao.selectList();

		return list;
	}

	// 회원번호를 통한 리스트 출력
	public List<RvInfo> selectListByIdx(int idx) {

		dao = template.getMapper(RvSessionDao.class);

		List<RvInfo> list = dao.selectListByIdx(idx);

		return list;
	}

	public List<RvInfo> selectListByBikeAm(int rv_bike, String rv_date1, String rv_date2) {

		dao = template.getMapper(RvSessionDao.class);

		List<RvInfo> list = dao.selectListByBikeAm(rv_bike, rv_date1, rv_date2);

		return list;
	}

	public List<RvInfo> selectListByBikePm(int rv_bike, String rv_date1, String rv_date2) {

		dao = template.getMapper(RvSessionDao.class);

		List<RvInfo> list = dao.selectListByBikePm(rv_bike, rv_date1, rv_date2);

		return list;
	}
}
