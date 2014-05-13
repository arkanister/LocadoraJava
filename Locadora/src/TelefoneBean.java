/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class TelefoneBean extends PessoaBean{
    private char prefixo;
    private String numero;
    private String tipo;


    protected char getPrefixo() {
        return prefixo;
    }

    protected void setPrefixo(char prefixo) {
        this.prefixo = prefixo;
    }

    protected String getNumero() {
        return numero;
    }

    protected void setNumero(String numero) {
        this.numero = numero;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
