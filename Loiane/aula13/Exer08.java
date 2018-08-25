package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exer08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o valor/h: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();
        
        double salario = valorHora * horas;
        
        System.out.println("O salário é de: " + salario);
        
        
        
        
    }
    
}
