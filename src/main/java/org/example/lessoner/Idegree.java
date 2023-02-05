package org.example.lessoner;

public interface Idegree {
    default void ConvertToKelvin(double celsius) {
        double kelvin = celsius + 273.15;
        System.out.println("Кельвин: " + String.format("%.2f", kelvin).replace(",", "."));
    }
    default void ConvertToFahrenheit(double celsius) {
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println("Фаренгейт: " + String.format("%.2f", fahrenheit).replace(",", "."));
    }
}
