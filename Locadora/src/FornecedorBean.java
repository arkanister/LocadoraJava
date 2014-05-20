
import java.util.Date;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class FornecedorBean extends PessoaBean{
    protected int id;
    protected String cnpj;
    protected String ie;
    protected String razao_social;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public String getRazao_social() {
        return razao_social;
    }

    public void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }

    public FornecedorBean() {
    }

    public FornecedorBean(int id, String cnpj, String ie, String razao_social) {
        this.id = id;
        this.cnpj = cnpj;
        this.ie = ie;
        this.razao_social = razao_social;
    }

    @Override
    public String toString() {
        return id + razao_social + cnpj + ie;
    }
    
    
}
