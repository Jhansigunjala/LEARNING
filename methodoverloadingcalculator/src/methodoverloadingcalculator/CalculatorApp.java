package methodoverloadingcalculator;

import java.util.Scanner;

public class CalculatorApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first number:");
    int a=scan.nextInt();
    System.out.println("Enter the second number:");
    int b=scan.nextInt();
    System.out.println("Enter the operator ");
    String o=scan.next();
    
    switch(o)
    {
    case "+":
    	int add=Calculator.calculate(a,b);
    	System.out.println("Addition of a and b is:"+add);
    	break;
    case "-":
    	int sub=Calculator.calculate(a,b,o);
    	System.out.println("Subtraction of a and b is:"+sub);
    	break;
    case "*":	
    	int mul=Calculator.calculate(a,o,b);
    	System.out.println("Multiplication of a and b is:"+mul);
    	break;
    case "/":	
    	int div=Calculator.calculate(o,a,b);
    	System.out.println("Division of a and b is:"+div);
    	break;
    default:
    	System.out.println("Idiot.....");
	}
    
    	
    }
}
