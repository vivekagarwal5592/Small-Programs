package ExamPractice;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {
		
		ArrayList<Monster> m = new ArrayList<Monster>();
		Monster m2 = new Monster();
		Godzilla godzilla = new Godzilla("godzilla");
		Dinosaur dinosaur = new Dinosaur("dinosaur");
		
		
		m.add(godzilla);
		m.add(dinosaur);
		m.add(m2);
		for(int i=0;i<=m.size()-1;i++){
			System.out.println(m.get(i).getName());
		}
	}

}
