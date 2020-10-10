package com.basiljereh.hackerank.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FibonacciSeriesExam {
	/* The name of the class has to be Main. */
    public static void main(String[] args) {
        int n = 0, m = 0;
        int result = -1;
        try (Scanner scanner = new Scanner(new File(args[0]))) {
            String[] numberTokens = scanner.nextLine().split(",");
            n = Integer.parseInt(numberTokens[0]);
            m = Integer.parseInt(numberTokens[1]);
            /* YOUR CODE HERE */
            
            if(checkIfNoIsFib(n) && checkIfNoIsFib(m)){
                int diff = n - m;
                int min = Math.min(n, m);
                if(diff > min ){
                    result = 0;
                } else {
                    result =1;
                }
            } else {
                result =0;
            }
            System.out.println(result);
        }
        catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    //Check Methods
    static boolean checkIfNoIsFib(int n)
    {
        return isSquare(5*n*n + 4) ||
                isSquare(5*n*n - 4);
    }
    //SQR Method
    static  boolean isSquare(int x)
    {
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }
}
