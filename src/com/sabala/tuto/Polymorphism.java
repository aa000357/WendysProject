package com.sabala.tuto;

/**
 * 多型範例
 * @author Jimmy
 *
 */
public class Polymorphism {

	public static void main(String[] args) {
		
		// 在有繼承關係下的
		A aa = new A();
		A a = new C();
		a.show();
		aa.show();
		
		// 在有共同實作介面(interface)下的
		X x = new Y();
		x.imNotShow();
		x = new Z();
		x.imNotShow();
		
		// 修改範例日期為 2017/09/11 00:41:12
		// 我累累了，該睡覺了。 看不懂的我有空再補。
		
	}
}

//====================共同繼承類別====================
class C extends A {
	public void show() {
		System.out.println("3");
	}
}


class B extends A {

	public void show() {
		System.out.println("2");
	}
	
	public void showLa() {
		
	}
	
}

class A {
	
	public void show() {
		System.out.println("1");
	}
	
}

// ====================共同實作介面====================

interface X {
	
	public void imNotShow();
	
}

class Y implements X{

	@Override
	public void imNotShow() {
		System.out.println("Y");
	}

}

class Z implements X{

	@Override
	public void imNotShow() {
		System.out.println("Z");
	}
	
}