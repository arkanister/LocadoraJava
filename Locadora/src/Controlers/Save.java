package Controlers;

import Model.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Save {
    
    private static final String BARRA = File.separator;
    public static final String LOCAL_CLIENTE = ("C:" + BARRA + "Locadora" + BARRA + "Clientes.txt");
    public static final String LOCAL_FORNECEDOR = ("C:" + BARRA + "Locadora" + BARRA + "Fornecedores.txt");
    public static final String LOCAL_MIDIA = ("C:"+BARRA+"Locadora"+BARRA+"Midias.txt");
    public static final String LOCAL_DIRETOR = ("C:"+BARRA+"Locadora"+BARRA+"Diretores.txt");
    public static final String LOCAL_AUTOR = ("C:"+BARRA+"Locadora"+BARRA+"Autores.txt");
    public static final String LOCAL_LOCACAO = ("C:"+BARRA+"Locadora"+BARRA+"Locacoes.txt");
    public static final String LOCAL_LOCACAOMIDIAS = ("C:"+BARRA+"Locadora"+BARRA+"LocacaoMidias.txt");
    
//    public static String CreateFile(){
//        File directory = new File("C:"+BARRA+"Locadora");
//        directory.mkdir();
//        return directory.toString();
//    }
    
    public static boolean createFileCliente(ArrayList<ClienteBean> clientes){
        File file = new File(LOCAL_CLIENTE);
        
        try{
            if(!file.exists())
                file.createNewFile();
            //Metodo para escrever no arquivo(indicacao do arquivo).
            FileWriter fw = new FileWriter(file);
            //Forech para percorrer a lista.
            for(ClienteBean _clientes: clientes){
                //Dados basicos.
                fw.write(_clientes.getId()+";");
                fw.write(_clientes.getCpf()+";");
                fw.write(_clientes.getRg()+";");
                fw.write(_clientes.getNome()+";");
                fw.write(_clientes.getData_aniversario()+";");
                fw.write(_clientes.getSexo()+";");
                //Endereco.
                fw.write(_clientes.getCep()+";");
                fw.write(_clientes.getLogradouro()+";");
                fw.write(_clientes.getNumero_logradouro()+";");
                fw.write(_clientes.getBairro()+";");
                fw.write(_clientes.getMunicipio()+";");
                fw.write(_clientes.getUf()+";");
                fw.write(_clientes.getPais()+";");
                //Contato.
                fw.write(_clientes.getNumero_residencial()+";");
                fw.write(_clientes.getNumero_celular()+";");
                fw.write(_clientes.getEmail()+";");
                fw.write(_clientes.getSituacao()+"\n");
            }
            fw.flush();
            fw.close();
            return true;

        }catch(IOException ex){
            System.out.println("Não foi possivel escrever neste arquivo!");
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean createFileFornecedor(ArrayList<FornecedorBean> fornecedores){
        File file = new File(LOCAL_FORNECEDOR);
        
        try{
            if(!file.exists())
                file.createNewFile();
            
            //Metodo para escrever no arquivo(indicacao do arquivo).
            FileWriter fw = new FileWriter(file);
            //Forech para percorrer a lista.
            for(FornecedorBean _fornecedores: fornecedores){
                //Dados Basicos
                fw.write(_fornecedores.getId()+";");
                fw.write(_fornecedores.getCnpj()+";");
                fw.write(_fornecedores.getInscricao_estadual()+";");
                fw.write(_fornecedores.getRazao_social()+";");
                //Endereco.
                fw.write(_fornecedores.getCep()+";");
                fw.write(_fornecedores.getLogradouro()+";");
                fw.write(_fornecedores.getNumero_logradouro()+";");
                fw.write(_fornecedores.getBairro()+";");
                fw.write(_fornecedores.getMunicipio()+";");
                fw.write(_fornecedores.getUf()+";");
                fw.write(_fornecedores.getPais()+";");
                //Contato.
                fw.write(_fornecedores.getNumero_residencial()+";");
                fw.write(_fornecedores.getNumero_celular()+";");
                fw.write(_fornecedores.getEmail()+";");
                //Situação
                fw.write(_fornecedores.getSituacao()+"\n");
            }
            fw.flush();
            fw.close();
            return true;
        }catch(IOException ex){
            System.out.println("Erro ao cadastrar");
            System.out.println(ex.getMessage());
            return false;
        }
        
    }
    
    public static boolean createFileAutor(ArrayList<AutorBean> autores){
        File file = new File(LOCAL_AUTOR);
        
        try{
        if(!file.exists())file.createNewFile();
            //Metodo para escrever no arquivo(indicacao do arquivo).
            FileWriter fw = new FileWriter(file);
        
            
             //Forech para percorrer a lista.
            for(int i=0; i < autores.size(); i++){
                AutorBean  autor = autores.get(i);
                fw.write(autor.getId()+";");
                fw.write(autor.getNome()+"\n");
            }
            fw.flush();
            fw.close();
            return true;
        }catch(IOException ex){
            System.out.println("Erro ao cadastrar");
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean createFileDiretor(ArrayList<DiretorBean> diretores){
        File file = new File(LOCAL_DIRETOR);
        
        try{
            if(!file.exists())file.createNewFile();
                
            FileWriter fw = new FileWriter(file);
            
            for(DiretorBean _diretores: diretores){
                fw.write(_diretores.getId()+";");
                fw.write(_diretores.getNome()+"\n");
            }
            
            fw.flush();
            fw.close();
            return true;

        }catch(IOException ex){
            System.out.println("Erro ao cadastrar");
            System.out.println(ex.getMessage());
            return false;
        }
    }
        
    public static boolean createFileLocacao(ArrayList<LocacaoBean> locacoes){
        File file = new File(LOCAL_LOCACAO);
        
        try{
            if(!file.exists())file.createNewFile();
                
            FileWriter fw = new FileWriter(file);
            
            for(LocacaoBean locacao: locacoes){
                
                fw.write(locacao.getId()+";");
                fw.write(locacao.getCliente().getId()+";");
                fw.write(locacao.getValor_pago()+";");
                fw.write(locacao.getData_locacao()+";");
                fw.write(locacao.getData_devolucao()+";");
                fw.write(locacao.getSituacao()+"\n");
            }
            fw.flush();
            fw.close();

            createFileLocacaoMidias(locacoes);
            return true;

        }catch(IOException ex){
            System.out.println("Erro ao cadastrar method SAVE");
            System.out.println(ex.getMessage());
            return false;
        }
        
    }

    public static boolean createFileLocacaoMidias(ArrayList<LocacaoBean> locacoes){
        File file = new File(LOCAL_LOCACAOMIDIAS);
        
        try{
            if(!file.exists())file.createNewFile();
                
            FileWriter fw = new FileWriter(file);
            
            for(LocacaoBean locacao: locacoes){
                for (MidiaBean midia: locacao.getMidias()) {
                    fw.write(locacao.getId()+";");
                    fw.write(midia.getId()+"\n");
                }
            }
            fw.flush();
            fw.close();
        }catch(IOException ex){
            System.out.println("Erro ao cadastrar method SAVE");
            System.out.println(ex.getMessage());
            return false;
        }
        return true;
    }
    
    public static boolean  createFileMidia(ArrayList<MidiaBean> midias){
        File file = new File(LOCAL_MIDIA);

        try{

            if(!file.exists())file.createNewFile();
 
            FileWriter fw = new FileWriter(file);
            for(MidiaBean midia: midias){
                String output = midia.getId() + ";" +
                                midia.getFornecedor().getId() + ";" + 
                                midia.getDiretor().getId() + ";" +
                                midia.getAutor().getId() + ";" +
                                midia.getGrupo() + ";" +
                                midia.getGenero() + ";" +
                                midia.getCensura() + ";" +
                                midia.getProdutora() + ";" +
                                midia.getTitulo() + ";" +
                                midia.getCategoria() + ";" +
                                midia.getData_lancamento() + ";" +
                                midia.getValor_custo() + ";" +
                                midia.getValor_locacao() + ";" +
                                midia.getQuantidade() + ";" +
                                midia.getSinopse() + "\n";
                fw.write(output);
            }
            fw.flush();
            fw.close();
            return true;
        } 
        catch(IOException ex){
            System.out.println(ex.getMessage());
            return false;
        }
    }
}
