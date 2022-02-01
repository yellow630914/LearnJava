package com.lijen.object_oriented_0131;

/*
 * 接口(介面)interface:
 * 	interface是一個與class並列的結構。
 * 	不同於繼承,接口是可以與多個類連接,若兩個類皆連接到同一個接口,意味著兩者具有相同的特徵。
 * 	例如:滑鼠與鍵盤都可以使用USB,兩者皆可以有USB這個特徵,但是並不意味著兩者都是USB的子類。
 * 
 * 接口的使用:
 * 1.用interface來定義
 * 2.如何定義接口:定義接口中的成員
 * 	(1)JDK7及以前:只能定義全局常量與抽象方法
 * 		-全局常量:public static final的(可以省略,只要是存在於接口中的屬性皆是全局常量)
 * 		-抽象方法:public abstract的(可以省略,只要是存在於接口中的方法皆是抽象方法,必須沒有方法體)
 * 	(2)JDK8:除了定義全局常量和抽象方法之外,還可以定義靜態方法與默認方法。
 * 3.接口不能定義構造器,意味著接口不可實例化。
 * 4.Java開發中,接口通過讓類去實現(implements)的方式來使用。
 * 	 如果實現類覆蓋了接口中所有的抽象方法,則此類可以實例化。
 * 	 如果實現類沒有覆蓋接口中所有的抽象方法,則此類是為一個抽象類。
 * 5.Java類可以實現多個接口 --->彌補了Java的單繼承的侷限性。
 * 	格式:class AA extends BB implements CC,DD,EE
 * 6.接口與接口之間是可以繼承的,且是多繼承。
 * ----------------------------------------------------------------------------------------
 * 7.接口的具體使用,體現多態性。
 * 8.接口實際上可以看作一種規範。
 * 9.開發中,體會面向接口編程。
 * ----------------------------------------------------------------------------------------
 * 10.可以匿名實現類與物件
 * 題目:接口與抽象類有何異同?
 */

public class InterfaceIntro {

	public static void main(String[] args) {
		//1.創建了接口的非匿名實現類的非匿名物件
		Plane p = new Plane();
		p.fly();
		
		//2.創建了接口的非匿名實現類的匿名物件
		new Plane().fly();
		
		//3.創建了接口的匿名實現類的非匿名物件
		Flyable bird = new Flyable() {
			@Override
			public void fly() {
				System.out.println("鳥飛");
			}
			@Override
			public void stop() {
				System.out.println("鳥停");
			}
		};
		bird.fly();
		//4.創建了接口的匿名實現類的匿名物件
		new Flyable() {
			@Override
			public void fly() {
				System.out.println("神秘飛飛");
			}
			@Override
			public void stop() {
				System.out.println("神秘停止");
			}
		}.fly();
	}

}
//可移動接口
interface Movable{
	void move();
}

//可以飛繼承可移動
interface Flyable extends Movable{
	//全局常量
	public static final int MAX_SPEED = 7900; //第一宇宙速度
	//省略了
	public static final int MIN_SPEED = 1;
	
	//抽象方法
	public abstract void fly();
	//省略了
	void stop();
	
	@Override
	default void move() {
		// TODO Auto-generated method stub
		System.out.println("飛著移動");
	}
}
//可攻擊接口
interface Attackable{
	void attack();
}
//用Plane實現"可以飛接口"
class Plane implements Flyable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("飛機起飛");
	}
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("飛機降落");
	}
}

//先繼承再實現
class Bullet extends Object implements Flyable,Attackable{
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("子彈擊出");
	}
	
	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("子彈擊中");
	}
	
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("物理傷害");
	}
}
