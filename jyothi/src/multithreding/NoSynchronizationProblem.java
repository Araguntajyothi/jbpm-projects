package multithreding;

class JointAccount implements Runnable {

	double balance;

	JointAccount(double balance) {
		this.balance = balance;
	}
	public void run() {
		withdraw();
	}
	public void withdraw() {
		
		System.out.println(Thread.currentThread().getName()
				+ " withdrawing money\n");
		try{
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		balance = balance - 1000;
		System.out.println("After " + Thread.currentThread().getName()
				+ "  withdwing\n");
		System.out.println("Available balance is " + balance + "\n");
	}
}

class NoSynchronizationProblem{

	public static void main(String args[]) {

		JointAccount ja = new JointAccount(3000);
		Thread t1 = new Thread(ja, "person1");
		Thread t2 = new Thread(ja, "person2");
		Thread t3 = new Thread(ja, "person3");
		t1.start();
		t2.start();
		t3.start();

	}

}
