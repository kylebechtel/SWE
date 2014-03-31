

import java.util.Scanner;

/**
 * Created by Kyle Bechtel on 3/5/14.
 */
public class Dependents {

    /*
    Calculates the tax rate based on the number of dependents
     */
    int Tax(int numofdeps){
        int taxrate = 0;
        if(numofdeps == 1) taxrate = 10;
        else if(numofdeps == 2 || numofdeps == 3) taxrate = 25;
        else if (numofdeps > 3) taxrate = 40;
        else if (numofdeps < 0) System.out.println("umm, im not sure what your doing with your kids, but your doing it wrong");

        return taxrate;
    }
    /*
    Gets the number of dependents from the client. If the client enters incorrect data
    or data in the incorrect format it returns 0.
     */
    int getDependents(){
        int Dependents = 0;
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Please enter the number of dependents you claim, no commas or text necessary");
        Dependents = sc.nextInt();
        return Dependents;
        }
        catch(Exception e) {
            System.out.println("Oy, how many kids do you have again");
            return Dependents;
        }
    }
}
