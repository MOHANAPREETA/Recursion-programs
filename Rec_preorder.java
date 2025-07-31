package com;
import java.util.*;
class Node{
	int data;
	Node left,right;
	Node(int value)
{
		data=value;
		left=right=null;
}}
public class Rec_preorder {
     Node root;
     void preorderTraversal(Node node) {
    	 if(node==null) return ;
    	 System.out.print(node.data+" ");
    	 preorderTraversal(node.left);
    	 preorderTraversal(node.right);
    	 
     }
	public static void main(String[] args) {
		Rec_preorder tree=new Rec_preorder();
		// TODO Auto-generated method stub
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.preorderTraversal(tree.root);
		
		
	}

}
