
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class PessoaBean {
    
    ArrayList lista = new ArrayList();
    
    private String id;
    private String email;
    private int situacao;

    protected String getId() {
        return id;
    }

    protected void setId(String id) {
        this.id = id;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected int getSituacao() {
        return situacao;
    }

    protected void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    
    public PessoaBean(){}
 }
