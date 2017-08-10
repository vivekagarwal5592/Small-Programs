package Homework1;

public class Lab4_1_2540 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int num_1 =0;
int num_2 =1;
int val;

System.out.println(num_1);
System.out.println(num_2);
for(int i=0;i<8;i++){
	
	val = num_1 +num_2;
	 System.out.println(val);
	 num_1= num_2;
	 num_2 =  val  ;
	 
	
}
	}

}
