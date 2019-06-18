package java_20190528;

public class IfDemo {
	public static void main(String[] args){
		//args[0] 프로그램 실행시 입력받는 값
		//Integer.parseInt() 메소드는 문자열을 int 로 변환
		int month = Integer.parseInt(args[0]);
		/*if(month==12 || month ==1 || month==2){
			System.out.println(month+"월은 겨울입니다.");
		}else if(month==3 || month==4 || month==5){
			System.out.println(month+"월은 봄입니다.");
		}else if(month==6 || month==7 || month==8){
			System.out.println(month+"월은 여름입니다.");
		}else if(month==9 || month==10 || month==1){
			System.out.println(month+"월은 가을입니다.");
		}else{
			System.out.println("잘못입력하셨습니다.");
		}
		*/
		String season = null; 
		switch(month){
			default :
				System.out.println("잘못입력");break;
			
			case 12 :
			case 1 :
			case 2 :
				season = "겨울";break;
			case 3 :
			case 4 :
			case 5 :
				season = "봄";break;
			case 6 :
			case 7 :
			case 8 :
				season = "여름";break;
			case 9 :
			case 10 :
			case 11 :
				season = "가을";break;
			
		}System.out.println(month+"월은"+season+"입니다.");
		
		
			
			
			
		}
		
		
	}

