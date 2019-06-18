package java_20190604.step3;

public class StopNanoWatch {
	public long startTime;
	public long endTime;
	
	public void start(){
		startTime = System.nanoTime();
	}
	public void stop(){
		endTime = System.nanoTime();
	}
	public double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000000000;
		
	}

}
