package com;
import java.util.*;

public class Rec_factorial {

	public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        int x=b.nextInt();
        System.out.println(rec_factorial(x));
	}
	static int rec_factorial(int x) {
		if(x==0)
			return 0;
		return x*rec_factorial(x-1);
		
	}

}
