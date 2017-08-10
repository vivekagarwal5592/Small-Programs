package Homework1;

import java.util.Scanner;

public class sample_test_1 {

	
	
	
	
	static boolean[] original_arr = new boolean[3];
	static boolean[] reverse_arr = new boolean[3];
	static int counter = 0;
	static double show_percentage_true;
	
	public static boolean[] getBooleanArrayFromInput(int count) {
		
		Scanner s = new Scanner(System.in);	
		for(int i=0;i<count;i++){
			original_arr[i] = s.nextBoolean();
		}
			
		return original_arr;	
	}
	
	public static void showPercentageTrue(boolean original_arr[]){
	
		for(int i=0;i<original_arr.length;i++){
			if(original_arr[i] == true){
				counter +=1;
			}
		}
			show_percentage_true = ((double)counter/original_arr.length)*100;
			System.out.println(String.valueOf(show_percentage_true));
		
		
	}
		public static boolean[] reverseBooleanArray(boolean original_arr[]){
			
			for(int i=0;i<original_arr.length;i++){
				reverse_arr[i] = !(original_arr[i]);
			}
			
			return reverse_arr;
			
		}
		
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  String S1 = "abc";
		String S2 = S1;
	//	S1 = "xyz";
		
		S1 = S1.replace('a', 'd');
		System.out.println(S1);
		System.out.println(S2);
		
		
		
		 getBooleanArrayFromInput(3);
		 showPercentageTrue(original_arr);
		 reverseBooleanArray(original_arr);
		 
		 System.out.println("The value of the orginal array are " );
		 
		 for(int i=0;i<original_arr.length;i++){
			 System.out.println(original_arr[i]);
		 }
		 
 System.out.println("The value of reverse array are " );
		 
		 for(int i=0;i<reverse_arr.length;i++){
			 System.out.println(reverse_arr[i]);
		 }

	}

}
