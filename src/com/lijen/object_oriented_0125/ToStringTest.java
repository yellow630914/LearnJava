package com.lijen.object_oriented_0125;
/* Object類中的toString()的使用:
 * 
 * 1.當我們輸出一個物件的引用時,實際上就是調用當前物件的toString()
 * 
 * 2.Object的toString():
 * 		public String toString() {
 *      	return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *  	}
 * 3.String,Date,File,包裝類等等,都重寫了Object類中的toString方法。
 * 	 使得調用物件的toString()都能返實體內容。
 * 4.自定義類也可以重寫toString()的內容。
 * 
 * 
 * 
 * 
 */
public class ToStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("Adan",15);
		System.out.println(p1.toString()); //com.lijen.object_oriented_0125.Person@b4c966a --> Person[name = Adan,age = 15]
		System.out.println(p1); //com.lijen.object_oriented_0125.Person@b4c966a --> Person[name = Adan,age = 15]
		
		String str = new String("MM");
		System.out.println(str); //MM
	}

}
