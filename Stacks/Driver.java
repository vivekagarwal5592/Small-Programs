package Stacks;

import java.util.Stack;

public class Driver {

	public static void main(String[] args) {
		
		Stack stack = new Stack();
		Stack stack2 = new Stack();
		Model model = new Model(stack);

		model.push(25);
		model.push(42);
		model.push(70);
		model.peek();
		model.pop();
		model.search(42);
		model.empty();
		System.out.println("I am going to print");
		model.print();
		System.out.println();
		stack2.push(46);
		stack.add(stack2);
		model.print();
	}

}
