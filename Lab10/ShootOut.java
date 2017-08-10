package Lab10;

import java.util.Random;

public class ShootOut {

	
	
	public static void main(String[] args) {
		ShootOut shootout = new ShootOut();
		shootout.battle();
	}

	public void battle() {

		Marshall marshall = new Marshall("Wyatt Earp", 0.9);

		Random r = new Random();

		Cowboy[] cowboy = new Cowboy[5];

		for (int i = 0; i <= cowboy.length - 1; i++) {
			cowboy[i] = new Cowboy(r.nextDouble() / 2);
		}

		while (true) {
			int cowboy_selection = r.nextInt(5);
			
			boolean shot_fired = false;

			while (!shot_fired) {
				
				if (cowboy[cowboy_selection].isAlive()) {
					cowboy[cowboy_selection].shoot(marshall);
					shot_fired = true;
				}
				else{
					 cowboy_selection = r.nextInt(5);
				}
			}
			if (!marshall.isAlive()) {
				System.out.println("Cowboys Win");
				break;
			}

			shot_fired = false;

			while (!shot_fired) {
				if (cowboy[cowboy_selection].isAlive()) {
					marshall.shoot(cowboy[cowboy_selection]);
					shot_fired = true;
				}
			}
			
			boolean marshall_wins = false;
			for(int i=0;i<=cowboy.length-1;i++){
				
				if(cowboy[i].isAlive()){
					break;
				}
				else if(i==cowboy.length-1){
					marshall_wins = true;
				}
			}
			
			if(marshall_wins){
				System.out.println("Marshall Wins");
				break;
			}
			

		}

	}

}
