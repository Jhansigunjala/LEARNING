package methodoverloadingcalculator;

public class Calculator {
public static int calculate(int a,int b) {
	return a+b;
}
public static int calculate(int a,int b,String operator) {
	return a-b;
}
public static int calculate(int a,String operator,int b) {
	return a*b;
}
public static int calculate(String operator,int a,int b) {
	return a/b;
}
}
