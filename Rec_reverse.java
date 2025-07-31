package com;
import java.util.*;

public class Rec_reverse {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		String str=b.next();
		System.out.println(rev(str));
	}
	static String rev(String str) {
		if(str==null||str.length()<=1)
			return str;
		return (str.substring(1)+str.charAt(0));
		
	}

}
