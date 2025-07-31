package com;
import java.util.*;

public class Rec_BST {

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		int x=b.nextInt();
		int[]arr=new int[x];
		for(int i=0;i<x;i++) {
			arr[i]=b.nextInt();
		}
		int k=b.nextInt();
		int res=recbst(arr,0,arr.length-1,k);
		if(res!=-1)
			System.out.println("Found : "+res);
		else
			System.out.println("Not Found");
	}
	static int recbst(int[]arr,int left,int right,int key) {
		if(left>right)
			return -1;
		int mid=left+(right-left)/2;
		if(arr[mid]==key)
			return mid;
		else if(arr[left]>key)
			return recbst(arr,left,mid-1,key);
		else
			return recbst(arr,mid+1,right,key);
	}

}
