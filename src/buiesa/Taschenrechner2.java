package buiesa;

import java.util.Scanner;

public class Taschenrechner2 {

    public static void main(String[] args) {
        Taschenrechner calculator = new Taschenrechner();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("Choose operation: add, subtract, multiply, divide");
        String operation = scanner.next();

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        double result = 0;
        boolean validOperation = true;

        switch (operation) {
            case "add":
                result = calculator.add(num1, num2);
                break;
            case "subtract":
                result = calculator.subtract(num1, num2);
                break;
            case "multiply":
                result = calculator.multiply(num1, num2);
                break;
            case "divide":
                try {
                    result = calculator.divide(num1, num2);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid operation");
                validOperation = false;
        }

        if (validOperation) {
            System.out.println("The result is: " + result);
        }

        scanner.close();
    }
}

