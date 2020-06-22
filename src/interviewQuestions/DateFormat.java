package interviewQuestions;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		
		Date d = new Date();
		System.out.println(d);
		
		SimpleDateFormat date=new SimpleDateFormat("m/dd/yyyy");
		SimpleDateFormat d1=new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(d1.format(d));
		
		System.out.println(date.format(d));
		
		//calendar fuctions
		System.out.println("***************");
		Calendar cal =Calendar.getInstance();
		
		SimpleDateFormat date1=new SimpleDateFormat("M/dd/yyyy");
		
		System.out.println(date1.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		
		
	}

}
