import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask for the first number
    System.out.println("Enter the first number:");
    double num1 = input.nextDouble();


    // Ask for the operator
    System.out.println("Enter an operator (+, -, *, /):");
    char operator = input.next().charAt(0);

    // Ask for the second number
    System.out.println("Enter the second number:");
    double num2 = input.nextDouble();

    // Perform the operation and print the result
    switch (operator) {
      case '+':
        System.out.println("Result: " + (num1 + num2));
        break;
      case '-':
        System.out.println("Result: " + (num1 - num2));
        break;
      case '*':
        System.out.println("Result: " + (num1 * num2));
        break;
      case '/':
        if (num2 != 0) {
          System.out.println("Result: " + (num1 / num2));
        } else {
          System.out.println("Error! Dividing by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Error! Invalid operator. Please enter either +, -, * or /.");
    }

    // Close the scanner
    input.close();
  }
}