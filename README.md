# Scanner Exercises

In these exercises, you will learn how to use the Scanner class in Java to get input from the user. 

## Exercise 1

In this exercise, you will create a simple program that asks the user for their name and prints a greeting message.

### Instructions

1. Open the `ScannerExperiments.java` file.
2. Inside the `main` method, create a new instance of the `Scanner` class. You can name it `scanner`.
3. Use the `scanner` object to print a message asking the user for their name. For example, "What is your name?".
4. Use the `scanner` object to get the user's input and store it in a variable.
5. Print a greeting message that includes the user's name. For example, "Hello, [user's name]!".
6. Don't forget to close the `scanner` object after you're done using it.

### Starter Code

```java
import java.util.Scanner;

public class ScannerExperiments {

    public static void main(String[] args) {
        // Create a new Scanner object
        

        // Print a message asking the user for their name
        

        // Get the user's input and store it in a variable
        

        // Print a greeting message that includes the user's name
        

        // Close the scanner
       
    }
}
```

Remember to test your code and make sure it works as expected. Happy coding!


## Exercise 2

In this exercise, you will explore the difference between `nextInt()` and `nextLine()` methods of the `Scanner` class. You will also ask the user for their name, surname, age, and weight, and print the result.

### Instructions

1. Open the `ScannerExperiments.java` file.
2. Inside the `main` method, create a new instance of the `Scanner` class. You can name it `input`.
3. Use the `input` object to ask the user for their name, surname, age, and weight (in kilos, with a precision of 100g).
4. Store each input in a separate variable.
5. Print the result in a formatted string.
6. Don't forget to close the `input` object after you're done using it.

### Starter Code

```java
import java.util.Scanner;

public class ScannerExperiments {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        // Ask for name
        System.out.println("Enter your name:");
        

        // Ask for surname
        System.out.println("Enter your surname:");
       

        // Ask for age
        System.out.println("Enter your age:");
        

        // Ask for weight
        System.out.println("Enter your weight (in kilos, with a precision of 100g):");
        

        // Print the result
        System.out.printf("Name: %s %s, Age: %d, Weight: %.2f kg\n", name, surname, age, weight);

        // Close the scanner
        
    }
}
```

Remember to test your code and make sure it works as expected. Happy coding!


## Exercise 3

In this exercise, you will simulate a simple cash register. The user is the cashier and uses our cash register to calculate the total price and the rest for the customer.

### Instructions

1. Open the `CashRegister.java` file.
2. Inside the `main` method, create a new instance of the `Scanner` class. You can name it `input`.
3. Use the `input` object to ask the cashier for the number of boxes the customer has bought, the price for each box, and the amount of cash the customer gives to the cashier.
4. Store each input in a separate variable.
5. Calculate the total price and the rest.
6. Print the total price and the rest.
7. Don't forget to close the `input` object after you're done using it.

### Starter Code

```java
import java.util.Scanner;

public class CashRegister {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        // Ask number of boxes
        System.out.println("Enter the number of boxes:");
        

        // Ask price per box
        System.out.println("Enter the price per box:");
        

        // Ask the amount the customer gives
        System.out.println("Enter the amount the customer gives:");
        

        // Calculate total and rest
        
       

        // Print total and rest
        System.out.printf("Total: %.2f, Rest: %.2f\n", total, rest);

        // Close the scanner
        
    }
}
```

Remember to test your code and make sure it works as expected. Happy coding!


## Exercise 4

In this exercise, you will simulate a basic calculator. The user will enter two numbers and an operator, and the program will perform the operation and print the result.

### Instructions

1. Open the `Calculator.java` file.
2. Inside the `main` method, create a new instance of the `Scanner` class. You can name it `input`.
3. Use the `input` object to ask the user for two numbers and an operator. The operator can be '+', '-', '*', or '/'.
4. Store each input in a separate variable.
5. Use a switch statement to perform the operation based on the operator entered by the user.
6. Print the result of the operation.
7. Don't forget to close the `input` object after you're done using it.

### Starter Code

```java
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);    

        // Ask for the first number
        System.out.println("Enter the first number:");
       

        // Ask for the operator
        System.out.println("Enter an operator (+, -, *, /):");
        char operator = input.next().charAt(0);

        // Ask for the second number
        System.out.println("Enter the second number:");
        

        // Perform the operation and print the result
        switch (operator) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
               //Your Code is here 
                break;
            case '*':
                //Your Code is here 
                break;
            case '/':
                if (num2 != 0) {
                    //Your Code is here 
                } else {
                    System.out.println("Error! Dividing by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Error! Invalid operator. Please enter either +, -, * or /.");
        }

        // Close the scanner
        //Your Code is here 
    }
}
```

Remember to test your code and make sure it works as expected. Happy coding!



## Exercise 5

In this exercise, you will simulate a restaurant ordering system. The user will select a dish from the menu, and the program will print a message confirming the order.

### Instructions

1. Open the `RestaurantOrder.java` file.
2. Inside the `main` method, create a new instance of the `Scanner` class. You can name it `input`.
3. Print a menu with at least three dishes for the user to choose from. Each dish should have a corresponding number.
4. Use the `input` object to ask the user to select a dish by entering the corresponding number.
5. Store the user's selection in a variable.
6. Use a switch statement to print a message confirming the order based on the user's selection.
7. Don't forget to close the `input` object after you're done using it.

### Starter Code

```java
import java.util.Scanner;

public class RestaurantOrder {

    public static void main(String[] args) {
        Scanner input = // your code is here 

        // Print the menu
        System.out.println("Menu:");
        System.out.println("1. Pizza");
        System.out.println("2. Pasta");
        System.out.println("3. Salad");
       // Feel free to add more or different dishes 

        // Ask the user to select a dish
        System.out.println("Enter the number of the dish you want to order:");
        // your code is here 

        // Confirm the order
        switch (dish) {
            case 1:
              // your code is here 
                break;
            case 2:
               // your code is here 
                break;
            case 3:
                // your code is here 
                break;
            default:
              // your code is here 
        }

        // Close the scanner
       // your code is here 
    }
}
```

Remember to test your code and make sure it works as expected. Happy coding!
