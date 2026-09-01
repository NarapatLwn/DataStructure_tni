
public class TreeApp3 {

	public static void main(String[] args) {
		
		BinaryTree tree = new BinaryTree();
		tree.createTree5();
		tree.printTree(tree.getRoot(),0);

		System.out.println("-----------------------------");
		
		tree.delete(25);
		System.out.println(" parent = "+tree.parent.data);
		System.out.println(" Delete = "+tree.deleteNode.data);
		System.out.println("-----------------------------");
		tree.printTree(tree.getRoot(),0);
		
		
		System.out.println("-----------------------------");
		System.out.println(" parent = "+tree.parent.data);
		System.out.println(" Delete = "+tree.deleteNode.data);
		tree.delete(10);
		System.out.println("-----------------------------");
		tree.printTree(tree.getRoot(),0);
		
		
		System.out.println("-----------------------------");
		tree.delete(50);
		System.out.println(" parent = "+tree.parent.data);
		System.out.println(" Delete = "+tree.deleteNode.data);
		System.out.println("-----------------------------");
		tree.printTree(tree.getRoot(),0);
	}

}