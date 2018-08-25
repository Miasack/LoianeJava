package com.loiane.cursojava.aula13;

import java.util.Scanner;

    public class Exer13 {
        
        public static void main(String[] args) {
            
            Scanner scan = new Scanner(System.in);
            
        System.out.println("Entre com o valor/h: ");
        double valorHora = scan.nextDouble();
        
        System.out.println("Quantidade de horas trabalhadas: ");
        double horas = scan.nextDouble();
        
        double salarioBruto = valorHora * horas;
        
        System.out.println("O salário é de: " + salarioBruto);
            
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double ir = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + ir;
        double salarioLiquido = salarioBruto - totalDescontos;
            
            System.out.println("INSS: " + inss);
            System.out.println("Sindicato: " + sindicato);
            System.out.println("IR: " + ir);
            System.out.println("Total de descontos: " + totalDescontos);
            System.out.println("Salário Líquido a receber é: " + salarioLiquido);
            
        
        
        
        }
}
