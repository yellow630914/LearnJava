package com.lijen.object_oriented_0120;

/*
 * super的關鍵字使用
 * 1.super理解為:父類的
 * 2.super可以用來調用: 屬性、方法、構造器
 * 3.super的使用
 * 	(1)我們可以在子類方法或構造器中使用super來顯式的調用父類的屬性或方法。但通常我們習館省略之。
 * 	(2)當子類與父類定義了同名的屬性時,想調用父類的屬性的話,必須顯式的使用"super.屬性"的方式,表明要調用父類的屬性。
 * 	(3)子類重寫了父類的方法後,若想在子類使用父類的方法,必須顯式的使用"super.方法"的方式,表明要調用父類的方法。
 * 4.super調用構造器
 * 	(1)我們可以在子類的構造器中顯式的使用"super(型參列表)"的方式,調用父的的構造器。
 * 	(2)"super(型參列表)"必須聲明在首行!
 * 	(3)在類的構造器中,"this(型參列表)"與"super(型參列表)"只能二選一使用。
 * 	(4)默認情況下,構造器自行聲明"super()"。
 * 	(5)在類的多個構造器中,至少有一個類的構造器使用"super(型參列表)",調用父類中的構造器。
 */

public class SuperIntroAndMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperSon s1 = new SuperSon();
		
		SuperSon s2 = new SuperSon(22,"Tom",22);
	}

}
