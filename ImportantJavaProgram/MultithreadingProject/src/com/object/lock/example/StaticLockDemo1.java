package com.object.lock.example;

public class StaticLockDemo1 {

	static String lock1 = new String ("milkLock");
	static String lock2 = new String ("waterLock");
//	static Object lock1 = new Object();
//	static Object lock2 = new Object();
	
	static int counter1;
	static int counter2;

	static void milkDistribution() {
		synchronized (lock1) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("milkDistribution == "+Thread.currentThread().getName() + " :: " + counter1);
				counter1++;
			}

			System.out.println(Thread.currentThread().getName() + "Finished with excution");
		}
	}

	static synchronized void waterDistribution() {
		synchronized (lock2) {
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("waterDistribution == "+Thread.currentThread().getName() + " :: " + counter2);
				counter2++;
			}
			System.out.println(Thread.currentThread().getName() + "Finished with excution");
		}
	}

	public static void main(String[] args) {

		Runnable runnable1 = () -> milkDistribution();
		Runnable runnable2 = () -> waterDistribution();

		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable1);

		Thread t3 = new Thread(runnable2);
		Thread t4 = new Thread(runnable2);

		t1.setName("First");
		t2.setName("Second");
		t1.start();
		t2.start();

		t3.setName("Third");
		t4.setName("Fourth");
		t3.start();
		t4.start();
	}

}
