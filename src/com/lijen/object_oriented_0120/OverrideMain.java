package com.lijen.object_oriented_0120;

/*
 * override:在子類中重新複寫父類的方法
 * 一、重寫必須方法名與型參列表都一樣。
 * 二、重寫以後,當創建子類物件以後,通過子類物件所調用的同名方法皆為重寫後的方法。
 * 三、重寫的規定:
 * 	(1)方法的聲明:權限修飾符 返回值類型 方法名(型參列表){方法體}
 * 	(2)子類的方法名與型參列表必須都與父類一樣才能重寫。
 * 	(3)重寫中,子類的方法權限修飾符只大於等於父類。public>default>protected
 * 		>特殊情況:子類不可以重寫父類的private方法。若是聲明則視為新的方法。
 * 	(4)返回值類型:
 * 		>重寫中,父類的返回值類型若是void,則子類的返回值類型也必須是void。
 * 		>重寫中,父類的返回值類型若是A類,則子類的返回值類型可以是A類或是A的子類。
 * 		>重寫中,父類的返回值類型若是基本數據類型,則子類的返回值類型也必須是相應的基本數據類型。
 * 	(5)重寫中,子類拋出的異常類型小於等於父類所拋出的異常類型。
 * *********************************************************************************
 * 	子類與父類同名同參數的方法要馬都聲明為非static(重寫),要馬都聲明為static(非重寫)
 * 
 * 面試題: 區分方法的重載與重寫。
 * 重載:同一類中同名並不同型參列表的方法。
 * 重寫:不同類中同名並同型參列表的方法,子類對父類方法的覆蓋。
 */

public class OverrideMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverrideSon son = new OverrideSon();
		OverrideFather father = new OverrideFather();
		
		//子類與父類物件都調用同名的方法,輸出卻不同。
		son.callVersion();
		father.callVersion();
	}

}
