package com.monu;

import java.util.ArrayList;
import java.util.List;

class check {
	
	String name;
	check(String s){
		this.name = s;
	}
	
	public String doSuff(String msg) {
		return msg.substring(2);
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,40};
		int key = 30;
		int index = 0;
		boolean isFound = false;
		
		while (index++ < 5 ) {
			if(10 == key) {
				isFound = true;
			}
		}
		
		System.out.println(isFound);
		
		
		
	
	}
}


