package bitcounter;

import java.util.Scanner;

public class BitCounter {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter an integer:");
    int a=scan.nextInt();
    int res=countSetBits(a);
    System.out.println("Number of set bits:"+res);
	}
    public static int countSetBits(int x)
    {
    	int count=0;
    	while(x!=0) {
    		count += x&1;
    		x >>=1;
    	}
    	return count;
    }
}
