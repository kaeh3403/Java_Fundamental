package java_20190528;

public class OperatorDemo {
	public static void main(String[] args) {
		/*
		 * 달력만들기
		 * 1. 1년 1월 1일은 월요일
		 * 2. 윤년은 4년마다 발생하고 그중에 100년의 배수는 제외하고 400년의 배수는 제외하지 않는다.
		 * - 2019년 5월 28일의 요일을 구하려면
		 *   2018년 까지 총 일수를 구하고, 1월~4월까지 일수를 구하고 28일을 더하면 총 일수가 나옴
		 * - 총 일수를 7로 나눈 나머지가 1이면 월요일이된다.
		 * 
		 */
		
		int year = 2019;
		int month = 5;
		int date = 28;
		
		int preYear = year-1;
		int preMonth = month-1;
		
		
		int totalCnt = 0;
		//2018년도 총 일수
		totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
		
		//2019년도 4월 말까지 일수
		
		totalCnt += 31+28+31+30;
		totalCnt += date;
		
		int rest = totalCnt % 7;
		
		System.out.println(rest);
				
		
		int temp = 123;
		int share = temp%10==0 ? temp/10 : temp/10 +1;
		
		
		
		
		
		
	}

}
