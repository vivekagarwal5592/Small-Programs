package Homework1;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class sample_test {
	
	static int myInt;
	
	static int x = 1;
	
	public static void otherMethod(int t){
		 x = 2;	
		 System.out.println(x);
		//return x;   // this x “hides” the global x
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(x);
			 otherMethod(x); 
			System.out.println(x); 
			
		
		
		

	
	
	
	


	  
		
		if( (int)'A' > (int)')' ){
			System.out.println("A is greater than )");
			}

		
		Double arr[] = {3.0,4.0,5.0};
		for(int i=0;i<arr.length;i++){
		if(Math.abs(Math.PI-arr[i])<0.001){
		System.out.println("yes");
		}
		else{
		System.out.println("no");
		}
		}

		
		String temp = JOptionPane.showInputDialog("Please enter the current temperature;");
		
		int intVar = 1;
		double doubleVar = 413.14159;
		double moonRadius = 1737000;  // in meters   
		char charVar = 'a';
		String stringVar = "Hi, Mom";
		boolean boolVar = true;
		
		System.out.printf("\nintVar: %d; \ndoubleVar: %f; \ndoubleVar to 4 places: %.4f; \nmoonRadius: %e; \ncharVar: %c; \nstringVar: %s",
intVar, doubleVar, doubleVar, moonRadius, charVar, stringVar);

	     
		
		boolean[] original_array = new boolean[3];
		
		 boolean[] reverse_array = new boolean[3];
		 
		 

		 System.out.println("Please enter the values as true of false " + original_array.length + " times ");
		 
		 
		 original_array = getBooleanArrayFromInput(3);
		 showPercentageTrue(original_array);
		 reverse_array = reverseBooleanArray(original_array);
		 
		 for(int i=0;i<= original_array.length-1;i++){
			 System.out.print(original_array[i]);
		 }
		 System.out.println();
		 
		 
		 for(int i=0;i<= reverse_array.length-1;i++){
			 System.out.print(reverse_array[i]);
		 }
		 System.out.println();
	
	
	

}
	
	public static boolean[] getBooleanArrayFromInput(int count){
		
		Scanner input = new Scanner(System.in);
		boolean[] array1;
		 array1=  new boolean[3];
		
		for(int i =0;i<count;i++){
			array1[i] = input.nextBoolean();
		}
		
		
		return array1;
			
	}
	
	public static void showPercentageTrue(boolean arr[]) {
		
		double count =0;
		
		for(int i=0;i<=arr.length-1;i++){
			if(arr[i] == true){
				count +=1;
				
			}
			}
		
		System.out.println("Array caontains "+ arr.length + " booleans out of which "+ String.valueOf((count/arr.length)*100) + " % are true");
		
	}
	
	public static boolean[] reverseBooleanArray(boolean arr[]) {
		
		 boolean[] reverse_array;
		 reverse_array=  new boolean[3];
		
		for(int i=0;i<=arr.length-1;i++){
			reverse_array[i] = !(arr[i]);
		}
		
		return reverse_array;
		
	}

}
