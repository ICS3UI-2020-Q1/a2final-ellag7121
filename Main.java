import java.util.Scanner;
/**
 * asks the user for diameter of pizza, calculates the subtotal, tax and total price of the pizza and sends the user a message depending on the size of the pizza
 * @author Graham Ellacott
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //create a scanner to get the user's input
    Scanner input = new Scanner(System.in);
    
    //initialize variables
    double diameter; //the diameter of the pizza
    double subtotal; //the initial price (pre tax)
    double tax; //the tax added to the initial price
    double total; //the total price (subtotal + tax)

    //initialize constants
    final double SALES_TAX = 0.13; //the amount to multiply the subtotal by to get the tax
    // - - - PRICES - - - //
    final double PRICE_LABOUR = 0.75; //cost to add to the price for labour
    final double PRICE_POWER = 0.99; //cost to add to the price for powering the ovens
    final double PRICE_SIZE = 0.5; //cost for each centemeter of the diameter to be added to the price
    // - - - SIZE - - - //
    final double SIZE_20 = 20; //the minimum diameter to check for if the pizza is medium
    final double SIZE_40 = 40; //the minimum diameter to check if the pizza is large


    //ask user for diameter of pizza
    System.out.println("What is the size of the pizza (in cm):");
    diameter = input.nextDouble(); //store it in the diameter variable

    //calculate the price for the pizza and store it in the subtotal variable
    subtotal = PRICE_LABOUR + PRICE_POWER + (diameter*PRICE_SIZE); //multiply the diameter by the price per centimeter and add it to the other charges

    //multiply subtotal by sales tax to get tax amount
    tax = subtotal*SALES_TAX;

    //add tax to subtotal to get the total
    total = subtotal + tax;

    //tell the user the subtotal
    System.out.println("Subtotal: $" + subtotal);

    //tell the user the taxes
    System.out.println("Taxes: $" + tax);

    //tell the user the total
    System.out.println("Total: $" + total);

    //add message at the end
    // check diameter size 
    if (diameter > SIZE_40){  //if the diameter is bigger than 40cm
      //say large pizza message
      System.out.println("Whoa, big pizza! You might need a truck to get this home!"); 
    }else if (diameter > SIZE_20){  //if the diameter is between 40cm and 20cm
      //say medium pizza message
      System.out.println("This will be delicious!"); 
    }else{ //if the diameter id less than 20cm
      //say small pizza message
      System.out.println("We are going to make you a cute little pizza!"); 
    }
  }
}
