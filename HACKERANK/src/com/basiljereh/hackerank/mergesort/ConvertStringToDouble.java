package com.basiljereh.hackerank.mergesort;

import java.text.DecimalFormat;

public class ConvertStringToDouble {

	private static DecimalFormat df2 = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		
		String a ="2461.8";
		String b ="100";
		String c ="0";
		
		Double aa = Double.valueOf(a);
		Double bb = Double.valueOf(b);
		Double cc = Double.valueOf(c);
		
		System.out.println("string : " + a);
        System.out.println("double : " + df2.format(aa));
        System.out.println("double : " + df2.format(cc)); 
        
        cc = aa * bb;
        
        System.out.println("double : " + df2.format(cc)); 
        
        Double dd = (cc /100);
        System.out.println("double : " + df2.format(dd));
        
        String sss = dd.toString();
        System.out.println("string : " + sss);
        
        String x = formatAmount("2461.8","100");
        System.out.println("ret val : " + x);
	}
	
	public static String formatAmount(String amount, String centsMultiplier) {

		String c ="0";
		
		Double amt = Double.valueOf(amount);
		Double cnt = Double.valueOf(centsMultiplier);
		Double mlt = Double.valueOf(c);
		
        
		mlt = amt * cnt;
         
        return df2.format(mlt);
	}
}
