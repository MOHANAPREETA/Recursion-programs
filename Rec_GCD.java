package com;
import java.util.*;

public class Rec_GCD {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int a=b.nextInt();
		int c=b.nextInt();
		System.out.println(GCD(a,c));
	}
	static int GCD(int a,int c) {
		if(c==0)
			return a;
		return GCD(c,a%c);
	}

}
