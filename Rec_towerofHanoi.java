package com;
import java.util.*;

public class Rec_towerofHanoi {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		tower_of_hanoi(x,'A','C','B');

	}
	static void tower_of_hanoi(int x,char from_to,char to_rod,char aux) {
		if(x==0) {
			return ;}
		tower_of_hanoi(x-1,from_to,aux,to_rod);
		System.out.println("Disk "+x+" from "+from_to+" to "+to_rod);
		tower_of_hanoi(x-1,aux,to_rod,from_to);
		
		
	}

}
