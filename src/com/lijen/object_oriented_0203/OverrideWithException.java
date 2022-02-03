package com.lijen.object_oriented_0203;

import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * 方法重寫的規則之一:
 * 	子類重寫的方法拋出異常後類型不大於父類被重寫的方法拋出的異常類型。
 * 
 * 
 */

public class OverrideWithException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
	private void display(SuperClass s) {
		try {
			s.methods();
		}catch (IOException e){
			e.getMessage();
		}

	}

}

class SuperClass{
	public void methods() throws IOException{
		
	}
}

class SubClass extends SuperClass{
	@Override
	public void methods() throws FileNotFoundException{
		
	}
}
