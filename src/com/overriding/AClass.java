package com.overriding;

class AClass {
	int a;
	float a1;
	
	public AClass() {	//构造方法
		a = 50;
		a1 = 99.99f;
	}
	
	public void p1() {		//成员方法
		System.out.println("this is a method of A ");
		System.out.println("a=" + a);
	}

}
