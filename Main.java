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
  }
}
