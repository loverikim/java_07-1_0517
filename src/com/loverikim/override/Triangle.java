package com.loverikim.override;

public class Triangle extends Shape{//Shape 클래스를 상속 받음	

	@Override  //어노테이션 (명시하다)
	public void areaPrint() {
		// TODO Auto-generated method stub
		super.areaPrint(); // 부모클래스에서 정의된 원본 메소드 호출
		System.out.println(width * height * 0.5);
	}

//	@Override
//	public void namePrint() {
//		// TODO Auto-generated method stub
//		System.out.println("도형이름: Triangle");
//	}	
		
//  상속받은 메소드를 호출하여 내용을 고침.
//	public void areaPrint() { // 오버라이딩 --> 삼각형 넓이 출력.
//		System.out.println(width * height * 0.5);
//	}
		
	
}
