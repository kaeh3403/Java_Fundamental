package java_20190604.step5;

public abstract class StopWatch {
	public long startTime;
	public long endTime;
	public abstract void start();
	public abstract void stop();	
	public abstract double getElapsedTime();
	
}
