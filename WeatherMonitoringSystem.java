import java.util.Scanner;

class WeatherData {
    private double t;
    private double h;
    private String ts;
    private String hs;

    public WeatherData(double t, double h) {
        this.t = t;
        this.h = h;
    }

    public void check() {
        if (t > 40) {
            ts = "High Temperature Alert";
        } else if (t < 10) {
            ts = "Low Temperature Alert";
        } else {
            ts = "Normal Temperature";
        }

        if (h > 80) {
            hs = "High Humidity Alert";
        } else {
            hs = "Normal Humidity";
        }
    }

    public void show() {
        System.out.println("\n====== WEATHER REPORT ======");
        System.out.println("Temperature : " + t + " °C");
        System.out.println("Humidity    : " + h + " %");
        System.out.println("Temp Status : " + ts);
        System.out.println("Humid Status: " + hs);
        System.out.println("============================");
    }
}

public class WeatherMonitoringSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("WEATHER MONITORING SYSTEM");
        System.out.print("Enter Temperature: ");
        double t = sc.nextDouble();

        System.out.print("Enter Humidity: ");
        double h = sc.nextDouble();

        WeatherData wd = new WeatherData(t, h);
        wd.check();
        wd.show();
    }
}