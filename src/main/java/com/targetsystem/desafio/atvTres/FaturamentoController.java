package com.targetsystem.desafio.atvTres;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FaturamentoController {
        ArrayList<FaturamentoDiario> fatDias;
        FaturamentoDiario fatDia;

        public ArrayList criarFaturamento() {
            fatDias = new ArrayList();
            JSONParser parser = new JSONParser();
            try {
                JSONArray fatDiaArquivo = (JSONArray) parser
                        .parse( new InputStreamReader( new FileInputStream("dados.json")));
                for (Object o : fatDiaArquivo) {
                    JSONObject fatDia_ = (JSONObject) o;
                    int dia = Integer.parseInt(fatDia_.get("dia").toString());
                    Double valor = Double.parseDouble(fatDia_.get("valor").toString());

                    fatDia = new FaturamentoDiario();
                    fatDia.setDia(dia);
                    fatDia.setValor(valor);
                    fatDias.add(fatDia);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            return fatDias;

        }

        public ArrayList<FaturamentoDiario> maiorFatur(ArrayList<FaturamentoDiario> fatDias) {
            ArrayList<FaturamentoDiario> fatDia;
            fatDia = new ArrayList();

            Double maiorValor = 0.0;
            for (int i = 0; i < fatDias.size(); i++) {
                if(fatDias.get(i).getValor() > maiorValor) {
                    maiorValor = fatDias.get(i).getValor();
                }
            }
            for (int i = 0; i < fatDias.size(); i++) {
                if(fatDias.get(i).getValor() >= maiorValor) {
                    maiorValor = fatDias.get(i).getValor();
                    fatDia.add(fatDias.get(i));
                }
            }
            return fatDia;
        }

        public ArrayList<FaturamentoDiario> menorFatur(ArrayList<FaturamentoDiario> fatDias) {
            ArrayList<FaturamentoDiario> fatDia;

            fatDia = new ArrayList<>();

            Double menorValor = 0.0;

            for (int i = 0; i < fatDias.size(); i++) {
                if(fatDias.get(i).getValor() <= menorValor) {
                    menorValor = fatDias.get(i).getValor();
                    fatDia.add(fatDias.get(i));
                }
            }
            return fatDia;
        }

        public Double somaFatur(ArrayList<FaturamentoDiario> fatDias) {
            ArrayList<FaturamentoDiario> fatDia;

            Double total = 0.0;
            for (int i = 0; i < fatDias.size(); i++) {
                total += fatDias.get(i).getValor();
            }
            return total;
        }

        public double mediaFatur(ArrayList<FaturamentoDiario> fatDias) {
            ArrayList<FaturamentoDiario> fatDia;

            int cont = 0;
            Double soma = 0.0;
            Double media = 0.0;
            for (int i = 0; i < fatDias.size(); i++) {
                if (fatDias.get(i).getValor() != 0) {
                    soma += fatDias.get(i).getValor();
                    cont++;
                }
                media = soma / cont;
            }
            return media;
        }

        public int contDiaMaiorFatur(ArrayList<FaturamentoDiario> fatDias) {
            ArrayList<FaturamentoDiario> fatDia;
            FaturamentoController fatCont;
            fatCont = new FaturamentoController();

            int cont = 0;

            int dia = 0;

            for (int i = 0; i < fatDias.size(); i++) {
                if (fatDias.get(i).getValor() > fatCont.mediaFatur(fatDias)) {
                    cont++;
                }
                dia = cont;
            }
            return dia;
        }
}
