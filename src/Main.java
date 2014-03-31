
import java.util.Scanner;

/**
 * Created by Kyle Bechtel on 3/5/14.
 */

public class Main {
    public static void main(String [ ] args) {

        Dependents Dep = new Dependents();
        Income Inc = new Income();
        int annualincome = 1, numofdependents = 0, Incometax, Dependenttax;
        double tax = 0.0;

        // Gets user input
        annualincome = Inc.getIncome();
        numofdependents = Dep.getDependents();

        //Calculates tax rates via the user input
        Incometax = Inc.Tax(annualincome);
        Dependenttax = Dep.Tax(numofdependents);

        //Calculates actual tax rate based
        tax = Incometax * Dependenttax;
        tax = tax/1000;

        System.out.println("income = " + annualincome +  " dependents = " + numofdependents + " tax = " + tax );


    }

}
