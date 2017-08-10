package thread;

import java.awt.*;
import java.util.concurrent.Semaphore;

import javax.swing.*;

class MyBall extends Thread {
	int x;
	int y;
	int sleeptime;
	int str_index;
	MyBallWindow mBw;
	Color c;
	String str, substr;
	boolean up;
	static int ball1_position = 0;
	Semaphore semaphore;
	static boolean thread_is_sleeping = false;
	int speed;

	// int ball2_position;
	public MyBall(int xx, int yy, int sleepTime, MyBallWindow ssbb, Color cc, Semaphore semaphore, int speed) {
		str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		str_index = 0;
		substr = "A";
		x = xx;
		y = yy;
		boolean up = false;
		sleeptime = sleepTime;
		mBw = ssbb;
		c = cc;

		this.semaphore = semaphore;
		this.speed = speed;
		// this.ball2_position =0;
		// up = false;
	}

//	public synchronized boolean check_ball_position(int y, int speed) {
//		// System.out.println("I am in synchronized method");
//		System.out.println("ball position:" + ball1_position + "   y position:" + y);
//		if (ball1_position == y) {
//
//			change_speed(speed);
//
//			return true;
//
//		} else {
//			ball1_position = y;
//			change_speed(speed);
//
//			// if (ball1_position == y) {
//			// return true;
//			// }
//
//			return false;
//		}
//	}

	public void change_speed(int speed) {
		y = y + speed;
	}
	
	public void up_false(){
		
		mBw.repaint();
		substr = str.substring(str_index, str_index + 1);
		str_index++;
		if (str_index > 61)
			str_index = 0;
		change_speed(speed);
		
		try {
			Thread.sleep(sleeptime);
		} catch (Exception e) {
		}

		if (y > 550) {
			up = true;
		}
		
	}

	public void run() {

	while(true){
		while (up == false) {
			up_false();
			
		}

		while (up == true) {
	
			mBw.repaint();
			substr = str.substring(str_index, str_index + 1);
			str_index++;
			if (str_index > 61)
				str_index = 0;
			change_speed(-speed);
			try {
				Thread.sleep(sleeptime);
			} catch (Exception e) {
			}

			if (y < 0) {
				up = false;
			}
		}
	}

	}

	public void draw(Graphics g) {

		if (up == false) {

			g.setColor(Color.white);
			g.fillOval(x, y - speed, 50, 50);
			g.setFont(new Font("Rome", Font.BOLD, 50));
			g.drawString(substr, x, y - speed);

			g.setColor(c);
			g.fillOval(x, y, 50, 50);

			g.setColor(Color.black);
			g.setFont(new Font("Monospaced", Font.BOLD, 50));
			g.drawString(substr, x + 10, y + 40);
		} else {
			g.setColor(Color.white);
			g.fillOval(x, y + speed, 50, 50);
			g.setFont(new Font("Rome", Font.BOLD, 50));
			g.drawString(substr, x, y + speed);

			g.setColor(c);
			g.fillOval(x, y, 50, 50);

			g.setColor(Color.black);
			g.setFont(new Font("Monospaced", Font.BOLD, 50));
			g.drawString(substr, x + 10, y + 40);
		}
	}
}

class MyBallWindow extends JFrame {
	MyBall myBall[];

	public MyBallWindow() {
		myBall = new MyBall[6];
		Semaphore semaphore = new Semaphore(1);
		myBall[0] = new MyBall(100, 410, 300, this, Color.red, semaphore, 10);
		myBall[1] = new MyBall(200, 400, 400, this, Color.blue, semaphore, 15);
		// myBall[2] = new MyBall(300, 0, 500, this, Color.yellow);
		// myBall[3] = new MyBall(400, 00, 600, this, Color.green);
		// myBall[4] = new MyBall(500, 00, 700, this, Color.orange);
		// myBall[5] = new MyBall(600, 00, 800, this, Color.pink);

		for (int i = 0; i < 2; i++) {
			myBall[i].start();
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setVisible(true);
	}

	public void paint(Graphics g) {

		// if(up == false){

		for (int i = 0; i < 2; i++) {
			myBall[i].draw(g);
		}
		
		if (myBall[0].y == myBall[1].y) {

			Color temp = myBall[0].c;
			myBall[0].c = myBall[1].c;
			myBall[1].c = temp;

		}
		
		// }
		// else{
		// for (int i = 0; i < 6; i++)
		// {
		// myBall[i].draw2(g);
		// }
		// }
	}
}

public class ThreadingBall {
	public static void main(String[] args) {
		new MyBallWindow();
	}
}
