package Postfix;

import java.util.Scanner;
import java.util.Stack;

public class Prefix {

	public static void main(String[] args) {

		String val = "+ 2 3 * 4 - 5";
		Stack<Integer> stack = new Stack<Integer>();
		Scanner scanner = new Scanner(val);
		String operator = "";
		
		while(scanner.hasNext()){
			if(scanner.hasNextInt()){
				if(stack.isEmpty()){
					stack.push(scanner.nextInt());
				}
				else{
					switch(operator){
					case "+":
					int x=	stack.pop() + scanner.nextInt();
						stack.push(x);
						break;
					case "-":
						stack.push(stack.pop() - scanner.nextInt());
						break;
					case "*":
						int i = stack.pop() * scanner.nextInt();
						stack.push(i);
						break;
					case "/":
						stack.push(stack.pop() / scanner.nextInt());
						break;
					}
				}
			}else{
				operator = scanner.next();
			}
			
		}
		System.out.println(stack.pop());
		
		
	}

}
