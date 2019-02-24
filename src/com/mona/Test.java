package com.mona;

import com.monu.*;


public class Test {
	
	
	public String doSuff(String msg) {
		return msg.substring(2);
	}
	public static void main(String[] args) {

		Test t = new Test();
		System.out.println(t.doSuff("JAVA"));
	
	}
}


