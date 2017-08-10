package Homework1;

public class Lab5_2540_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[][] = {{3,4,5},{6,7,8},{9,10,11}};
		int arr2[][] = {{1,1,1},{1,1,1},{1,1,1}};
		int result[][] = new int[3][3];
		int row_index;
		int col_index;
		
		
		for(int i=0;i<=result.length-1;i++){
			//col_index =0;
			for(int j=0;j<=result.length-1;j++){
			//	row_index =0;		
				
				result[i][j] = (arr[i][0] * arr2[0][j]) +
						(arr[i][1] * arr2[1][j]) +
						(arr[i][2] * arr2[2][j]);
			//	col_index++;
				
			}
		}
		
		for(int i=0;i<=result.length-1;i++){
			for(int j=0;j<=result.length-1;j++){
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}

}
