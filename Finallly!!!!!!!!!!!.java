import java.util.Scanner;

public class CalculatorActual{
  public static void main (String [] args) {

      System.out.println("Enter number: ");
      Scanner scanner = new Scanner(System.in);
      String x = scanner.nextLine();
      System.out.println("this is your number: " + x);
      System.out.println("What do you want to do with it?");
      String letters = scanner.nextLine();
      System.out.println("Do you want to " + letters + " it? Ok then. Put in your number you want to" + letters + "by.");
      String y = scanner.nextLine();
      System.out.println("Your awnser is one of these");
      System.out.println();
      System.out.println(x(y));
      System.out.println(x + y);
      System.out.println(x - y);
  }
}