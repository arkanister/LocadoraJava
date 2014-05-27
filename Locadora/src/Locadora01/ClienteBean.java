package Locadora01;

import java.util.Date;

public class ClienteBean extends PessoaBean{
    protected int id;
    protected String cpf;
    protected String rg;
    protected String data_aniversario;
    protected int sexo;
    protected String nome;
    private String situacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_aniversario() {
        return data_aniversario;
    }

    public void setData_aniversario(String data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
