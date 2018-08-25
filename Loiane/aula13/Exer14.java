package com.loiane.cursojava.aula13;

import java.util.Scanner;

public class Exer14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            System.out.println("Insira o tamanho em MB: ");
            double tamArquivo = scan.nextDouble();
            
            System.out.println("Insira a velocidade da internet: ");
            double velInternet = scan.nextDouble();
            
            double tempo = tamArquivo / velInternet ;
            
            System.out.println("Tempo de download é: " + tempo);
        
    }
}
