package com.object.lock.example;

public class WaitNotifyDemo {
	public static void main(String[] args) {
		Print print = new Print();

		Designer designer = new Designer(print);
		Printer printer = new Printer(print);

		new Thread(designer, "designer thread1").start();
		new Thread(printer, "printer thread1").start();
		new Thread(printer, "printer thread2").start();
		new Thread(printer, "printer thread3").start();
		new Thread(printer, "printer thread4").start();
		new Thread(printer, "printer thread5").start();

	}
}

class Designer implements Runnable {

	Print print;

	public Designer(Print print) {
		this.print = print;
	}

	@Override
	public void run() {
		System.out.println("designning started ...");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("designning finished ...");
		synchronized (print) {
			print.notifyAll();
		}

	}

}

class Printer implements Runnable {
	Print print;

	public Printer(Print print) {
		this.print = print;
	}

	@Override
	public void run() {
		synchronized (print) {
			try {

				print.wait();

				System.out.println("printing preparing started ..." + Thread.currentThread().getName());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("printing finished ..." + Thread.currentThread().getName());
		}
	}

}

class Print {
	String content;
}
