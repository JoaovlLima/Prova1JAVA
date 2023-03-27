package Prova1;

import java.util.Scanner;

public class Prova {
    Scanner sc = new Scanner(System.in);

    public void exercicio1(){
        System.out.println("Digite o numero da operação matemática a ser feita");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int operacao = sc.nextInt();
        System.out.println("Digite os numeros as serem feita a operação");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        double resultado = 00;

        if(operacao == 1){
          System.out.println("Resultado da operação "+(num1+num2)); 
        } else if (operacao ==2){
            System.out.println("Resultado da operação "+(num1-num2));
        } else if (operacao==3){
            System.out.println("Resultado da operação "+(num1*num2));
        }else if (operacao==4 && num2!=0){
            System.out.println("Resultado da operação "+(num1/num2));
        }
         else{System.out.println("numero da operação não encontrado");
    }

        

    }
    public void exercicio2(){
        System.out.println("Digite o Numero de sua Matricula");
        int numMatricula = sc.nextInt();
        
        if(numMatricula % 4 == 0){
            System.out.println("Você é do Time do Chris");

        }else if (numMatricula % 4==1){
            System.out.println("Você é do Time do Greg");

        }else if (numMatricula % 4==2){
            System.out.println("Você é do Time do Caruso");

        }else if (numMatricula % 4==3){
            System.out.println("Você é do Time do Jerome");
        }
        
        
            
        

    }
    public void exercicio3(){
        System.out.println("Escolha a quantidade em Kg de Maças que você deseja comprar");
        int macas = sc.nextInt();
        System.out.println("Escolha a quantidade em Kg de Morango que você deseja comprar");
        int morango = sc.nextInt();
        System.out.println("Escolha a quantidade em Kg de Bananas que você deseja comprar");
        int banana = sc.nextInt();
        int totalKg = macas + morango + banana;

        double valorMacas = 3.5;
        double valorMorango = 2.3;
        double valorBanana = 1.8;
        double totalPreco = valorBanana+valorMacas+valorMorango;

        double desconto = 00;
        
        if (totalKg > 15 || totalPreco>30){
            desconto= 0.1;

        }
        double precototal = totalPreco*desconto+totalPreco;
        System.out.println("Kg total "+totalKg+"kg");
        System.out.println("Valor total da compra "+precototal+"reais");


    }

    
}
