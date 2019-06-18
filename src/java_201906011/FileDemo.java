package java_201906011;

import java.io.File;
import java.util.Calendar;


public class FileDemo {
	public boolean mkdir(String path){
		boolean isSuccess = false;
		File f1 = new File(path);
		boolean isExiested = f1.isDirectory();
		if(!isExiested){
			isSuccess = f1.mkdir();
		}
		return isSuccess;
	}
	//
	public void changeFile(String path){
		File f1 = new File(path);
		long fileSize = f1.length();
		String fileName = f1.getName();
		
		String name = fileName.substring(0, fileName.lastIndexOf("."));
		String extension = fileName.substring(fileName.lastIndexOf(".")+1);
		name = String.valueOf(System.currentTimeMillis());
		name = name+extension;
		
		String parent = f1.getParent();
		File f2 = new File("c:\\down",name);
		f1.renameTo(f2);
		
	}
	
	
	public String getComma(int number){
		return String.format("%,d", number);
	}
	public String getComma(double number){
		return String.format("%,f", number);
	}
	public String getComma(double number,int precision){
		return String.format("%,."+ precision +"f", number);
	}
	public static void main(String[] args) {
		FileDemo f = new FileDemo();
		//f.mkdir("c:\\down2\\2019\\6\\11");
		
		File f1 = new File("c:\\down\\aa.exe");
		long fileSize = f1.length();
		
		
		String fileLength = f.getComma(Math.round((double)fileSize/(double)1024));
		System.out.println(fileLength + "kb");
		
		
		
		File f3 = new File("c:\\");
		String[]list = f3.list();
		for(String value : list){
			System.out.println(value);
		}
		
		Calendar c = Calendar.getInstance();
				int year = c.get(Calendar.YEAR);
		int month= c.get(Calendar.MONTH)+1;
		int day = c.get(Calendar.DATE);
		System.out.println(year+"년"+month+"월"+day+"일");
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		switch(dayOfWeek){
		case Calendar.MONDAY : System.out.println("월요일입니다.");break;
		case Calendar.TUESDAY: System.out.println("화요일입니다.");break;
		case Calendar.WEDNESDAY: System.out.println("수요일입니다.");break;
		case Calendar.THURSDAY: System.out.println("목요일입니다.");break;
		case Calendar.FRIDAY: System.out.println("금요일입니다.");break;
		case Calendar.SATURDAY : System.out.println("토요일입니다.");break;
		case Calendar.SUNDAY: System.out.println("일요일입니다.");break;
		}
		}
	
	
	
}
