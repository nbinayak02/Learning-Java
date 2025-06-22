package _2_Assignment_1;

class TestThread implements Runnable{

	String threadName;
	
	TestThread(String threadName){
		
		this.threadName = threadName;
		System.out.println("Creating: "+threadName);
		
	}
	
	
	@Override
	public void run() {
		
		System.out.println("Running: "+threadName);
	
	try {
		
		for(int i = 4; i>0; i--) {
			
			System.out.println("Thread name: "+threadName+" Printing: "+i);
			Thread.sleep(5000);
	}
		
	} catch (InterruptedException e) {
		
		System.out.println("Thread: "+threadName+" interrupted.");
		
	}

}
}


public class MultiThreadingRunnable{
	
	public static void main(String[] args) {
		
		TestThread r1 = new TestThread("One");
		Thread t1 = new Thread(r1);
		t1.start();
		
		TestThread r2 = new TestThread("Two");
		Thread t2 = new Thread(r2);
		t2.start();
		
	}
}
