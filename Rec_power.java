package com;
import java.util.*;
public class Rec_power {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int p=b.nextInt();
		System.out.println(power(x,p));
	}
	static int power(int x,int p) {
		if(p==0)
			return 1;
		return x*power(x,p-1);
		
	}

}
