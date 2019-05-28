package com.overriding;

class BClass extends AClass {
	int a;	//与父类的成员变量名相同，父类的成员变量被隐藏；
	
	public BClass() {
		a = 10;
		a1 = 123.6f;
	}
	
	public void p1() {	//与父类的成员方法相同，此时父类的方法被覆盖； 
		System.out.println("this is a method of B ");
		System.out.println("a=" + a); //此处的a是BClass的变量值
		super.p1(); //通过super关键字调用被覆盖的父类成员方法
		System.out.println("super.a=" + super.a); //通过super关键字访问被隐藏的父类成员变量
	}

}
