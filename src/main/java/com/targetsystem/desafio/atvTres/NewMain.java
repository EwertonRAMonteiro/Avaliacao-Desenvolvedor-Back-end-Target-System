package com.targetsystem.desafio.atvTres;



import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;


public class NewMain {

    public static void main(String[] args) {


        FaturamentoDiario fatDia;
        fatDia = new FaturamentoDiario();

        FaturamentoController fatCont;
        fatCont = new FaturamentoController();

        ArrayList<FaturamentoDiario> fatDias;
        fatDias = fatCont.criarFaturamento();

        DecimalFormat decimalFormat;
        decimalFormat = new DecimalFormat("   #,##0.00");

        System.out.println("****Lista de Faturamento Diario****");
        fatDia.imprimir(fatDias);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****Menor faturamento em um dia****");
        fatDia.imprimir(fatCont.menorFatur(fatDias));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****Maior faturamento em um dia****");
        fatDia.imprimir(fatCont.maiorFatur(fatDias));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****Soma total fo faturamento****");
        System.out.println(decimalFormat.format(fatCont.somaFatur(fatDias)));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****Media do faturamento total****");
        System.out.println(decimalFormat.format(fatCont.mediaFatur(fatDias)));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("****Dias Com Maior Faturamento Acima Da Media****");
        System.out.println(fatCont.contDiaMaiorFatur(fatDias));
    }
}
