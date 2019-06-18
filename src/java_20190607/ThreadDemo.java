package java_20190607;

public class ThreadDemo extends Thread {
	public ThreadDemo(String msg){
		//Thread클래스의 매개변수가 문자열인 생성자를 호출
		//msg는 스레드 이름을 정한다
		super(msg);
	}
	
	public void run() {
		for (int i = 0; i < 1000; i++) {
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " : "+i);
			
		} 
	}
	
	public static void main(String[] args) {
		System.out.println("***start***");
		ThreadDemo t1 = new ThreadDemo("첫번째 스레드");
		//Thread는 start를 선언해야지만 시작한다.
		t1.start();
		ThreadDemo t2 = new ThreadDemo("두번째 스레드");
		t2.start();
		System.out.println("***end***");
		
		
	}
}
