package MultiThreading;

public class RunnableInterface implements Runnable {

	String tname;
	
	RunnableInterface(String tname) {
		this.tname = tname;
		System.out.println("Creating "+tname+"...");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Running "+tname+"...");
	
			try {
				
				for(int i = 0; i < 3; i++) {
					System.out.println("Thread: "+tname+" Printing: "+i);
					Thread.sleep(500);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Thread: "+tname+" exiting..");
		}
	
		public static void main(String[] args) {
			
			RunnableInterface r = new RunnableInterface("One");
			Thread t1 = new Thread(r);
			t1.start();
			
			RunnableInterface r2 = new RunnableInterface("Two");
			Thread t2 = new Thread(r2);
			t2.start();
		}
	}


