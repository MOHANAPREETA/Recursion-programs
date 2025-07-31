package com;
import java.util.*;

public class Rec_bubblesort {

	public static void main(String[] args) {
		int arr[]= {3,7,4,9,0};
		rec_bubble(arr,arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	static void rec_bubble(int[]arr,int x) {
		if(x==1)
			return;
		for(int i=0;i<x-1;i++) {
			if(arr[i]>arr[i+1]) {
				int temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}}
		
		
		
		rec_bubble(arr,x-1);
		
	}

}
