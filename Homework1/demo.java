package Homework1;

public class demo{
	
	//printArray(new int[]{3, 1, 2, 6, 4, 2}); 

	// anonymous int array : new int[] { 1, 2, 3, 4};

	


	public static void main(String[] args){
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("\nNumbers:");
		for(int n: numbers) System.out.println(n);
	//	int[] numbers2 = numbers;
		//System.out.println("\nNumbers2:");
	//	for(int n: numbers2) System.out.println(n);
		int[] numbers3 = new int[11];
		System.out.println("\nNumbers3:");
		System.arraycopy(numbers, 0, numbers3, 1, 10); 
		
//		numbers[0] = 500;
//		System.out.println("\nNumbers after resetting [0]:");
//		for(int n: numbers) System.out.println(n);
//		System.out.println("\nNumbers2 after resetting numbers[0]:");
//		for(int n: numbers2) System.out.println(n);		
//		System.out.println("\nNumbers3 after resetting numbers[0]:");
		for(int n: numbers3) System.out.println(n);
	

		
		
		
		
		
		
		
		
		
		
		
//		char a = 'A';
//		
//		printArray(new int[]{3, 1, 2, 6, 4, 2}); 
//		System.out.printf("\\u%04x ", (int)a);
//		
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		for(int n: numbers) System.out.println(n);
//		for(int i = 0; i < numbers.length; i++){
//			int index = (int) (Math.random() * numbers.length);			
//			int temp = numbers[i];
//			numbers[i]=numbers[index];
//			numbers[index] = temp;
//		}
//		System.out.println("\n");
//		for(int n: numbers) System.out.println(n);	
		
		
	}

	private static void printArray(int[] ad) {
		// TODO Auto-generated method stub
		
	}

	
	
}