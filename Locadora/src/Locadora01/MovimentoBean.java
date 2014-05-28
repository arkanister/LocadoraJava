package Locadora01;

public class MovimentoBean {
    protected String id;
    protected String cliente_id;
    protected String midia_id;
    protected String valor_total;
    protected String valor_multa;
    protected String valor_pago;
    protected String valor_saldo;
    protected String data_locacao;
    protected String data_devolucao;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getMidia_id() {
        return midia_id;
    }

    public void setMidia_id(String midia_id) {
        this.midia_id = midia_id;
    }
}
