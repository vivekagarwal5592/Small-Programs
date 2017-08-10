package Homework1;

public class Lab5_2540_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {2,45,7,3,5,1,8,9};
		
		for(int i=0;i<=arr.length-1;i++){
			for(int j=i+1;j<=arr.length-1;j++){
				if(arr[i] + arr[j] == 12){
					System.out.println(String.valueOf(arr[i]) + " " + String.valueOf(arr[j]));
				}
			}
		}
		
		
		
		
	}

}
