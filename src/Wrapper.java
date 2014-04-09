import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by Kyle Bechtel on 4/9/2014.
 */
public class Wrapper {
	
	public static void Run()
	{
		assert calculateTax(0, 0) == 0;
		assert calculateTax(20000, -1) == 0;
		assert calculateTax(20000, 0) == 800;
		assert calculateTax(20000, 1) == 720;
		assert calculateTax(20000, 3) == 600;
		assert calculateTax(20000, 5) == 480;
		
		assert calculateTax(30000, -1) == 0;
		assert calculateTax(30000, 0) == 1500;
		assert calculateTax(30000, 1) == 1350;
		assert calculateTax(30000, 3) == 1125;
		assert calculateTax(30000, 5) == 900;
		
		assert calculateTax(40000, -1) == 0;
		assert calculateTax(40000, 0) == 2400;
		assert calculateTax(40000, 1) == 2160;
		assert calculateTax(40000, 3) == 1800;
		assert calculateTax(40000, 5) == 1440;
		
		assert calculateTax(50000, -1) == 0;
		assert calculateTax(50000, 0) == 3500;
		assert calculateTax(50000, 1) == 3150;
		assert calculateTax(50000, 3) == 2625;
		assert calculateTax(50000, 5) == 2100;
		
		assert calculateTax(90000, -1) == 0;
		assert calculateTax(90000, 0) == 9000;
		assert calculateTax(90000, 1) == 8100;
		assert calculateTax(90000, 3) == 6750;
		assert calculateTax(90000, 5) == 5400;
		
		assert calculateTax(100000, -1) == 0;
		assert calculateTax(100000, 0) == 13000;
		assert calculateTax(100000, 1) == 11700;
		assert calculateTax(100000, 3) == 9750;
		assert calculateTax(100000, 5) == 7800;
	}

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
