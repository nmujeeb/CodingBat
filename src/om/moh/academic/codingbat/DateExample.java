package om.moh.academic.codingbat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class DateExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		String dateInString = "05-Nov-2010";
		Date date = null;
		try {
			date = sdf.parse(dateInString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(date);*/
		
		formatDate();
		

	}
	
	
	
	public static void formatDate() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy", Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd MMM, yy", Locale.US);
		String strDate = "5 NOV 2010";
		try {
			Date dt = sdf.parse(strDate);
			System.out.println("Date :"+dt);
			System.out.println("Date after format :"+sdf1.format(dt));
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*Calendar cal = new GregorianCalendar();
		cal.set(Calendar.YEAR, 2010);
		cal.set(Calendar.MONTH, 11);
		cal.set(Calendar.DATE, 5);*/
		
		
		// constructor allows to set year, month and date
	    Calendar cal1 = new GregorianCalendar(2010, 11, 05);
	    // constructor could also be empty
	    // calendar cal2 = new GregorianCalendar();
	    // change the month
	    cal1.set(Calendar.MONTH, Calendar.NOVEMBER);

	    //System.out.println("Year: " + cal1.get(Calendar.YEAR));
	    //System.out.println("Month: " + (cal1.get(Calendar.MONTH) + 1));
	    //System.out.println("Days: " + cal1.get(Calendar.DAY_OF_MONTH));

	    // format the output with leading zeros for days and month
	    SimpleDateFormat date_format = new SimpleDateFormat("dd MMM,yy");
	    System.out.println(date_format.format(cal1.getTime()));
	    
	  //create an array of days
	    String[] strDays = new String[]{
	                      "Sunday",
	                      "Monday",
	                      "Tuesday",
	                      "Wednesday",
	                      "Thusday",
	                      "Friday",
	                      "Saturday"
	                    };
	   
	    //Day_OF_WEEK starts from 1 while array index starts from 0      
	    System.out.println("Current day is : " +
	              strDays[cal1.get(Calendar.DAY_OF_WEEK) - 1]
	              );
	    
	}

}
