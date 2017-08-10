package Quiz5;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Vessel> vessel = new ArrayList<Vessel>();

		Cup cup1 = new Cup(5);
		Cup cup2 = new Cup(7);
		Glass glass1 = new Glass(2, 5);
		Glass glass2 = new Glass(3, 5);

		vessel.add(cup1);
		vessel.add(cup2);
		vessel.add(glass1);
		vessel.add(glass2);

		// vessel.get(0).pourIn(265);

		System.out.println(cup1.getVolumeInML() + " is the volume of the vessel");
		cup1.pourIn(265);
		System.out.println("The amount in the vessel is" + cup1.getAmountPouredIn());
		cup1.consume(300);
		System.out.println("The amount in the vessel is" + cup1.getAmountPouredIn());

		System.out.println("\n\n\n");

		System.out.println(cup2.getVolumeInML() + " is the volume of the vessel");
		cup2.pourIn(100);
		System.out.println("The amount in the vessel is" + cup2.getAmountPouredIn());
		cup2.consume(90);
		System.out.println("The amount in the vessel is" + cup2.getAmountPouredIn());

		System.out.println("\n\n\n");

		System.out.println("\n\n\n");

		System.out.println(glass1.getVolumeInML() + " is the volume of the vessel");
		glass1.pourIn(100);
		System.out.println("The amount in the vessel is" + glass1.getAmountPouredIn());
		glass1.consume(90);
		System.out.println("The amount in the vessel is" + glass1.getAmountPouredIn());

		System.out.println("\n\n\n");

		System.out.println(glass2.getVolumeInML() + " is the volume of the vessel");
		glass2.pourIn(10);
		System.out.println("The amount in the vessel is" + glass2.getAmountPouredIn());
		glass2.consume(5);
		System.out.println("The amount in the vessel is" + glass2.getAmountPouredIn());

		System.out.println("\n\n\n");

		Cup cup3 = new Cup(-4);
		System.out.println(cup3.getVolumeInML() + " is the volume of the vessel");

	}

}
