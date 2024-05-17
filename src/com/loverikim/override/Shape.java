package com.loverikim.override;

public class Shape {
	
	int width=10; // 가로길이
	int height=20;// 세로길이
	
	//너비를 출력해주는 메소드
	public void areaPrint() {
		System.out.println(this.width * this.height);
	}
	
	public final void namePrint() { //final 키워드가 메소드선언에 추가되면 해당 메소드는 오버라이딩 사용불가
		System.out.println("도형:shape");
	}
	
}
