package com.loiane.cursojava.aula13;

import java.util.Scanner;

    public class Exer04 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
                System.out.println("Insira a primeira nota: ");
            double nota1 = scan.nextDouble();
            
                System.out.println("Insira a segunda nota: ");
            double nota2 = scan.nextDouble();
            
                System.out.println("Insira a terceira nota: ");
            double nota3 = scan.nextDouble();
            
                System.out.println("Insira a quarta nota: ");
            double nota4 = scan.nextDouble();
            
            System.out.println("A média é: " + (nota1+nota2+nota3+nota4)/4);
            
            
            
        }
}
