import java.util.Scanner;

public class RestaurantOrder {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

        // Print the menu
    System.out.println("Menu:");
    System.out.println("1. Pizza");
    System.out.println("2. Pasta");
    System.out.println("3. Salad");
    // Feel free to add more or different dishes

    // Ask the user to select a dish
    System.out.println("Enter the number of the dish you want to order:");
    int dish = input.nextInt();

    // Confirm the order
    switch (dish) {
      case 1:
        System.out.println("You ordered Pizza.");
        break;
      case 2:
        System.out.println("You ordered Pasta.");
        break;
      case 3:
        System.out.println("You ordered Salad.");
        break;
      default:
        System.out.println("Invalid input");
    }

    // Close the scanner
    input.close();
  }
}