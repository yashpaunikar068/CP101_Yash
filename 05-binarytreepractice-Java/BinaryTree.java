
class Node {
	public int value;
	public Node left, right;
	public Node(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
}

public class BinaryTree {
	public Node root;
	
	public BinaryTree(int value) {
        // Your code goes here
		root.value = value;
	}

	public boolean search(int value) {
		// Your code goes here
		return search_Node(root, value);
	}

	private boolean search_Node(Node node, int value) {
		// Your code goes here
		if(node.value == value)
			return true;
		return search_Node(node.left, value) || search_Node(node.right, value);;
	}
}