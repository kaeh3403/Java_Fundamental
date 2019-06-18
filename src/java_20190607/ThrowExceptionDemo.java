package java_20190607;

class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String msg){
		//Exception 클래스의 매개변수 String인 생성자를 호출해준다.
		//msg는 에러메세지를 출력할 목적으로 사용.
		super(msg);
	}
}
class InCorrectAccountException extends Exception{
	InCorrectAccountException(String msg){
		//Exception 클래스의 매개변수 String인 생성자를 호출해준다.
		//msg는 에러메세지를 출력할 목적으로 사용.
		super(msg);
	}
}



public class ThrowExceptionDemo {
	public static double withdraw(String account, int amount) throws InsufficientBalanceException, InCorrectAccountException{
		double balance = 100000;
		String dbAccount = "123-12-123123";
		
		if(account != null && account.equals(dbAccount)){
			if(balance - amount>=0){
				balance = balance - amount;
			}else{
				throw new InsufficientBalanceException("잔액부족");
			}
		}else{
			throw new InCorrectAccountException("계좌 오류");
			
		}
		
		return balance;
	}
	public static void main(String[] args) {
		
		double balance;
		try {
			balance = withdraw("123-12-123123",200000);
			System.out.println("잔액 : "+ balance);
		} catch (InsufficientBalanceException e) {
			System.err.println(e.getMessage());
		} catch (InCorrectAccountException e) {
			System.err.println(e.getMessage());
		}
	}
}
