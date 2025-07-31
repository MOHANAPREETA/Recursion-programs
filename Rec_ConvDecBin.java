package com;
import java.util.*;

public class Rec_ConvDecBin {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		if(x==0)
			System.out.println("0");
		else
		Decimal_Binary(x);
	}
	static void Decimal_Binary(int x) {
		if(x==0)
			return ;
		Decimal_Binary(x/2);
		System.out.println(x%2);
	}

}
