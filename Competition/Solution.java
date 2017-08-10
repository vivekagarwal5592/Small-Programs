package Competition;

public class Solution {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Solution s = new Solution();
		int a[] = { -1, 3, -4, 5, 1, -6, 2, 1 };

	//	System.out.println(s.solution(a));

	}

	public int solution(int[] A) {
		
		
		
		
		
		
		
		
		int temp = 0;
		int temp2 = 0;
		int j=0;
		int k=0;
		for (int i = 0; i <= A.length - 1; i++) {
			

			for (j = 0; j <= i; j++) {
				temp += A[j];

			}

			for (k = j + 1; k <= A.length - 1; k++) {
				temp2 += A[k];

			}
			
			if(temp == temp2){
				
				if(j<k){
				//	System.out.println("j");
					return j;
				}
				
				else{
			//		System.out.println("k");
					return k;	
				}
				
			}
			
			

		}
		
		return -1;
		
		
		
		
		
		
		
		
		
		
	}

}
