package java_20190604.step1;
//1. 요구사항은 밀리 세컨드로 경과시간을 만들어주세요.
//2. 나노세컨드로 변환
public class FootStopWatch2 {
	public long startTime;
	public long endTime;
	
	public long startNanoTime;
	public long endNanoTime;
	
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
