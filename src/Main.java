
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * Created by Kyle Bechtel on 3/5/14.
 */

public class Main {
    public static void main(String [ ] args) {

        Dependents Dep = new Dependents();
        Income Inc = new Income();
        int annualincome = 1, numofdependents = 0;
        double tax = 0.0, Incometax = 0, Dependenttax = 0;

        // Gets user input
        annualincome = Inc.getIncome();
        numofdependents = Dep.getDependents();

        //Calculates tax rates via the user input
        Incometax = Inc.Tax(annualincome);
        Dependenttax = Dep.Tax(numofdependents);

        //Calculates actual tax rate based
        //rounds to the nearest third decimal place
        tax = Incometax * Dependenttax;
        BigDecimal bd = new BigDecimal(tax);
        bd = bd.setScale(6, RoundingMode.HALF_UP);
        tax = bd.doubleValue();
        
        System.out.println("income = " + annualincome +  " dependents = " + numofdependents + " tax = " + tax );


    }

}
