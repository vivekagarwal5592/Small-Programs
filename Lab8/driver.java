package Lab8;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 MyFraction obj1 = new MyFraction(1, 2, '+');
		 MyFraction obj2 = new MyFraction(1, 2, '-');
		 
		
		 MyFraction addition = obj1.add(obj2);
		 MyFraction subtraction= obj1.subtract(obj2);
		 MyFraction multiplication = obj1.multiply(obj2);
		 MyFraction division = obj1.divide(obj2);
		
		 
		 
		 System.out.println("The addition of the two fractions " + obj1 + " and "+ obj2 + " is " + addition);
		 System.out.println("The subtraction of the two fractions " + obj2 + " and " + obj1 + " is " +subtraction);
		 System.out.println("The multiplication of the two fractions " + obj1 + " and " + obj2 + " is " +multiplication);
		 System.out.println("The division of the two fractions " + obj1 + " and " + obj2 + " is " +division);

		int set1arr[] = { 1,2,3 };
		int set2arr[] = { 4,3,1 };
		
		
		
		
		MySet set1 = new MySet(set1arr);
		MySet set2 = new MySet(set2arr);
			
		
		MySet set4 = set2.add(set1);
		System.out.println("The addition of the two sets "+set1 + " and " + set2 +" is " +set4);

		MySet set5 = set2.subtract(set1);
		System.out.println("The subtraction of the two sets "+set1 + " and " + set2 +" is " +set5);
		
		MySet set3 = set2.multiply(set1);
		System.out.println("The multiplication of the two sets "+set1 + " and " + set2 +" is " +set3);
		
		MySet set6 = set2.divide(set1);
		System.out.println("The division of the two sets "+set1 + " and " + set2 +" is " +set6);
		
//		
	}

}
