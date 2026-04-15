import java.util.Scanner;

// Class to store weather data
class WeatherData {
    private double temperature;
    private double humidity;

    // Constructor
    public WeatherData(double temperature, double humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    // Method to check alerts
    public String checkAlert() {
        String alertMessage = "";

        if (temperature > 40) {
            alertMessage += "High Temperature Alert";
        } else if (temperature < 10) {
            alertMessage += "Low Temperature Alert";
        }

        if (humidity > 80) {
            if (!alertMessage.isEmpty()) {
                alertMessage += " and ";
            }
            alertMessage += "High Humidity Alert";
        }

        if (alertMessage.isEmpty()) {
            alertMessage = "Weather is Normal";
        }

        return alertMessage;
    }

    // Method to display report
    public void displayReport() {
        System.out.println("\n--- Weather Report ---");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Alert: " + checkAlert());
    }
}

// Main class
public class WeatherApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter Temperature: ");
        double temp = sc.nextDouble();

        System.out.print("Enter Humidity: ");
        double hum = sc.nextDouble();

        // Create object
        WeatherData weather = new WeatherData(temp, hum);

        // Display result
        weather.displayReport();

        sc.close();
    }
}