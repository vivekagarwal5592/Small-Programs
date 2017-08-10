package PriorityQueues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Driver {

	public static void main(String[] args) {
		
		Queue<StudentDetails> items = new PriorityQueue<StudentDetails >();
	//	Queue<StudentDetails> items  = new LinkedList<StudentDetails>();
	items.add(new StudentDetails("Vivek",5) );
	items.add(new StudentDetails("Keyur",1) );
	items.add(new StudentDetails("Karan",6) );
	items.add(new StudentDetails("Mayank",2) );
	items.add(new StudentDetails("tanushree",3) );
	items.add(new StudentDetails("rishab",7));
	items.add(new StudentDetails("nishant",4));
	

	
	System.out.println(items);
	 System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
	 System.out.println(items);
	 
	 System.out.println("Element consumed from head of the PriorityQueue : " + items.poll());
	 System.out.println(items);
	
	for(int i=0;i<=items.size()-2;i++){
		
	}

	}

}
