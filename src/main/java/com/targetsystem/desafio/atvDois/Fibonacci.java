package com.targetsystem.desafio.atvDois;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numUm = 1, numDois = 0, fibo;

        System.out.println("Digite o numero para saber se é da sequencia de fibonacci");
        fibo = entrada.nextInt();

        for(int i = 0; numUm < fibo; i++){
            numUm = numUm + numDois;
            numDois = numUm - numDois;
        }

        if (numUm != fibo) {
            System.out.println(fibo + " não faz parte da senquência de fibbonacci");
        }else {
            System.out.println(fibo + " faz parte da senquência de fibbonacci");
        }
    }
}
