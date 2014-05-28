package Locadora01;

public class MovimentoBean {
//Locacao
        protected String cliente_id;
        protected String locacao_id;
        protected String midia_titulo;
        protected String midia_valor_locacao;
        protected String midia_grupo;
        protected String data_locacao;
        protected String valor_total;
//Devolução
        protected String devolucao_id;
        protected String valor_multa;
        protected String valor_pago;
        protected String valor_saldo;
        protected String data_devolucao;

    public String getDevolucao_id() {
        return devolucao_id;
    }

    public void setDevolucao_id(String id) {
        this.devolucao_id = id;
    }

    public String getValor_total() {
        return valor_total;
    }

    public void setValor_total(String valor_total) {
        this.valor_total = valor_total;
    }

    public String getValor_multa() {
        return valor_multa;
    }

    public void setValor_multa(String valor_multa) {
        this.valor_multa = valor_multa;
    }

    public String getValor_pago() {
        return valor_pago;
    }

    public void setValor_pago(String valor_pago) {
        this.valor_pago = valor_pago;
    }

    public String getValor_saldo() {
        return valor_saldo;
    }

    public void setValor_saldo(String valor_saldo) {
        this.valor_saldo = valor_saldo;
    }

    public String getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(String data_locacao) {
        this.data_locacao = data_locacao;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getCliente_id() {
        return cliente_id;
    }

    public void setCliente_id(String cliente_id) {
        this.cliente_id = cliente_id;
    }

    public String getLocacao_id() {
        return locacao_id;
    }

    public void setLocacao_id(String locacao_id) {
        this.locacao_id = locacao_id;
    }

    public String getMidia_titulo() {
        return midia_titulo;
    }

    public void setMidia_titulo(String midia_titulo) {
        this.midia_titulo = midia_titulo;
    }

    public String getMidia_valor_locacao() {
        return midia_valor_locacao;
    }

    public void setMidia_valor_locacao(String midia_valor_locacao) {
        this.midia_valor_locacao = midia_valor_locacao;
    }

    public String getMidia_grupo() {
        return midia_grupo;
    }

    public void setMidia_grupo(String midia_grupo) {
        this.midia_grupo = midia_grupo;
    }
}
