import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    while(true) {
       Scanner outside = new Scanner(System.in);
        System.out.print("Start the Pridictor(1/2): ");
        int yesNo= outside.nextInt();

    if (yesNo == 1){
        //code for declaring variables and input of user;
       Scanner scanner = new Scanner(System.in);
       System.out.print("Stock Price(INR only): ");
       double stockPrice = scanner.nextDouble();
       System.out.print("Annual Rate: ");
       double annualRate = scanner.nextDouble();
       annualRate = annualRate / 100 ;
       System.out.print("Number of Stocks: ");
       double numberOfStocks = scanner.nextDouble();
       System.out.print("Time Period: ");
       double timePeriod = scanner.nextDouble();
       //now code for formulation;
       double power = Math.pow(1 + annualRate,timePeriod);
       double answerOfProblem = (stockPrice * numberOfStocks) * power;
       System.out.println("The price of the stock after " + timePeriod +  " years" + " is " + answerOfProblem);
    }
    else if (yesNo == 2){
        System.out.println("User dont want to start the pridictor");
    }
    else {
        System.out.println("Boom no input");
    }
    }


    }
}
































