package com.wad.udo.rv.domain;

import java.util.List;

public class WeekChkInfo {
	
	private List<ChkRvAm> chkRvAmList;
	private List<ChkRvPm> chkRvPmList;
	private List<WeekInfo> weekInfoList;
	
	public List<ChkRvAm> getChkRvAmList() {
		return chkRvAmList;
	}
	public void setChkRvAmList(List<ChkRvAm> chkRvAmList) {
		this.chkRvAmList = chkRvAmList;
	}
	public List<ChkRvPm> getChkRvPmList() {
		return chkRvPmList;
	}
	public void setChkRvPmList(List<ChkRvPm> chkRvPmList) {
		this.chkRvPmList = chkRvPmList;
	}
	public List<WeekInfo> getWeekInfoList() {
		return weekInfoList;
	}
	public void setWeekInfoList(List<WeekInfo> weekInfoList) {
		this.weekInfoList = weekInfoList;
	}
	
	public WeekChkInfo(List<ChkRvAm> chkRvAmList, List<ChkRvPm> chkRvPmList, List<WeekInfo> weekInfoList) {
		this.chkRvAmList = chkRvAmList;
		this.chkRvPmList = chkRvPmList;
		this.weekInfoList = weekInfoList;
	}
	
	public WeekChkInfo() {

	}
	
	
}
