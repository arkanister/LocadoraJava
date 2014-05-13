
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class MidiaBean extends FornecedorBean{
    private String grupo;
    private String genero;
    private String censura;
    private String diretor;
    private String autor;
    private String produtora;
    private String titulo;
    private String categoria;
    private Date data_lancamento;
    private float valor_custo;
    private float valor_locacao;
    private String sinopse;
    private String etiqueta;

    protected String getGrupo() {
        return grupo;
    }

    protected void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    protected String getGenero() {
        return genero;
    }

    protected void setGenero(String genero) {
        this.genero = genero;
    }

    protected String getCensura() {
        return censura;
    }

    protected void setCensura(String censura) {
        this.censura = censura;
    }

    protected String getDiretor() {
        return diretor;
    }

    protected void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    protected String getProdutora() {
        return produtora;
    }

    protected void setProdutora(String produtora) {
        this.produtora = produtora;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    protected String getCategoria() {
        return categoria;
    }

    protected void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    protected Date getData_lancamento() {
        return data_lancamento;
    }

    protected void setData_lancamento(Date data_lancamento) {
        this.data_lancamento = data_lancamento;
    }

    protected float getValor_custo() {
        return valor_custo;
    }

    protected void setValor_custo(float valor_custo) {
        this.valor_custo = valor_custo;
    }

    protected float getValor_locacao() {
        return valor_locacao;
    }

    protected void setValor_locacao(float valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    protected String getSinopse() {
        return sinopse;
    }

    protected void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    protected String getEtiqueta() {
        return etiqueta;
    }

    protected void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }
}
