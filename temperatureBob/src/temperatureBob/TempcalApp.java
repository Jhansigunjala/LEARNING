package temperatureBob;

import java.util.Scanner;

public class TempcalApp {

	public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    System.out.println("Welcome to the Temperature Conversion tool! ");
    System.out.println("Select an option:");
    System.out.println("1.Convert Celsius to Fahrenheit");
    System.out.println("2.Convert Fahrenheit to Celsius ");
    System.out.println("Enter your choice:");
    int n=scan.nextInt();
    if(n==1)
    {
       System.out.println("Enter the Temperature:");
       double celsius=scan.nextDouble();
       double c=TempConvert.celsiusToFahrenheit(celsius);
       System.out.println(celsius+"degree C is equivalent to "+c+"F");
    }
    else if(n==2)
    {
       System.out.println("Enter the Temperature:");
       double fahrenheit=scan.nextDouble();
       double f=TempConvert.fahrenheitToCelsius(fahrenheit);
       System.out.println(fahrenheit+"degree F is equivalent to "+f+"C");
    }
    else
    {
    	System.out.println("Idiot fellow");
    }
	}
}
