package com.wad.udo.rv.dao;

import java.util.List;

import com.wad.udo.rv.domain.RvInfo;

public interface RvSessionDao {

	public int insertRv(RvInfo rvInfo);
	public int updateRv(RvInfo rvInfo);
	public int deleteRv(int rv_idx);
	public List<RvInfo> selectListByIdx(int idx);
	public List<RvInfo> selectListByBikeAm(int rv_bike, String rv_date1, String rv_date2);
	public List<RvInfo> selectListByBikePm(int rv_bike, String rv_date1, String rv_date2);
	public List<RvInfo> selectList();
	
}
