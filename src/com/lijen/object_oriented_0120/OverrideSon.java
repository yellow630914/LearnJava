package com.lijen.object_oriented_0120;

public class OverrideSon extends OverrideFather {
	//重寫父類的callVersion方法
	public void callVersion() {
		System.out.println("this is Version 2.0!");
	}
	//用更高的權限修飾符去複寫是被允許的
	public void defaultMethod() {
		System.out.println("this is public Method!");
	}
	/*用較低的權限複寫則會報錯。
	protected void defaultMethod() {
		System.out.println("this is public Method!");
	}
	*/
}
