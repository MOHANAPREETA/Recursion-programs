package com;
import java.util.*;

public class Rec_inorderTraversal {
	Node root;
	void inorder(Node node) {
		if(node==null)return;
		inorder(node.left);
		System.out.print(node.data+" ");
		inorder(node.right);
	}

	public static void main(String[] args) {
		Rec_inorderTraversal tree=new Rec_inorderTraversal();
		tree.root=new Node(1);
		tree.root.left=new Node(2);
		tree.root.right=new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		tree.inorder(tree.root);
	}

}
