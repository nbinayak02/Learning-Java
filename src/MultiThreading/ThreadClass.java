package MultiThreading;

class Tables{
	
	synchronized void Table(int n) {
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.print(i*n + "\t");
			
			try {
				Thread.sleep(500);
			} catch(Exception e) {
				System.out.println(e);
			}
			
		}
		
		System.out.println(" ");
	}
}

public class ThreadClass extends Thread {

	int n;
	Tables t;
	
	ThreadClass(Tables t, int n){
		this.t = t;
		this.n = n;
	}
	
	public void run() {
		t.Table(n);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tables tb = new Tables();
		
		ThreadClass t = new ThreadClass(tb, 22);
		ThreadClass t2 = new ThreadClass(tb, 2);
		ThreadClass t12 = new ThreadClass(tb, 12);
		
		t.start();
		t2.start();
		t12.start();
		
	}

}
