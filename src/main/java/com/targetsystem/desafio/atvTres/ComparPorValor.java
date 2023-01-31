package com.targetsystem.desafio.atvTres;

import java.util.Comparator;

class ComparPorValor implements Comparator<FaturamentoDiario> {

    @Override
    public int compare(FaturamentoDiario o1, FaturamentoDiario o2) {

            if (o1 == null || o2 == null);
        assert o1 != null;
        Double valorUm = o1.getValor();
        assert o2 != null;
        Double valorDois = o2.getValor();

        return valorUm.compareTo( valorDois);
    }
}
