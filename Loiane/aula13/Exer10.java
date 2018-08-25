package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exer10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a temperatura em Celsius: ");
        double tempC = scan.nextDouble();
        
        double tempF = tempC * 1.8 + 32;
        
        System.out.println("A temperatura em Farenheit é: " + tempF);
        
        
    }
}
