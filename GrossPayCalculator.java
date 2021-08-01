package chapter2;

import java.util.Scanner;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

public class GossPayCalculator {
    public static void main(String[] args) {
    //
    System.out.println("Enter the number of hours the employee worked.");
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    
    System.out.println("Enter the employee's pay rate.");
    double rate = scanner.nextDouble() ;   

    double grossPay = hours * rate;

    System.out.println(grossPay);
    }
    
}
