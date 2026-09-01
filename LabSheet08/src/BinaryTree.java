import java.sql.DatabaseMetaData;
import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTree {

	private Node root;
	public Node parent;
	public Node deleteNode;
	public Node searchNode;
	
	public BinaryTree() { 
		root = null;
	}

	public Node getRoot() {
		return root;
	}
	public Node getSearchNode() {
		return deleteNode;
	}

	
	public void printTree(Node node, int depth) {
		if (node != null) {
			printTree(node.right, depth + 1);
			System.out.println("    ".repeat(depth) + node.data);
			printTree(node.left, depth + 1);
		}
	}

	public void createTree1() {
		root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
	}

	public void createTree2() {
		root = new Node(15);
		root.left = new Node(8);
		root.right = new Node(23);
		root.left.left = new Node(4);
		root.left.right = new Node(11);
		root.left.left.left = new Node(2);
		root.right.left = new Node(19);
		root.right.left.right = new Node(20);

	}

	public void createTree3() {
		root = new Node(50);
		root.left = new Node(10);
		root.right = new Node(22);
		root.left.left = new Node(11);
		root.left.right = new Node(12);
		root.right.right = new Node(24);
		root.right.right.left = new Node(23);
	}

	public void createTree4() {
		int[] nums = { 10, 8, 15, 2, 9, 18, 14, 20, 11, 17 };

		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void createTree5() {
		int[] nums = { 50, 30, 70, 10, 40, 60, 20, 45, 55, 65, 25 };

		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}

	}

	public void createTree6() {
		int[] nums = { 40, 20, 70, 30, 55, 85, 25, 35, 80, 32 };

		for (int i = 0; i < nums.length; i++) {
			insert(nums[i]);
		}
	}

	public void insert(int newData) {
		if (root == null) {
			root = new Node(newData);
		} else {
			Node current_node = root;
			while (true) {
				if (newData < current_node.data) {
					if (current_node.left == null) {
						current_node.left = new Node(newData);
						break;
					}
					current_node = current_node.left;
				} else if (newData > current_node.data) {
					if (current_node.right == null) {
						current_node.right = new Node(newData);
						break;
					}
					current_node = current_node.right;
				}
			} // end whlie
		} // end if
	}

	public void searchDeleteNode(int data) {
		Queue<Node> queue = new ArrayDeque<Node>();

		queue.add(root);
		while (!queue.isEmpty()) {
			int levelSize = queue.size();

			Node current_node = queue.poll();
			parent = current_node;
			if (parent.data == data) {
				deleteNode = parent;
				break;
			}
			//
			for (int i = 0; i < levelSize; i++)
				;
			if (current_node.left != null) {
				if (current_node.left.data == data) {
					deleteNode = current_node.left;
					queue.clear();
					break;
				}
				queue.add(current_node.left);
			}
			if (current_node.right != null) {
				if (current_node.right.data == data) {
					deleteNode = current_node.right;
					queue.clear();
					break;
				}
				queue.add(current_node.right);
			}
		}
	}

	public void delete(int target) {
		searchDeleteNode(target);
		if (root == null) {
			System.out.println("Empty Node");
		} else if (deleteNode == null) {
			System.out.println("Cannot found the search node");
		} else {
			// delete a leaf node
			if (deleteNode.left == null && deleteNode.right == null) {
				if (parent.left != null && parent.left.data == target) {
					parent.left = null;
				}
				if (parent.right != null && parent.right.data == target) {
					parent.right = null;
				}
			}
			// case 2 : delete a node with 2 child\
			else if (deleteNode.left != null && deleteNode.right != null) {
				Node successorParent = deleteNode;
				Node successor = deleteNode.right;

				while (successor.left != null) {
					successorParent = successor;
					successor = successor.left;
				}
				deleteNode.data = successor.data;

				if (successorParent.left == successor) {
					successorParent.left = successor.right;
				} else {
					successorParent.right = successor.right;
				}
			}
			// case 2 : delete a node with 1 child
			else {
				if (deleteNode.left != null) {
					if (parent.left.data == deleteNode.data) {
						parent.left = deleteNode.left;
					} else {
						parent.right = deleteNode.left;
					}
				} else {
					
						if (parent.left.data == deleteNode.data) {
							parent.left = deleteNode.right;
						} else {
							parent.right = deleteNode.right;
						
					}
				}
			}
		}
	}
	
}