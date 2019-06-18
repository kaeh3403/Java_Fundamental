package java_201906011;

public class SynchronizedDemo implements Runnable{
	int x;
	int y;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (SynchronizedDemo.class) {
		
		for (int i = 0; i < 20; i++) {
			x++;
			y++;
			String threadName = Thread.currentThread().getName(); 
			System.out.printf("x : %d, y : %d - %s%n",x,y,threadName);
		}	
		}
	}
	
	public static void main(String[] args) {
		SynchronizedDemo s1 = new SynchronizedDemo();
		Thread t1 = new Thread(s1);
		
		Thread t2 = new Thread(s1);
		
		t1.start();
		t2.start();
	}
}
