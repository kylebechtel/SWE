import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Kyle Bechtel on 4/9/2014.
 */
public class Wrapper {

    public static double calculateTax(int annualincome, int Dependents) {


        Dependents Dep = new Dependents();
        Income Inc = new Income();
        double tax = 0.0, Incometax = 0, Dependenttax = 0;

        // Gets user input
        if(annualincome < 1) return 0;
        if(Dependents < 0) return 0;

        //Calculates tax rates via the user input
        Incometax = Inc.Tax(annualincome);
        Dependenttax = Dep.Tax(Dependents);

        //Calculates actual tax rate based
        //rounds to the nearest third decimal place
        tax = Incometax * annualincome;
        BigDecimal bd = new BigDecimal(tax);
        bd = bd.setScale(6, RoundingMode.HALF_UP);
        tax = bd.doubleValue();

        tax = tax - (tax * Dependenttax);
        BigDecimal b = new BigDecimal(tax);
        b = b.setScale(6, RoundingMode.HALF_UP);

        tax = b.doubleValue();
        System.out.println("income = " + annualincome +  " dependents = " +Dependents + " tax = " + tax );
        return tax;
    }
}
