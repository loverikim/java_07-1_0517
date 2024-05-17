package com.loverikim.exe;

public class Car {
	
	String modelName;
	int modelYear;
	String horsePower;
	String color;
	
	public void printModel() {
		System.out.println("자동차 모델명: " + this.modelName);
	}

	public Car() {
		System.out.println("Car클래스(부모클래스) 생성자 호출됨!!");
	}
	
	
	// 필드를 이용한 생성자
	public Car(String modelName, int modelYear, String horsePower, String color) {
		super();
		this.modelName = modelName;
		this.modelYear = modelYear;
		this.horsePower = horsePower;
		this.color = color;
	}
	
	
	
	
}
