package com.abhio.springApp;

public class ReturnObject {
	
	private String str1;
	private int int1;

	public ReturnObject(String str, int in) {
		this.int1 = in;
		this.str1 =str;
	}

	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public int getInt1() {
		return int1;
	}

	public void setInt1(int int1) {
		this.int1 = int1;
	}
	
	

}
