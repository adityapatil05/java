package dsa.tree;

import java.util.ArrayDeque;
import java.util.Deque;

class BinaryTree {
	Node root;

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public void insert(int data) {
		Node newNode = new Node(data);

		Node temp = root;
		if (root == null) {
			root = newNode;
			return;

		}
		while (true) {
			if (newNode.data < temp.data) {
				if (temp.left == null) {
					temp.left = newNode;
					break;
				}

				temp = temp.left;
			} else {
				if (temp.right == null) {
					temp.right = newNode;
					break;
				}
				temp = temp.right;
			}
		}

	}

	public void insertOther(int data) {
		Node newNode = new Node(data);

		if (root == null) {
			root = newNode;
			return;
		}

		Node current = root;
		Node parent = null;
		while (current != null) {
			parent = current;
			if (newNode.data < current.data) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		if (newNode.data < parent.data) {
			parent.left = newNode;
		} else {
			parent.right = newNode;
		}
	}

	public void inOrder() {
		inOrder(root);
	}

	private void inOrder(Node root) {

		if (root == null)
			return;

		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);

	}

	public void preOrder() {
		preOrder(root);
	}

	private void preOrder(Node root) {
		if (root == null)
			return;

		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);

	}

	public void postOrder() {
		postOrder(root);
	}

	private void postOrder(Node root) {
		if (root == null) {
			return;
		}

		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");

	}

	public void maxData() {

		if (root == null)
			return;
		Node current = root;
		while (current.right != null) {

			current = current.right;
		}
		System.out.println(current.data + " ");

	}

	public void minData() {
		if (root == null) {
			return;
		}
		Node current = root;
		while (current.left != null) {
			current = current.left;
		}
		System.err.println(current.data + " ");
	}

	public void inorderItrevative() {

		Deque<Node> stack = new ArrayDeque<Node>();

		Node current = root;

		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			System.out.print(current.data + " ");
			current = current.right;
		}
	}

	public void preOrderIterative() {
		Deque<Node> stack = new ArrayDeque<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			Node currentNode = stack.pop();
			System.out.print(currentNode.data + " ");
			if (currentNode.right != null)
				stack.push(currentNode.right);

			if (currentNode.left != null)
				stack.push(currentNode.left);
		}

	}

//	public void postOrderIterative() {
//		Deque<Node> stack = new ArrayDeque<BinaryTree.Node>();
//
//		Node currentNode = root;
//		Node parentNode = null;
//		while (!stack.isEmpty() || currentNode != null) {
//
//			while (currentNode != null) {
//				stack.push(currentNode);
//				currentNode = currentNode.left;
//			}
//			while (currentNode!= null) {
//				stack.push(currentNode.right);
//				currentNode = currentNode.right;
//
//			}
//			System.out.print(currentNode.data + " ");
//		}
//	}

	public void kthSmalledtNumber(int k) {

		Deque<Node> stack = new ArrayDeque<Node>();

		int count = 0;
		Node current = root;

		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			count++;
			if (count == k)
				System.out.print(current.data + " ");
			current = current.right;
		}

	}

	public void height() {
		System.out.println(height(root));

	}

	private int height(Node root) {
		if (root == null)
			return 0;

		int left = height(root.left);
		int right = height(root.right);

		return Math.max(left, right) + 1;
	}

	public boolean search(int key) {
		Deque<Node> stack = new ArrayDeque<Node>();

		int count = 0;
		Node current = root;

		while (!stack.isEmpty() || current != null) {
			while (current != null) {
				stack.push(current);
				current = current.left;
			}

			current = stack.pop();
			if (current.data == key)
				return true;
			current = current.right;
		}
		return false;
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();

		bt.insertOther(50);
		bt.insertOther(30);
		bt.insertOther(20);
		bt.insertOther(40);
		bt.insertOther(60);
		bt.insertOther(80);
		bt.insertOther(90);
		bt.insertOther(10);

		System.out.println("The element is display in inorder");
		bt.inorderItrevative();
		System.out.println("*******************");
		bt.preOrderIterative();
		System.out.println("*************");
		bt.preOrder();
		bt.inOrder();
		bt.inOrder();
		bt.inOrder();
		System.out.println("****************");
//		bt.postOrderIterative();
		System.out.println("************");
		bt.postOrder();
		System.out.println("************");
		bt.kthSmalledtNumber(9);
		System.out.println("************");

		bt.height();
		System.out.println("************");
		System.out.println(bt.search(3));
	}

}
