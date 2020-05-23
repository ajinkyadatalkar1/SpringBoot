package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class aliean {
	private int aid;
	private String aName;
	@Autowired
	@Qualifier("computer")
	private laptop lappy;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	
	public void compiling() {
		System.out.println("Calling Component!");
		lappy.nameCalling();
	}
}
