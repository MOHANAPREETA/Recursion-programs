package com;
import java.util.*;

public class Rec_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		System.out.println(sum(x));
	}
	static int sum(int x) {
		if(x<=0)
			return 0;		
		return x+sum(x-1);
	}

}
