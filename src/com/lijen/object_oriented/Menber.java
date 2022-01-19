package com.lijen.object_oriented;
/*
 * class中方法(methods)的聲明與使用
 * 
 * 1.方法的聲明:權限修飾符 返回值類型 方法名(型參列表){
 * 		方法主體
 * }
 * 
 * 2.權限修飾符:
 * 		private:只能在class內部使用,在外部被調用時無法被使用。
 * 		public:可以自由調用。
 * 		protected:先省略。
 * 3.返回值類型:
 * 		無返回值的:(如void)
 * 			無須返回值。
 * 		有返回值的:(如int,String,double等等)
 * 			若方法有返回值必須指定返回值的類型,同時方法中需要使用return關鍵字返回值。
 * 4.方法名:屬於標示符,命名要'見名知意',避免混淆。
 * 5.型參:方法可以不設型參,也可設多個型參。
 * 		格式:數據類型1 型參1,數據類型2 型參2,....
 * 
 * 6.return關鍵字的使用:
 * 	 1.使用在方法中
 * 	 2.作用:(1)結束方法
 * 		  (2)針對有返回值的方法,使用"return 值"返回所要的數據。
 * 		  (3)return後面不可以有執行語句。
 * 7.方法使用中,可以調用當前class中的屬性或方法
 * 	 1.遞歸方法:方法調用自己時,需要有明確終止機制,否則可能進入死循環。
 * 	 2.方法中不能定義另一個新的方法。
 * 
 * */

public class Menber {
	public static void main(String[] args) {
		
	}
}

class menbers{
	
	//屬性
	String name;
	int id;
	int age;
	
	//方法
	public void sayHello() {
		System.out.println("hello");
	}
	
	public void invite(String who) {
		System.out.println("邀請了: " + who);
	}
	
	public int getPoint() {
		System.out.println(this.age);
		return this.age;
	}
	
	public int getNumPlusAge(int num){
		int temp = 0;
		temp = num + this.age;
		System.out.println(temp);
		return temp;
	}
	
	
}
