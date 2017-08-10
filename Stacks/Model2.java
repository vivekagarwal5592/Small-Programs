package Stacks;

import java.util.Stack;

public class Model2 {

	
	Stack stack;
	
	public Model2() {
		stack = new Stack();
	}
	
	public void add(int x){
		stack.push(x);
	}
	
	public void traverse(int x){
		
	
			if(stack.search(x) ==-1){
				System.out.println("Element not found");
			}
			else{
				System.out.println("Distance from the top is" +stack.search(x));
			}	
	}
	
	public void remove_element(){
		System.out.println("Poped" + stack.pop());
	}
	
}
