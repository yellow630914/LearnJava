package com.lijen.object_oriented_0114;

/*
 * 物件導向特徵一: 封裝與隱藏
 * 
 * 一、問題的引入:
 * 		當我們創建一個類的物件時,我們可以通過"物件.屬性"進行賦值,這個賦值操作必須受到資料型別與存儲範圍的制約,除此之外沒有其他特別條件。
 * 		但是在現實中我們往往需要在給屬性賦值時,給予一些條件,這個條件無法在屬性聲明時達成,所以我們只能通過方法進行限制。(如setLegs())
 * 		同時,我們需要避免用戶使用"物件.屬性"進行賦值,所以也要將屬性使用private修飾。
 * 
 * 二、封裝性的體現:
 * 		(1)我們將類的屬性私有化(private),同時提供公共(public)的方法讓用戶取得(get)或設置(set)。
 * 		(2)只在內部調用的方法。
 * 		(3)單例模式
 * 		...
 * 
 * 		高內聚:類的內部操作細節自己完成,不允許外部干涉。
 * 		低耦合:僅對外曝露少量方法用於使用。
 * 
 * 三、封裝性的體現,需要權限修飾符來配合。
 * 		1.Java規定的四種權限:private、default、protected、public,以下為權限的概圖。
 * 			|修飾符		|類內部	|同一個package		|不同package的子class	|同一個工程
 * 			|private	|yes	|no					|no					|no
 * 			|default	|yes	|yes				|no					|no
 *			|protected 	|yes	|yes				|yes				|no
 * 			|public		|yes	|yes				|yes				|yes
 * 		2.4種權限可以用來類的內部結構:屬性、方法、構造器、內部類。
 * 		  而類只能用default或public修飾。
 */

public class EncapsulationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Animal();
		
		a.setLegs(6);
		a.show();
		
//		legs被private修飾了,所以legs無法被直接調用
//		a.legs = 2;
		a.setAge(20);
		a.setName("Giovani GioGio");
		System.out.println("得到腿的值:" + a.getLegs());
		System.out.println("得到年齡的值:" + a.getAge());
		System.out.println("得到名字的值:" + a.getName());
	}

}

class Animal{
	String name;
	int age;
	private int legs;
	
//	因為legs無法被直接調用,為了修改legs所以使用方法去設定。
	public void setLegs(int l) {
		if(l >= 0 && l % 2 == 0) {
			legs = l;
		}else {
			System.out.println("腿數異常");
		}
	}
	public int getLegs() {
		return legs;
	}
	
	public void setAge(int a) {
		if(a >= 0) {
			age = a;
		}else {
			System.out.println("年齡異常");
		}
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		if(n != null) {
			name = n;
		}else {
			System.out.println("未輸入名稱");
		}
	}
	public String getName() {
		return name;
	}
	
	
	public void eat() {
		System.out.println("進食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age + ",legs = " + legs);
	}
}
