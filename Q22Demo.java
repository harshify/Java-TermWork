package HARSH40;
import HARSH40.Reserve;
class Reserve implements Runnable { // available berths are 1
	int available = 1;
	int wanted;

//accept wanted berths at runtime Reserve ( integer i)
	Reserve(int i) {
		wanted = i;
	}

	synchronized public void run() {
		System.out.println("Number of berths available: " + available);
//if available berths more than wanted berths
		if (available >= wanted) { // get the name of the passenger
			String name = Thread.currentThread().getName();
			System.out.println(wanted + " berths alloted to: " + name);
			try {
				Thread.sleep(2000); // wait for printing the ticket
				
//update the no.of available berths
			} catch (InterruptedException ie) {
				System.out.println(ie);
			}
			available = available - wanted;
		} else {
			System.out.println("Sorry, no berths available");
		}
	}
}

class Q22Demo {
	public static void main(String args[]) {
		Reserve obj = new Reserve(1);
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj);
		t1.setName("First Person");
		t2.setName("Second Person");
		t1.start();
		t2.start();
		System.out.println("******************************************************************\n");
		System.out.println("Implemented by- Harsh Raj Mishra\t Class Roll no-40\t CSE(4)E");
		System.out.println("\n***************************************************************");
	}
}