/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class Endereco extends Pessoa{
    private int id;
    private String logradouro;
    private int numero;
    private String bairro;
    private String municipio;
    private char uf;
    private String pais;
    private String cep;
    private String complemento;

    protected int getId() {
        return id;
    }
    
    protected void setId(int id) {
        this.id = id;
    }

    protected String getLogradouro() {
        return logradouro;
    }

    protected void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    protected int getNumero() {
        return numero;
    }
    
    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected String getBairro() {
        return bairro;
    }

    protected void setBairro(String bairro) {
        this.bairro = bairro;
    }

    protected String getMunicipio() {
        return municipio;
    }

    protected void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    protected char getUf() {
        return uf;
    }

    protected void setUf(char uf) {
        this.uf = uf;
    }

    protected String getPais() {
        return pais;
    }

    protected void setPais(String pais) {
        this.pais = pais;
    }

    protected String getCep() {
        return cep;
    }

    protected void setCep(String cep) {
        this.cep = cep;
    }

    protected String getComplemento() {
        return complemento;
    }

    protected void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
