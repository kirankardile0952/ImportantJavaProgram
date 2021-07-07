
public class MultiThreadingDemo {
	public static void main(String[] args) {
		Printer printer = new Printer();
		Printer printer2 = new Printer();
		Print t1 = new Print(printer);
		Print t2 = new Print(printer);
		Print t3 = new Print(printer);
		Print t4 = new Print(printer2);
		Print t5 = new Print(printer2);
		Print t6 = new Print(printer2);

		Thread th1 = new Thread(t1, "thead1+printer");
		Thread th2 = new Thread(t2, "thead2+printer");
		Thread th3 = new Thread(t3, "thead3+printer");
		Thread th4 = new Thread(t4, "thead4+printer2");
		Thread th5 = new Thread(t5, "thead5+printer2");
		Thread th6 = new Thread(t6, "thead6+printer2");
		
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
		th6.start();

	}
}

class Print implements Runnable {

	Printer printer;

	public Print(Printer printer) {
		this.printer=printer;
	}

	@Override
	public void run() {
		printer.printing();
	}

}

class Printer {

	synchronized static void printing() {
		for (int i = 0; i < 10; i++) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			System.out.println("printing with thread " + Thread.currentThread().getName() + " ... count "+ i);
			
		}

	}
}