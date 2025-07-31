package com;
import java.util.*;
public class Rec_StringPer {
	 public static void permute(String str) {
	        permuteHelper(str, "");
	    }  
	    private static void permuteHelper(String str, String result) {
	        if (str.isEmpty()) {
	            System.out.println(result);
	            return;
	        }     
	        for (int i = 0; i < str.length(); i++) {
	           
	            char ch = str.charAt(i);
	            String remaining = str.substring(0, i) + str.substring(i + 1);
	            permuteHelper(remaining, result + ch);
	        }
	    }
	public static void main(String[] args) {	
		Scanner b=new Scanner(System.in);
		String str=b.next();
		permute(str);	
	}

}
