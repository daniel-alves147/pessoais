package br.core.model;

/**
 * @author Daniel
 */
public class Linha {
    
    private String tipoLinha;
    private String contribuinte;
    private String documentoContribuinte;
    private String guia;
    private String valorGuia;
    private String vencimento;
    private String valorTaxa;

    public String getTipoLinha() {
        return tipoLinha;
    }

    public void setTipoLinha(String tipoLinha) {
        this.tipoLinha = tipoLinha;
    }

    public String getContribuinte() {
        return contribuinte;
    }

    public void setContribuinte(String contribuinte) {
        this.contribuinte = contribuinte;
    }

    public String getDocumentoContribuinte() {
        return documentoContribuinte;
    }

    public void setDocumentoContribuinte(String documentoContribuinte) {
        this.documentoContribuinte = documentoContribuinte;
    }

    public String getGuia() {
        return guia;
    }

    public void setGuia(String guia) {
        this.guia = guia;
    }

    public String getValorGuia() {
        return valorGuia;
    }

    public void setValorGuia(String valorGuia) {
        this.valorGuia = valorGuia;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }

    public String getValorTaxa() {
        return valorTaxa;
    }

    public void setValorTaxa(String valorTaxa) {
        this.valorTaxa = valorTaxa;
    }
    
    
}
