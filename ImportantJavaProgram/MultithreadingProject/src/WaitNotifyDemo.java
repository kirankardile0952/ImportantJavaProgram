
public class WaitNotifyDemo {
	public static void main(String[] args) {

		Card card = new Card();
		InvitationCardDesigner designer = new InvitationCardDesigner(card);
		InvitationPrinter printer = new InvitationPrinter(designer,card);

		Thread t1 = new Thread(designer, "designer");
		Thread t2 = new Thread(printer, "printer");
		t1.start();
		t2.start();
	}

}

class InvitationCardDesigner implements Runnable {
	boolean ready;
	Card card;
	

	InvitationCardDesigner(Card card) {
		super();
		this.card = card;
	}

	synchronized void designCard() throws InterruptedException {
		System.out.println("designing is in progress ..");
		Thread.sleep(5000);
		card.setMessage("card design is ready");
		card.notify();
		System.out.println("design job done");
	}

	public boolean isReady() {
		// TODO Auto-generated method stub
		return ready;
	}

	@Override
	public void run() {
		try {
			this.designCard();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class InvitationPrinter implements Runnable {

	InvitationCardDesigner design;
	Card card;

	public InvitationPrinter(InvitationCardDesigner design,Card card) {
		super();
		this.design = design;
		this.card = card;
	}

	synchronized void printInvitation() throws InterruptedException {
		System.out.println("design is ready...");
		System.out.println("printing started...");
		Thread.sleep(5000);
		System.out.println("invitation printed with " + design);
	}

	@Override
	public void run() {
		try {
			System.out.println("preparing to print card");
			if (!design.isReady())
			{
				System.out.println("waiting for designer");
				card.wait();
			}
		
			this.printInvitation();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Card {
	
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}