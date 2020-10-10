package com.basiljereh.hackerank.juliandate;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Random;

public class JulianDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yy = GregorianDateToJulianDate("3");
		System.out.println("-------------> : "+yy);

	}
	
	public static final String GregorianDateToJulianDate(String number) {
		JulianDate gtj = new JulianDate();
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date dateobj = new Date();
		//System.out.println(df.format(dateobj));
		Calendar calobj = Calendar.getInstance();
		//System.out.println(gtj.dateToJulian(calobj));
		
		String response = String.valueOf(gtj.dateToJulian(calobj));
		response = response.replace(".", "");
		
		int y = UniqueRandomNumbers();
		
		response =response.concat(String.valueOf(y));
		
		return response;
	}
	

	public double dateToJulian(Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH)+1;
		int day = date.get(Calendar.DAY_OF_MONTH);
		int hour = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		double extra = (100.0 * year) + month - 190002.5;
		return (367.0 * year) -
				(Math.floor(7.0 * (year + Math.floor((month + 9.0) / 12.0)) / 4.0)) +
				Math.floor((275.0 * month) / 9.0) +
				day + ((hour + ((minute + (second / 60.0)) / 60.0)) / 24.0) +
				1721013.5 - ((0.5 * extra) / Math.abs(extra)) + 0.5;
	}
	
	public static int UniqueRandomNumbers() {
		int ret_val = 0;
		
		Random random = new Random();
		// generate a random integer from 0 to 899, then add 100
		int x = random.nextInt(900) + 100;
		
        return ret_val + x;
    }

}
