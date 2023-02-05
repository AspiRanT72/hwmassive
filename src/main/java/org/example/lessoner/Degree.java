package org.example.lessoner;

public class Degree implements Idegree {
    private double celsius;

    public Degree(double celsius) {
        this.celsius = celsius;
        ConvertToKelvin(celsius);
        ConvertToFahrenheit(celsius);
    }
}
