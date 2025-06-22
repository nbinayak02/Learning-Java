package _2_Assignment_1;

class CalcCount {
	
	int n;
	
	synchronized void IncrementCount() {
		
		n = n+1;
		System.out.println("Count value is: "+n);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}

class Count extends Thread{
	
	CalcCount c;
	
	Count(CalcCount c){
		
		this.c = c;
		
	}
	public void run() {
		
		c.IncrementCount();
		
	}
	
}

public class ThreadSynchronization {

	public static void main(String[] args) {
		
		CalcCount c = new CalcCount();
		
		Count c1 = new Count(c);
		c1.start();
		Count c2 = new Count(c);
		c2.start();
		Count c3 = new Count(c);
		c3.start();
		Count c4 = new Count(c);
		c4.start();		
	}
}
