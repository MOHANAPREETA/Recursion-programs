package com;
import java.util.*;
public class Rec_digitToword {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		Digit_To_word(x);

	}
	static void Digit_To_word(int x) {
		if(x==0) {
			System.out.println("Zero");
		    return;}
		printdigit(x);    
	}
	static void printdigit(int x) {
		if(x==0) return;
		printdigit(x/10);
		int digit=x%10;
		System.out.println(getword(digit)+" ");
	}
	static String getword(int digit) {
		String[] words= {"Zero","One","two","three", "four",
	            "five", "six", "seven", "eight", "nine"};
		return words[digit];
	}

}
