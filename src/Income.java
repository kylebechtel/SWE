
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Kyle Bechtel on 3/5/14.
 */
public class Income {

    int Tax(int income){
        int taxrate =0;
        if(income > 0 && income <= 20000) taxrate = 4;
        else if(income > 20000 && income <= 30000) taxrate = 5;
        else if(income > 30000 && income <= 40000) taxrate = 6;
        else if(income > 40000 && income <= 50000) taxrate = 7;
        else if(income > 50000 && income <= 90000) taxrate = 10;
        else if(income > 90000) taxrate = 13;
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
        int income = 0;
        Scanner sc = new Scanner(System.in);
            while(true){

                try{
                    while(true){
                        System.out.println("Please enter your annual wages, no commas or text necessary");
                        income = sc.nextInt();
                        if(income > -1)
                        return income;
                    }
                }
                catch(Exception e){
                    System.out.println("Are you homeless? please enter a proper input.  numbers only");
                    //return income;
                }
            }


    }
}
