package Homework1;

public class Lab2_3_2540 {

	public static void main(String[] args) {
		
		int num[] = 	{1, 4, 45, 6, 10, 8};
		
		
		
		for(int i= 0; i<=num.length-1;i++ ){
			
			for(int j=i+1;j<=num.length-1;j++){
				
				for(int k=j+1;k<=num.length-1;k++){
				
					if(num[i]+num[j]+num[k] == 22){
						System.out.println("The three sets of numbers whose sum is 22 are "
								+ num[i] + " " + num[j] + " " + num[k] );
					}
			
			}
		}
		
		
		
	}
	
}
}
