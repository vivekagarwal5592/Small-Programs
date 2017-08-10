package Stacks;

public class Driver2 {

	public static void main(String[] args) {
		
		Model2 model = new Model2();
		
		model.stack.add(5);
		model.stack.add(1);
		model.stack.add(2);
		model.stack.add(3);
		model.stack.add(4);
		
		model.remove_element();
		model.traverse(5);

	}

}
