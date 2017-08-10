package Homework1;

public class Manufacturing {

	public static void main(String[] args) {
		
		
		int products[][] = {{9,13,4,7,1,14,10},{8,2,12,11,6,15,2},{9,6,7,10,15,8,2}};
		double component_cost[] = {10.75,15.27,5.98,9.67,4.32,12.5,1.42};
		double product_cost[] = new double[products.length];
		double cost =0;
		double highest_cost_product =0;
		int highest_product_code =0;
		for(int i=0;i<=products.length-1;i++){
			for(int j=0;j<=component_cost.length-1;j++){
			cost +=	products[i][j]*component_cost[j];
			}
			product_cost[i] = cost;
			cost =0;
		}
		
		
		for(int i=0;i<=product_cost.length-1;i++){
			System.out.println(product_cost[i]);
			if(product_cost[i] > highest_cost_product){
				highest_cost_product = product_cost[i];
				highest_product_code =i;
			}
		}
		
		System.out.println("Product Code: " + String.valueOf(highest_product_code)+ " Cost:" + String.valueOf(highest_cost_product));
		

	}

}
