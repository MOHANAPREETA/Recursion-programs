package com;
import java.util.*;

public class Rec_fibonacci {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		for(int i=0;i<x;i++) {
			System.out.println(fibo(i)+" ");
		}}
		static int fibo(int x) {
			if(x==0)
				return 0;
			else if(x==1)
				return 1;
			else
				return fibo(x-1)+fibo(x-2);
			
			
		}

	


}
