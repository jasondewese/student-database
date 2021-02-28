import java.util.Scanner;

public class Methods {
    public static void greetUser(){
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.print("What is your name? ");
        name = scan.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!"); 
    }

    public static void addTwoNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter another number: ");
        double num2 = scan.nextDouble();
        double sum = sum(num1, num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    public static double sum(double a, double b) {
        return a + b;
    }
}