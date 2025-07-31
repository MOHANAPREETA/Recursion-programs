package com;
import java.util.*;
public class Rec_countdowm {
	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		count_rev(x);
	}
	static void count_rev(int x) {
		if(x<0)
			return;	
		System.out.println(x+" ");
		count_rev(x-1);
	}

}
