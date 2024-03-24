package test;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class Test {
	public static void main(String[] args) {
		
		//Hàm lấy thời gian hiện tại
		long t1 = System.currentTimeMillis();
		for(int i = 0; i < 10; i++) {
			System.out.println("Test");
		}
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("Thoi gian truoc khi chay for(): " + t1);
		System.out.println("Thoi gian sau khi chay for(): " + t2);
		System.out.println("Thoi gian chay for(): " + (t2 - t1) + "mls");
		System.out.println("Thoi gian chay for(): " + (t2 - t1)/1000 + "s");
		
		//TimeUnit
		System.out.println("3000 nam = " + TimeUnit.DAYS.toSeconds(3000*365) + "s");
		System.out.println("1h nam = " + TimeUnit.HOURS.toSeconds(1) + "s");
		
		//Date
		java.util.Date d = new Date(System.currentTimeMillis());
		System.out.println(d.getDate() + "/" + (d.getMonth() + 1) + "/" + (d.getYear() + 1900));
		
		//Calendar
		Calendar c = Calendar.getInstance(); //lay gio hien tai
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) +"-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.HOUR, 20); // cong them 10 tieng voi thoi gian hien tai
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) +"-" + c.get(Calendar.YEAR));
		
		c.add(Calendar.DATE, -14); // tru di 14 ngay
		System.out.println(c.get(Calendar.DATE) + "-" + (c.get(Calendar.MONTH)+1) +"-" + c.get(Calendar.YEAR));
		
		//DateFormat
		DateFormat df = new SimpleDateFormat();
		System.out.println(df.format(d));
		
		df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(d));
		
	}
}
