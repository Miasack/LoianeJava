package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exer09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Insira a temperatura em Farenheit: ");
        double tempF = scan.nextDouble();
        
        double tempC = (5 *(tempF-32)/9);
        
        System.out.println("A temperatura em Celsius é:" + tempC);
        
        
        
    }
    
}
