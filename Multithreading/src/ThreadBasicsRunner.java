//extebds Tgread
//implements Runnable

class Task1 extends Thread {
	@Override
	public void run() {// SIGNATURE

		for (int i = 101; i <= 199; i++) {
			System.out.println(i + " ");
		}

		System.out.print("\n Task1 Done\n");
	}
}

class Task2 implements Runnable {

	@Override
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.println(i + " ");
		}
		System.out.print("\n Task2 Done");

	}

}

public class ThreadBasicsRunner {

	public static void main(String[] args) throws InterruptedException {

		// Task1 - 101 to 199
		System.out.print("\n Task1 Kicked Off");
		Task1 task1 = new Task1();
		task1.setPriority(10);
		task1.start();


		System.out.print("\n Task2 Kicked Off\n");
		// Task2 - 202 to 299
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.setPriority(10);
		task2Thread.start();

		task1.join();
		task2Thread.join();


		System.out.print("\n Task3 Kicked Off\n");
		// Task3
		for (int i = 301; i <= 399; i++) {
			System.out.println(i + " ");
		}
		System.out.print("\n Task3 Done");

		System.out.print("\n Main Done");

	}

}
