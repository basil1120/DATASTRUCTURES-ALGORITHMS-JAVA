package com.basiljereh.hackerank.basic;

import java.util.Stack;

import com.basiljereh.hackerank.datastructures.BinarySearchTree; 
/** * Java Program to implement a binary search tree. A binary search tree is a 
 * * sorted binary tree, where value of a node is greater than or equal to its 
 * * left the child and less than or equal to its right child. 
 * * * @author WINDOWS 8 * */


public class BST {
	
	public static void main(String args[]) {
		BST b = new BST();
		//b.insert(3);b.insert(8);
		//b.insert(1);b.insert(4);b.insert(6);b.insert(2);b.insert(10);b.insert(9);
		//b.insert(20);b.insert(25);b.insert(15);b.insert(16);
		System.out.println("Original Tree : ");
		//b.display(b.root);		
		//System.out.println("");
		//System.out.println("Check whether Node with value 4 exists : " + b.find(4));
		//System.out.println("Delete Node with no children (2) : " + b.delete(2));		
		//b.display(root);
		//System.out.println("\n Delete Node with one child (4) : " + b.delete(4));		
		//b.display(root);
		//System.out.println("\n Delete Node with Two children (10) : " + b.delete(10));		
		//b.display(root);
	}
	
	private static class Node { 
		private int data; 
		private Node left, right; 
		public Node(int value) { 
			data = value; left = right = null;
		} 	
	} 
	
	private Node root; 
	public BST() { 
		root = null; 
	} 
	
	public Node getRoot() { 
		return root; 
	} 
	/** * Java function to check if binary tree is empty or not
	 *  * Time Complexity of this solution is constant O(1) for 
	 *  * best, average and worst case. 
	 * * * @return true if binary search tree is empty */ 
	public boolean isEmpty() {
		return null == root;
	} 
	/** * Java function to return number of nodes in this binary search tree. 
	 * * Time complexity of this method is O(n) * @return size of this binary search tree 
	 * */ 
	public int size() { 
		Node current = root; 
		int size = 0; 
		Stack<Node> stack = new Stack<Node>(); 
		while (!stack.isEmpty() || current != null) { 
			if (current != null) { stack.push(current); 
			    current = current.left; } 
			else {
				size++; current = stack.pop(); 
				current = current.right; 
			} 
		} 
		return size; 
	} 
	/** * Java function to clear the binary search tree. 
	 * * Time complexity of this method is O(1) */ 
	public void clear() { 
		root = null; 
	}
}
