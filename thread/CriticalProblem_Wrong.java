package thread;

import java.util.concurrent.Semaphore;

public class CriticalProblem_Wrong {
	class Buffer {
		int number = 0; // the number to increase or decrease
		int previous = 0;
		int total = 0; // total number of operations performed
		int errors = 0; // number of errors

		Semaphore mymutex = new Semaphore(1);

		public void increment() {
			try {
				mymutex.acquire();
				report(number);
				mymutex.release();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			number++;
			report(number);
		}

		public void decrement() throws InterruptedException {
			mymutex.acquire();
			number--;
			report(number);
			mymutex.release();

		}

		public void report(int n) {
			total++;
			if (n == previous)
				System.out.println("Errors" + ++errors + "\t" + total);
			previous = n;
		}
	}

	class Plus extends Thread {
		Buffer buf;

		Plus(Buffer b) {
			buf = b;
		}

		public void run() {
			try {
				for (int i = 0; i < 10; i++) {

					buf.increment();

				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	class Minus extends Thread {
		Buffer buf;

		Minus(Buffer b) {
			buf = b;
		}

		

		public void run() {

			try {
				for (int i = 0; i < 10; i++) {
					
					buf.decrement();
					
					
					
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] argv) {
		CriticalProblem_Wrong tw = new CriticalProblem_Wrong();
		Buffer b = tw.new Buffer();
		Plus p = tw.new Plus(b);
		Minus m = tw.new Minus(b);
		p.start();
		m.start();
	}
}
