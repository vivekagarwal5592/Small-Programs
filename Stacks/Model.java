package Stacks;

import java.util.Stack;

public class Model {

	Stack stack;
	
	public Model(Stack stack){
		this.stack = stack;
	}
	
	public void push(int x){
		System.out.print("Push" + x);
		stack.push(x);
		System.out.println();
		
	}
	
	public void pop(){
		System.out.println("Pop" + stack.pop());
		//stack.pop();
	}
	
	public void search(int x){
		System.out.println("Search" + stack.search(x));
		
	}
	
	public void peek(){
		System.out.println("Pekk" + stack.peek());
	
	}
	
	public void empty(){
		System.out.println("Empty" + stack.empty());
	
	}
	
	public void print(){
		
		
		for(int i=0;i<=stack.size()-1;i++){
			System.out.println(stack.get(i));
		}
	}
	
}
