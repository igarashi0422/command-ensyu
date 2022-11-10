import java.util.Scanner;
 
public class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
 
    System.out.print("身長(m)");
    double height = stdIn.nextDouble();
    System.out.print("体重");
    double weight = stdIn.nextDouble();
 
    double bmi = weight / (height * height);

    System.out.println(String.format("%.2f",bmi));
        System.out.print("身長(m)");
    double height2 = stdIn.nextDouble();
    System.out.print("体重");
    double weight2 = stdIn.nextDouble();

    double bmi2 = weight2 / (height2 * height2);

    System.out.println(String.format("%.2f",bmi2));
  }
}
