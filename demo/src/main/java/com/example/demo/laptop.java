package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class laptop {
	private int Lid;
	private String brand;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void nameCalling() {
		System.out.println("From laptop class");
	}
	
}
