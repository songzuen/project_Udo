package com.wad.udo.rv.domain;

public class WeekInfo {
	
	private int year;
	private int month;
	private int date;
	private int day;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
	
	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public WeekInfo(int year, int month, int date, int day) {
		this.year = year;
		this.month = month;
		this.date = date;
		this.day = day;
	}
	
	public WeekInfo() {

	}

	@Override
	public String toString() {
		return "WeekInfo [year=" + year + ", month=" + month + ", date=" + date + ", day=" + day + "]";
	}
	
	public String toStringDate() {
		
		String year = Integer.toString(this.year);
		String month = "";
		String date = "";

		//month가 1에서 9일 때, 앞에 0 붙여주기(js의 Date 형식에 맞춰주기)
		if(this.month > 0 && this.month < 11) {
			month += "0";
		}
		
		month += Integer.toString(this.month);
		
		
		//date가 1에서 9일 때, 앞에 0 붙여주기(js의 Date 형식에 맞춰주기)
		if(this.date > 0 && this.date < 11) {
			date += "0";			
		}
		
		date += Integer.toString(this.date);
		
		return  year + "-" + month + "-" + date;
	}
	
}