package com;

import java.util.LinkedList;

public class Rec_linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l=new LinkedList<>();
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(8);
		System.out.println(revlist(l));
	}
	static LinkedList<Integer> revlist(LinkedList<Integer> l){
		if(l.isEmpty()) {
			return new LinkedList<>();
		}
		int f=l.removeFirst();
		LinkedList<Integer> n=revlist(l);
		n.addLast(f);
		return n;
		
	}

}
