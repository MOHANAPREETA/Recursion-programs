package com;
import java.util.*;
/*class Node{
	int data;
	Node left,right;
	Node(int value)
{
		data=value;
		left=right=null;
}}*/

public class Rec_postorder {
	Node root;
	void postorderTraversal(Node node) {
		if(node==null) return;
		postorderTraversal(node.left);
		postorderTraversal(node.right);
		System.out.print(node.data+" ");
		
	}

	public static void main(String[] args) {
		Scanner b=new Scanner(System.in);
		Rec_postorder tree=new Rec_postorder();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.postorderTraversal(tree.root);
		
	}

}
