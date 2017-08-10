package Homework1;

public class Binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,6,8,12,18,20,25,34,50,56};
		int val = 3;
		int mid;
		int low = 0;
		int high = arr.length-1;
//		System.out.println(high); 
	//	mid = (low+high)/2;
		while(high >= low){ 
			System.out.println(low + " " + high); 
			mid = (low+high)/2;
			
			if(val == arr[mid]){
				System.out.println("Value found at position " + mid); 
				break;
			}
			
			else if(val > arr[mid]){
				 low = mid;
			}
			
			else if(val < arr[mid]){
				high = mid;
			}
			
//			if( high-low == 1){
//				System.out.println("Value not found "); 
//				break;
//			}
			
			
			
		}
		
	}

}
