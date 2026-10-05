package demos;

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
}

public class BInarySearchTree {

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

	}

}
