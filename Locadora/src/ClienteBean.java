
import java.util.Date;
import java.util.List;
import javax.print.attribute.standard.DateTimeAtCompleted;

public class ClienteBean extends PessoaBean{
    protected int id;
    protected String cpf;
    protected String rg;
    protected Date data_aniversario;
    protected int sexo;
    protected String foto;
    protected String nome;
    protected Date data_cadastro;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Date getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }
}