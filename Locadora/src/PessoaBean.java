
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class PessoaBean {
    
    ArrayList lista = new ArrayList();
    
    private int id = 0;
    private String etiqueta;
    private String nome;
    private String email;
    private Date data_cadastro;
    private int situacao;

    
    
    /**
     * @return the id
     */
    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getEtiqueta() {
        return etiqueta;
    }

    protected void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected Date getData_cadastro() {
        return data_cadastro;
    }

    protected void setData_cadastro(Date data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    protected int getSituacao() {
        return situacao;
    }

    protected void setSituacao(int situacao) {
        this.situacao = situacao;
    }
    
    public PessoaBean(){}
   
 }