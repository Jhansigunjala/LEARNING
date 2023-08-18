package temperatureBob;

public class TempConvert {
	
    public static double celsiusToFahrenheit(double celsius) {
    	System.out.println("Enter the Temperature in celsius:");
    	double far=(celsius*9/5)+32;
    	return far;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
    	System.out.println("Enter the Temperature in Fahrenheit");
    	double cel=(fahrenheit-32)*5/9;
    	return cel;
    	
    
	}

}
