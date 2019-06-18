package java_20190529;

public class CalendarDemo {
	
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
	
	int year = Integer.parseInt(args[0]);
	int month = Integer.parseInt(args[1]);
	int date = Integer.parseInt(args[2]);
	
	int preYear = year-1;
	int preMonth = month-1;
	
	
	int totalCnt = 0;
	//2018년도 총 일수
	totalCnt = preYear * 365 + (preYear/4 - preYear/100 + preYear/400);
	
	//2019년도 4월 말까지 일수
	//월 배열을 생성한다.
	
	int[] monthArray = {31,28,31,30,31,30,31,31,30,31,30,31};
	for (int i = 0; i < preMonth; i++) {
	
		totalCnt += monthArray[i];
	}

	//해당 년도가 윤년인지 판단하고 윤년인 경우 3월 이상이면 1을 추가.
	if (month>=3 && (year%4==0 && year%100 != 0 || year%400==0)) {
		
		totalCnt++;
	}
	
	totalCnt += date;
	
	int rest = totalCnt % 7;
	String day = "";
	switch(rest){
		case 1 : day = "월요일";break;
		case 2 : day = "화요일";break;
		case 3 : day = "수요일";break;
		case 4 : day = "목요일";break;
		case 5 : day = "금요일";break;
		case 6 : day = "토요일";break;
		case 0 : day = "일요일";break;

	
	
	}
	
	System.out.println(year + "년" + month + "월" + date + "일" + day);
	
	/*
	System.out.println(rest);
			
	
	int temp = 123;
	int share = temp%10==0 ? temp/10 : temp/10 +1;
	
	*/
	
	
	
	}

}
