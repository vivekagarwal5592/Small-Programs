package Lecture10;

public class Aray_example_copy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			int[] numbers = {1,2,3,4,5,6,7,8,9,10};
			System.out.println("\nNumbers:");
			for(int n: numbers) System.out.println(n);
			int[] numbers2 = numbers;
			System.out.println("\nNumbers2:");
			for(int n: numbers2) System.out.println(n);
			int[] numbers3 = new int[10];
			System.arraycopy(numbers, 0, numbers3, 0, numbers.length); 
			
			numbers[0] = 500;
			System.out.println("\nNumbers after resetting [0]:");
			for(int n: numbers) System.out.println(n);
			System.out.println("\nNumbers2 after resetting numbers[0]:");
			for(int n: numbers2) System.out.println(n);		
			System.out.println("\nNumbers3 after resetting numbers[0]:");
			for(int n: numbers3) System.out.println(n);
		
	}

}
