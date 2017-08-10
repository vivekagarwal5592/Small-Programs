package BinaryTrees;

public class Node {

	private Node right_node;
	private Node left_node;
	private int val;

	public Node(Node right_node, Node left_node, int val) {

		this.right_node = right_node;
		this.left_node = left_node;
		this.val = val;
	}

	public Node(int val) {
		this.right_node = null;
		this.left_node = null;
		this.val = val;
	}

	public Node add_node(Node node, int x) {

		if (node == null) {
			System.out.println("I am in a " + x);
			node = new Node(x);
			// traverse(node);
		}

		else if (node.val > x) {
			System.out.println("I am in b " + x + " " + node.val);
			node.left_node = add_node(node.left_node, x);

		} else if (node.val < x) {
			System.out.println("I am in c " + x + " " + node.val);
			node.right_node = add_node(node.right_node, x);
		}
		return node;

	}

	public void delete_node(int x) {

	}

	public void search_element(Node node, int x) {

	}

	public void inorder_traverse(Node root) {
		// left-root-right.,
		if (root.left_node != null) {
			inorder_traverse(root.left_node);
		}

		System.out.println(root.val);
		if (root.right_node != null) {
			inorder_traverse(root.right_node);
		}
	}

	public void preorder_traverse(Node root) {
		// root-left-right
		System.out.println(root.val);

		if (root.left_node != null) {
			preorder_traverse(root.left_node);
		}

		if (root.right_node != null) {
			preorder_traverse(root.right_node);
		}

	}

	public void postorder_traverse(Node root) {

		if (root.left_node != null) {
			postorder_traverse(root.left_node);
		}

		if (root.right_node != null) {
			postorder_traverse(root.right_node);
		}

		System.out.println(root.val);

	}

}
