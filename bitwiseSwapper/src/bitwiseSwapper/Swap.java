package bitwiseSwapper;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the first integer:");
    int a=scan.nextInt();
    System.out.println("Enter the second integer:");
    int b=scan.nextInt();
    swapUsingBitwise(a,b);
    
	}
   public static void swapUsingBitwise(int a, int b) {
	  a=a^b;
	  b=a^b;
	  a=a^b;
	System.out.println("After swap:"+a+" "+b);
   }
   
}
