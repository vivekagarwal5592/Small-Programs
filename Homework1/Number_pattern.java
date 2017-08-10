package Homework1;

public class Number_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 10;

		for (int i = n; i > 0; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

		
		System.out.println((int)'A');
		
		char x ;
		int m = 10;
		boolean uppercase = true;
		for (int i = m; i > 0; i--) {
			for (int j = 1; j <= i; j++) {
				
				
				if(j%2 == 0){
					 x = (char)(j+96);
					// System.out.print(x + " ");
					//System.out.print(x + " ");
				}
				
				else{
					 x = (char)(j+64);	
				//	 System.out.print(x + " ");
				}
				
				System.out.print(x + " ");
				
			}
			System.out.println();
		}
	}
}
