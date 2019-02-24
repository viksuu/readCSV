package com.monu;

public class Purse {

	String note;
	String coin;
	String card;
	
	public static void main(String[] args) {
		
		Purse wallet1 = new Purse();
		Purse wallet2 = new Purse();
		
		wallet1.note = "Two Hundred Rupee";;
		wallet1.coin = "One Ruppee";
		wallet1.card =  "Axis debit card";
		
		
		wallet2.note = "One Hundred Rupee";;
		wallet2.coin = "two Ruppee";
		wallet2.card =  "HDFC debit card";
		
		System.out.println(wallet1.note);
		
		
		
	}
	
	
}
