package SampleMidterm2;

import java.util.ArrayList;

public class driver {

	public static void main(String[] args) {

		ArrayList<Building> building = new ArrayList<Building>();
		int haunted_count = 0;

		System.out.println("Lets go out for a walk on Maple street");

		building.add(new House("Charming", false, 102.2));
		building.add(new House("fire", true, 117.9));
		building.add(new House("water", false, 152.2));
		building.add(new Asylum("asylum1", true, 106.2));
		building.add(new Asylum("asylum2", false, 132.2));
		
		for (int i = 0; i <= building.size() - 1; i++) {
			building.get(i).explore();
			if (building.get(i).isHaunted()) {
				haunted_count += 1;
			}

		}
		
		System.out.println("There are " + haunted_count+ " buildings haunted" );

	}

}
