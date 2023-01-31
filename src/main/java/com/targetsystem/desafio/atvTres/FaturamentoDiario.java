package com.targetsystem.desafio.atvTres;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class FaturamentoDiario {
    private int dia;
    private Double valor;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void imprimir(ArrayList<FaturamentoDiario> fatDias){
        DecimalFormat decimalFormat;
        decimalFormat = new DecimalFormat("   #,##0.00");
        System.out.println("--------------------------");
        System.out.print((String.format("%-10s", "Dia")));
        System.out.printf("%15s","Valor");
        System.out.println("");
        System.out.println("--------------------------");
        for (int i = 0; i < fatDias.size(); i++){
            System.out.print((String.format("%-10s", fatDias.get(i).getDia())));
            System.out.printf("%15s", decimalFormat.format(fatDias.get(i).getValor()));
            System.out.println("");
        }
    }
}
