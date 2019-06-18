package java_20190604.step5;

public class StopNanoWatch extends StopWatch{
	
	
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
