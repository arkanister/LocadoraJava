
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
    private String id;
    private String cnpj;
    private String ie;
    private String razao_social;

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected String getCnpj() {
        return cnpj;
    }

    protected void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    protected String getIe() {
        return ie;
    }

    protected void setIe(String ie) {
        this.ie = ie;
    }

    protected String getRazao_social() {
        return razao_social;
    }

    protected void setRazao_social(String razao_social) {
        this.razao_social = razao_social;
    }
}
