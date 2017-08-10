package BinaryTrees;

public class Driver {

	public static void main(String[] args) {
		
		Node2 root = new Node2(5);
		int arr[] = {2,4,6,7,1,8};
		
		for(int i=0;i<=arr.length-1;i++){
			root.add_node(root, arr[i]);
		}
		
		root.traverse(root);

	}

}
