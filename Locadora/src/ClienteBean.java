
import java.util.Date;
import java.util.List;
import javax.print.attribute.standard.DateTimeAtCompleted;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class ClienteBean extends PessoaBean{
    private int id;
    private String cpf;
    private String rg;
    private Date data_aniversario;
    private int sexo;
    private String foto;
    private String nome;

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getRg() {
        return rg;
    }

    protected void setRg(String rg) {
        this.rg = rg;
    }

    protected Date getData_aniversario() {
        return data_aniversario;
    }

    protected void setData_aniversario(Date data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

    protected int getSexo() {
        return sexo;
    }

    protected void setSexo(int sexo) {
        this.sexo = sexo;
    }

    protected String getFoto() {
        return foto;
    }

    protected void setFoto(String foto) {
        this.foto = foto;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

}