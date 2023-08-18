package taxcalculator;

import java.util.Scanner;

public class Tax {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    double p=scan.nextDouble();
    System.out.println("Enter the purchase amount:"+p);
    double r=scan.nextDouble();
    System.out.println("Enter the tax rate:"+r);
    double res=calculateTotalWithTax(p,r);
    System.out.println("Total cost including tax:"+res);
	}
	public static double calculateTotalWithTax(double purchase, double tax ) {
		double total=(purchase*tax)+purchase;	
		return total;
	}

}
