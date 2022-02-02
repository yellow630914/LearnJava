package com.lijen.object_oriented_0131;
/*
 * 內部類(InnerClass):
 * 	一般使用於,一個類中有一個結構不足以用類的組成要素去概述時,可以使用內部類。
 * 	
 * 1.Java中允許一個類A聲明在另一個類B中,則類A是內部類,類B是外部類。
 * 2.內部類的分類:成員內部類 vs 局部內部類
 * 3.成員內部類:
 * 		一方面,作為外部類的成員:
 * 			-調用外部類的結構,包括private
 * 			-可以被static修飾。
 * 			-可以被4種不同權限修飾(不同於一般的類)
 * 
 * 		另一方面,作為一個類:
 * 			-定義屬性、方法、內部類等...
 * 			-可以用final修飾,意味不能被繼承。
 * 			-可以用abstract修飾,意味不能被實例化。
 * 4.關注3個問題
 * 	(1)如何實例化內部類的對象。
 * 	(2)如何在成員內部類中區分調用外部類的結構。
 * 	(3)開發中如何使用局部內部類。
 */
public class InnerClassIntro {

	public static void main(String[] args) {
		//問題一的體現,如何實例化內部類的對象。
		//靜態成員內部類,Brain的實例化
		Dog.Brain d1b = new Dog.Brain();
		//普通成員內部類,Foot實例化
		Dog d2 = new Dog();
		Dog.Foot d2f = d2.new Foot();
		d2f.walk();
	}

}


class Dog{
	private String name;
	
	
	//成員內部類
	static class Brain{
		
		public void think() {
			System.out.println("思考"); 
		}
	}
	
	class Foot{
		
		public void walk() {
			System.out.println(name + "在走路");
		}
	}
	
	
	
	//方法
	public void method() {
		//局部內部類
		class AA{
			
		}
	}
	//代碼塊
	{
		//局部內部類
		class BB{
			
		}
	}
	//構造器
	public Dog() {
		//局部內部類
		class CC{
			
		}
	}
}