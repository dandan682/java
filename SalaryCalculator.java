package chapter3;

public class SalaryCalculator {
    public static public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;
        System.out.println('How many sales did the employee make this week?');
        Scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if(sales > quota) {
            salary = salary + bonus;
        }
        System.out.println("The employee's pay is " + salary);
    }
}