package com.loverikim.exe;

public class Truck extends Car{// Car 클래스를 상속받음
				  // ↑ 자바에서의 상속받는 방법 extends 상속받을 클래스명.
	// 상속은 이층집(그림)개념 기억하기! 부모가 1층 자식이 2층
	// 부모 객체가 먼저 생성, 그 다음 자식 객체가 생성됨.
	
	// 제한사항)************ 다중상속이 안됨 ********************
	// 한번에 한번밖에 안됨
	// private으로 선언되어 있는 메소드나 필드는 상속불가	
	
	// 파이썬에서는 class Truck (Car):
	// 파이썬은 다중상속 가능	
	
	int tire; //타이어 수
	int weight;//트럭 무게
	
	public void setTire(int tire) {
		this.tire = tire;
	}

	public Truck() {
		super("포르쉐",2024,"200,000,000","white"); // 부모클래스의 생성자 호출
		// 상속을 받게 되면 자동호출
	}
	
		
	
}
