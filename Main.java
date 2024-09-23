import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       //code for declaring variables and input of user;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Stock Price(INR only): ");
       double stockPrice = scanner.nextDouble();
       System.out.print("Annual Rate: ");
       double annualRate = scanner.nextDouble();
       annualRate = annualRate / 100 ;
       System.out.println(annualRate);
       System.out.print("Number of Stocks: ");
       double numberOfStocks = scanner.nextDouble();
       System.out.print("Time Period: ");
       double timePeriod = scanner.nextDouble();
       //now code for formulation;
       double power = Math.pow(1 + annualRate,timePeriod);
       double answerOfProblem = (stockPrice * numberOfStocks) * power;
       System.out.println("The price of the stock after " + timePeriod + " is " + answerOfProblem);
    }
}
















