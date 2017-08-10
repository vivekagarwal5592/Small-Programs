package BinaryTrees;

public class Node2 {

	int data;
	Node2 left_node;
	Node2 right_node;
	
	public Node2(int data){
		this.data = data;
		this.left_node = null;
		this.right_node = null;
	}
	
	public Node2 add_node(Node2 node,int x){
		
		
		if(node == null){
			System.out.println("a "+x);
			node = new Node2(x);
		}
		else if(node.data > x){
			System.out.println("b "+ x);
			node.left_node = add_node(node.left_node,x);	
		}
		
		else if(node.data< x){
			System.out.println( "c "+x);
			node.right_node = add_node(node.right_node,x);	
		}
		
		return node;
		
		
	}
	
	public void traverse(Node2 node){
		
		if(node.left_node != null){
			traverse(node.left_node);
		}
		
		System.out.println(node.data);
		
		if(node.right_node != null){
			traverse(node.right_node);
		}
		
	}
	
	public void search(Node2 node, int x,int count){
		
		if(node == null){
			System.out.println("Element not found");
		}
		
		else if(x == node.data){
			System.out.println("Element found at" + count);
		}
		
		else if(x < node.data){
			count +=1;
			search(node.left_node,x,count);
		}
		
		else if(x > node.data){
			count +=1;
			search(node.right_node,x,count);
		}
		
		
	}
	
	
}


