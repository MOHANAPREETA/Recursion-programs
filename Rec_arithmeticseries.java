package com;
import java.util.*;

public class Rec_arithmeticseries {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int n=b.nextInt();
		System.out.println("Sum : "+arithseries(n));
	}
	static int arithseries(int n) {
		if(n==1)
			return 1;
		return n+arithseries(n-1);
	}

}
