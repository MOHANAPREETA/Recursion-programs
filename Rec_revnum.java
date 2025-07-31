package com;
import java.util.*;
public class Rec_revnum {
	public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	int x=b.nextInt();
	System.out.println(revnum(x,0));
	}
	static int revnum(int x,int rev) {
		if(x==0)
			return rev;
		return  revnum(x/10,rev*10+x%10);		
	}
}
