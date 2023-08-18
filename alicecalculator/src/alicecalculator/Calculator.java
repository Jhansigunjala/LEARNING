package alicecalculator;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter two numbers");
    int a=scan.nextInt();
    int b=scan.nextInt();
    int num=scan.nextInt();
    switch(num)
    {
    case 1:
    	int c=a+b;
    	System.out.println("Addition of two numbers is:"+c);
    	break;
    case 2:
    	int d=a-b;
    	System.out.println("Subtraction of two numbers is:"+d);
    	break;
    case 3:
    	int e=a*b;
    	System.out.println("Multiplication of two numbers is:"+e);
    	break;
    default:
    	int f=a/b;
    	System.out.println("Division of two numbers is:"+f);

    	
    
    }
	}

}
