package com;
import java.util.*;

public class Rec_countLeaf {
        Node root;

	static int countleaf(Node node) {
		if(node==null)
			return 0;
		if(node.left==null&&node.right==null) {
			return 1;
		}return countleaf(node.left)+countleaf(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rec_countLeaf tree=new Rec_countLeaf();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		System.out.println(tree.countleaf(tree.root));

	}

}
