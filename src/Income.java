
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kyle Bechtel on 3/5/14.
 */
public class Income {

    double Tax(int income){
        double taxrate = 0;
        if(income > 0 && income <= 20000) taxrate = .04;
        else if(income > 20000 && income <= 30000) taxrate = .05;
        else if(income > 30000 && income <= 40000) taxrate = .06;
        else if(income > 40000 && income <= 50000) taxrate = .07;
        else if(income > 50000 && income <= 90000) taxrate = .10;
        else if(income > 90000) taxrate = .13;
        else if(income <= 0) {
            System.out.println("Error Code: You appear to be homeless, no taxes for you");
        }
        return taxrate;
    }

    /*
    Gets the annual income from the client. If the client enters incorrect data
    or data in the incorrect format it returns 0.
     */
    int getIncome(){
            while(true){
            	int income = 0;
                Scanner sc = new Scanner(System.in);
                try{
                    while(true){
                        System.out.println("Please enter your annual wages, no commas or text necessary.");
                        income = sc.nextInt();
                        if(income > 0)
                        return income;
                        System.out.println("I'm sorry that your annual wage is " + income + ", but I can't do anything with that information. Please try again.\n");
                    }
                }
                catch(Exception e){
                    System.out.println("Are you homeless? please enter a proper input.  numbers only.\n");
                }
            }


    }
}
