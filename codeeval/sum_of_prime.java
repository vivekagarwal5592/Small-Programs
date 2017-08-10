package codeeval;

public class sum_of_prime {

	public static void main(String[] args) {
	
		int sum=0;
		 boolean flag ;
		 int count =0;
		for(int i=2;count<=999;i++){
			flag = true;
			for(int j=2;j<=i-1;j++){
				if(i%j == 0){
					flag = false;
					break;
				}
				
				
			}
			if(flag == true){
			//	System.out.println(i);
				sum += i;
				count +=1;
			//	System.out.println(sum);
			}
		}
		
		System.out.println(sum);

	}

}
