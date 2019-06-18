package java_20190604.step2;

public class StopWatchDemo {
	public static void main(String[] args) {
		StopWatch sw = new StopWatch();
		sw.start();
		
		for (int i = 0; i < 2_000_000_000; i++) {
			
		}
		
		sw.stop();
		System.out.println("경과시간(밀리세컨드) : "+sw.getElapsedTime());
		
		sw.startNano();
		for (int i = 0; i < 2_000_000_000; i++) {
		
		}
		
		sw.stopNano();
		System.out.println("경과시간(밀리세컨드) : "+sw.getElapsedNanoTime());
	}
}
