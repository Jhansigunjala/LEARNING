package temperatureConverter_6;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter celsius and fahrenheit values");
		double far=scan.nextDouble();
		TemperatureConverter temperatureConverter=new TemperatureConverter();
		double celsius=temperatureConverter.convertFahrenheitToCelsius(far);
		System.out.println(celsius);
	}

}
