package com.loverikim.test01;

public class Child extends Parent{

		private int studentNo;
		
//		public Child(String name, int studentNo) {
////			super("홍길동"); // 부모클래스의 생성자를 반드시 호출!
//			
//			this.name = name;
//			this.studentNo=studentNo;
//			
//		}
		public Child(String name, int studentNo) {
			super(name);
			this.studentNo = studentNo;			
		}
		// 기본생성자가 생략된 상태
		// 기본 생성자가 만들어 지지 않은 상태.
		// 인수가 없는 생성자는 사용을 못하고 없어짐.

		
}
