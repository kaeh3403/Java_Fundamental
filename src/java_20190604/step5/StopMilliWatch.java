package java_20190604.step5;

public class StopMilliWatch extends StopWatch{

	public void start(){
		startTime = System.currentTimeMillis();
	}
	public void stop(){
		endTime = System.currentTimeMillis();
	}
	
	public double getElapsedTime(){
		return(double)(endTime - startTime)/(double)1000;
	}
		
}
