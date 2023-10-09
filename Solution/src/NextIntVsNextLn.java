import java.util.Scanner;

public class NextIntVsNextLn {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // Ask for name
      System.out.println("Enter your name:");
      String name = input.nextLine();


      // Ask for surname
      System.out.println("Enter your surname:");
      String surname = input.nextLine();


      // Ask for age
      System.out.println("Enter your age:");
      int age = input.nextInt();


      // Ask for weight
      System.out.println("Enter your weight (in kilos, with a precision of 100g):");
      double weight = input.nextDouble();


      // Print the result
      System.out.printf("Name: %s %s, Age: %d, Weight: %.2f kg\n", name, surname, age, weight);

      // Close the scanner
      input.close();


  }
}
