package com.overriding;

class BClass extends AClass {
	int a;	//�븸��ĳ�Ա��������ͬ������ĳ�Ա���������أ�
	
	public BClass() {
		a = 10;
		a1 = 123.6f;
	}
	
	public void p1() {	//�븸��ĳ�Ա������ͬ����ʱ����ķ��������ǣ� 
		System.out.println("this is a method of B ");
		System.out.println("a=" + a); //�˴���a��BClass�ı���ֵ
		super.p1(); //ͨ��super�ؼ��ֵ��ñ����ǵĸ����Ա����
		System.out.println("super.a=" + super.a); //ͨ��super�ؼ��ַ��ʱ����صĸ����Ա����
	}

}
