package com.overriding;

class AClass {
	int a;
	float a1;
	
	public AClass() {	//���췽��
		a = 50;
		a1 = 99.99f;
	}
	
	public void p1() {		//��Ա����
		System.out.println("this is a method of A ");
		System.out.println("a=" + a);
	}

}
