import java.util.Scanner;

public class CashRegister {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    // Ask number of boxes
    System.out.println("Enter the number of boxes:");
    int numberOfBoxes = input.nextInt();

    // Ask price per box
    System.out.println("Enter the price per box:");
    double price = input.nextDouble();

    // Ask the amount the customer gives
    System.out.println("Enter the amount the customer gives:");
    double amount = input.nextDouble();

    // Calculate total and rest
    double total = numberOfBoxes * price;
    double rest = amount - total;


    // Print total and rest
    System.out.printf("Total: %.2f, Rest: %.2f\n", total, rest);

    // Close the scanner
    input.close();

  }
}
