package com.loiane.cursojava.aula14;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        /*System.out.print("Entre com sua idade: ");
        int idade = scan.nextInt();
        
        if (idade >= 18){
            System.out.println("É maior de idade.");
        }else{
            System.out.println("É menor de idade.");
        }*/
        //barato: valor <= 10
        //pedir desconto: valor <=15 && valor >10 
        //pesquisar mais: valor <=17 && valor >15
        //caro: valor > 17
        
        System.out.println("Entre com o valor do produto: ");
        double valor = scan.nextDouble();
        
        if (valor <= 10){
            System.out.println("Produto barato!");
        } else if (valor <=15 && valor >10){
            System.out.println("Peça um desconto!");
        } else if (valor <=17 && valor >15){
            System.out.println("Pesquise mais!");
        } else { 
            System.out.println("Ta caro!");
        }   
    }
}   

