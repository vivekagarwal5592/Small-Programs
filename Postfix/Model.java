package Postfix;

import java.util.Scanner;
import java.util.Stack;

public class Model {

	public static void main(String[] args){
		
		String val = "1 2 + 3 * 4 *";
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(val);
		
		while(scanner.hasNext()){
			if(scanner.hasNextInt()){
				stack.push(scanner.nextInt());
			}
			else {
				switch (scanner.next()){
				
				case "+":
				stack.push(stack.pop() + stack.pop());
				break;
				case "-":
					stack.push(stack.pop() - stack.pop());
					break;
				case "*":
					stack.push(stack.pop() * stack.pop());
					break;
				case "/":
					stack.push(stack.pop() / stack.pop());
					break;
				
				
				
				};
			}
		}
		
		System.out.println(stack.pop());
		
	}
	
	
}
