package com.lijen.object_oriented_0131;
/*
 * JDK8的Interface:除了定義全局常量和抽象方法之外,還可以定義靜態方法與默認方法。
 * 靜態方法:只能直接透過接口使用。
 * 默認方法:可以在實現類的物件調用,若未重寫,則執行默認方法的方法體。
 */
public class InterfaceJDK8Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubClass s = new SubClass();
		
//		1.接口中的靜態方法只能由接口本身調用。
//		s.methods1();
		
//		通過實現類的物件能夠調用接口的默認方法。
//		2.實現類是可以重寫默認方法的。
		s.methods2(); //重寫後的默認方法
//		3.如果子類繼承了父類與實現接口同名同參的方法,則優先以父類的方法執行。 -->類優先原則
		s.methods3(); //父類的方法
//		4.如果實現類實現了多個接口,而這多個接口有同名同參的方法,則會報錯。
//		此時則必需在實現類重寫此方法。
		s.myMethods();
	}

}

interface CompareA{
	//靜態方法:只能直接透過接口使用。
	public static void methods1() {
		System.out.println("靜態方法");
	}
	//默認方法:
	public default void methods2() {
		System.out.println("默認方法");
	}
	public default void methods3() {
		System.out.println("默認方法");
	}
}

class SuperClass{
	public void methods3() {
		System.out.println("父類的方法");
	}
}

class SubClass extends SuperClass implements CompareA{
	@Override
	public void methods2() {
		// TODO Auto-generated method stub
		System.out.println("重寫後的默認方法");
	}
	
//	5.如何在子類(實現類)調用父類(接口)中被重寫的方法。
	public void myMethods() {
		CompareA.super.methods2();
	}
}

