//The parameters of the function should be celsius and fahrenheit. The type should be a double. The functions return a value that is a double.

public class CtoFTester {
    public double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}