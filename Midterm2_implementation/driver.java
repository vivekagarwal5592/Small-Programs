package Midterm2_implementation;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {
		
		ArrayList<Animal> animal = new ArrayList<Animal>();
		
		animal.add(new Cats("cat1",1000));
		animal.add(new Cats("cat1",2000));
		animal.add(new Mice("mice1",5000));
		animal.add(new Mice("mice2",4000));
		
		for(int i=0;i<=animal.size()-1;i++){
			System.out.println(animal.get(i));
		}
		

	}

}
