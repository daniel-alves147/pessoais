package br.core;

import br.core.model.Linha;
import java.util.ArrayList;

/**
 * @author Daniel
 */
public class Core {

    // Remove o X
    public ArrayList<Linha> step1(ArrayList<Linha> arrayList) {
        ArrayList<Linha> lista = arrayList;
        for (Linha linha : lista) {
            if (linha != null) {
                if (linha.getContribuinte().toUpperCase().contains("X")) {
                    String valor = linha.getContribuinte().toUpperCase().replace("X", "");
                    linha.setContribuinte(valor);
                }
            }
        }
        return lista;
    }

    public ArrayList<Linha> step2(ArrayList<Linha> arrayList) {
        ArrayList<Linha> lista = arrayList;
        String a = "517144           201404005004445301201405140000000022407201405262016031500189912301899123004077882000144  "
                +  "527144           20140420140514CORREÇÃO MONETÁRIA ref Apuração 38640 período 4 ano 2014    00000000027992014052600111305010050044453";
        for (Linha linha : lista) {
            if(linha != null){
                if(linha.getDocumentoContribuinte() != null &&
                   linha.getContribuinte() != null &&
                   linha.getGuia() != null){
                    if(linha.getTipoLinha().equals("51")){
                        
                    }
                }
            }
        }
        return lista;
    }
    
    // Leitura do arquivo
    
    
}
