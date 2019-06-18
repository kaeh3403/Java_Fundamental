package java_20190604.step2;

import java_20190604.step1.FootStopWatch2;

public class StopWatch {
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	
	
	public void startNano(){
		startNanoTime = System.nanoTime();
	}
	public void stopNano(){
		endNanoTime = System.nanoTime();
	}
	
	public double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000;
		
	}
	
	public double getElapsedNanoTime(){
		return(double)(endNanoTime - startNanoTime)/(double)1000000000;
		
	}
	
	public static void main(String[] args) {
		FootStopWatch2 f = new FootStopWatch2();
		f.startNanoTime = System.nanoTime();
		
		for (int i = 0; i < 2_000_000_000; i++) {
			
		}
		
		f.endNanoTime = System.nanoTime();
		double elapsedTime = f.getElapsedNanoTime();
		
		System.out.println("경과된 시간(나노세컨드) : "+elapsedTime);
	}
}
