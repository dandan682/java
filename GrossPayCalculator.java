package chapter2;

import java.util.Scanner;


public class GossPayCalculator {
    public static void main(String[] args) {
    //
    System.out.println("Enter the number of hours the employee worked.");
    Scanner scanner = new Scanner(System.in);
    int hours = scanner.nextInt();
    
    System.out.println("Enter the employee's pay rate");
    double rate = scanner.nextDouble() ;   

    double grossPay = hours * rate;

    System.out.println("The emplyee's gross pay is $" + grossPay);
    }
}
