package calculator;

import java.util.Scanner;

public class Main extends Calculator {    // using extends keyword

    public static void main(String[] args) {
        char ch;    // variable
        Calculator obj = new Calculator(); // object creation
        Main m =new Main();
        do{
        // scanner declaction
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number : ");
        int b = scanner.nextInt();
        System.out.println("Enter the Any symbol +, - , /, * ");
        char c = scanner.next().charAt(0);
        obj.calculatorResult(a, b, c);
        // scanner declaration
        Scanner scan = new Scanner(System.in);
        System.out.println("if you want to add more calculation please enter \"y\" or \"N \":");
        String x = scan.nextLine();
        ch = x.charAt(0);

        }
        while (ch == 'y' || ch == 'Y') ;  // using while loop
    }
}

