package logicaloperator;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Is input valid (true/false):");
    boolean a=scan.nextBoolean();
    System.out.println("Does input meet a certain condition(true/false):");
    boolean b=scan.nextBoolean();
    ValidInput(a,b);
	}
    public static void ValidInput(boolean a, boolean b) {
		if(a&&b) 
    	{
    	System.out.println("Input is valid");
    	}
		else if(a||b)
		{
		System.out.println("Input is not valid");
		}
		else
		{
			System.out.println("Hello idiot");
		}
    }
}
