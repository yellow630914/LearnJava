package com.lijen.object_oriented_0131;

import java.util.Iterator;

/*
 * 模板方法設計模式(TemplateMethod)
 * 	-再軟體開發中實現一個算法十,整體不造已經固定通用了,這些步驟已經在父類中寫好了。
 * 	 但某些部分是易變的,易變的部分可以通過抽象出來,再去給子類實現。
 */

public class TemplateMethodIntro {
	public static void main(String[] args) {
		
		Template t = new SubTemplate();
		t.spendTime();
		
	}
}

abstract class Template{
	//計某段代碼,所花費的時間。
	public void spendTime() {
		long start = System.currentTimeMillis();
		
		this.code ();//不確定的,易變的。
		
		long end = System.currentTimeMillis();
		
		System.out.println("花費時間為: " + (end - start));
	}
	
	public abstract void code(); 
}

class SubTemplate extends Template{
	@Override
	public void code() {
		
		for(int i = 2;i <= 1000;i++) {
			boolean isFlag = true;
			for(int j = 2;j <= Math.sqrt(i);j++) {
				if(i % j == 0) {
					isFlag = false;
					break;
				}
			}
			if(isFlag) {
				System.out.println(i);
			}
		}
		
	}
}