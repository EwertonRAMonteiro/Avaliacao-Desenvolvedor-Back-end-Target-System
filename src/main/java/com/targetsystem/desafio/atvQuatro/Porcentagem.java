package com.targetsystem.desafio.atvQuatro;


import java.text.DecimalFormat;

public class Porcentagem {

    public static void main(String[] args) {

        DecimalFormat decimalFormat;
        decimalFormat = new DecimalFormat(" #,##0.00");

        Double SOMA = (double) 0;
        Double PERCENT;

        String[] rotulo;
        rotulo = new String[5];

        rotulo[0] = "SP";
        rotulo[1] = "RJ";
        rotulo[2] = "MG";
        rotulo[3] = "ES";
        rotulo[4] = "Outros";


        Double[] valor;
        valor = new Double[5];

        valor[0] = 67836.43;
        valor[1] = 36678.66;
        valor[2] = 29229.88;
        valor[3] = 27165.48;
        valor[4] = 19849.53;


        for (int i =0 ; i < valor.length; i++){
            SOMA += valor[i];
        }
        System.out.println("O Valor Total é: R$" + decimalFormat.format(SOMA));

        for (int i = 0 ; i < valor.length; i++) {
            PERCENT = (valor[i]/SOMA)*100;
            System.out.println( rotulo[i] + " Representa" + decimalFormat.format(PERCENT) + "%" +
                    " do valor total e tem um faturamento mensal de R$" + decimalFormat.format(valor[i]));
        }


    }
}
