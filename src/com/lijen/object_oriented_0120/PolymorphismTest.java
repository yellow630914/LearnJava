package com.lijen.object_oriented_0120;

/*
 * 物件導向的特徵之三:多態性
 * 
 * 1.理解多態性:可以理解為一個事物的多種形態
 * 2.何為多態性:
 * 	 物件的多態性:父類引用指向子類的物件
 * 
 * 3.多態的使用:虛擬方法調用
 * 	有了物件的多態性以後,在編譯時,只能調用父類中聲明的方法,但在執行時,我們實際執行的是子類重寫父類的方法。
 * 	總結:編譯->看左邊,執行->看右邊。
 * 
 * 4.多態的使用前提:
 * 	(1)必須要有繼承關係
 *  (2)通常會有方法重寫
 *  
 * 5.多態性不能套用屬性。
 * 
 * instanceof關鍵字的使用:
 * 	a instanceof A:判斷物件a是否是A類的實體化。如果是,返回true。如果不是,返回false。
 * 
 * 使用情境:為了避免在向下轉型時發生ClassCastException的異常。
 * 如果F是A的父類則:a instanceof F也會返回true。
 */

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PolymorphismPerson p1 = new PolymorphismPerson();
		p1.eat();
		
		PolymorphismStudent s1 = new PolymorphismStudent();
		s1.eat();
		s1.age = 16;
		
		//*******************************************
		System.out.println("*******************************************");
		//物件的多態性:父類引用指向子類的物件
		PolymorphismPerson p2 = new PolymorphismStudent();
		//多態的使用:當調用子父類同名的方法時,實際執行的是子類重寫父類的方法,我們稱之為虛擬方法調用。
		p2.eat();
		
//		p2雖然會執行子類重寫的方法,但是他還是一個父類物件,無法使用子類特有的方法。
//		p2.study();
//		雖然他無法使用,但是實際上p2確實加載了study方法,但是因為編譯時聲明的是父類類型,
//		所以編譯會報錯。
		
//		p2如何才能調用子類特有的屬性或方法呢?
//		向下轉型:使用強制轉換類型符號。
		PolymorphismStudent s2 = (PolymorphismStudent)p2;
//		轉換以後就可以使用子類的特有方法了
		s2.study();
		s2.grade = 60;
		
//		但是使用強轉換時是會有風險的,例如:
//		PolymorphismEightPlusNine e1 = (PolymorphismEightPlusNine)p2;
//		e1.smokeWeed();
//		當轉換成一個子類後又轉成另一子類,此時會發生ClassCastException異常。
//		若想規避此種情況可以使用instanceof關鍵字
		
		if(p2 instanceof PolymorphismEightPlusNine) {
			PolymorphismEightPlusNine e1 = (PolymorphismEightPlusNine)p2;
			e1.smokeWeed();
		}
		
		if(p2 instanceof PolymorphismStudent) {
			PolymorphismStudent s3 = (PolymorphismStudent)p2;
			s3.study();
		}
		
//		PolymorphismPerson p3 = new PolymorphismEightPlusNine();
		
		
	}

}
