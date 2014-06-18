package Controlers;

import Model.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Read {
    private static final String BARRA = File.separator;
    
    public static ArrayList<LocacaoBean> readerFileLocacao(){
        ArrayList<LocacaoBean> locacoes = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_LOCACAO));
        
            while(reader.ready()){
            
                String line = reader.readLine();
                StringTokenizer st = new StringTokenizer(line, ";");

                LocacaoBean locacao = new LocacaoBean();

                locacao.setId(Integer.valueOf(st.nextToken()));
                locacao.setCliente(searchCliente(Integer.valueOf(st.nextToken())));
                locacao.setMidias(searchLocacaoMidias(locacao.getId()));
                locacao.setValor_pago(st.nextToken());
                locacao.setData_locacao(st.nextToken());
                locacao.setData_devolucao(st.nextToken());
                locacao.setSituacao(Integer.valueOf(st.nextToken()));

                locacoes.add(locacao);
            }
            reader.close();
        
        }catch(IOException ex){ 
            System.out.println("Erro ao ler o arquivo");
            System.out.println(ex.getMessage());}
        
        return locacoes;
    }
    
    public static ArrayList<MidiaBean> searchLocacaoMidias(int locacao_id){
        ArrayList<MidiaBean> midias = new ArrayList();
        
        try{
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_LOCACAOMIDIAS));
            
            while(reader.ready()){
                String line = reader.readLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                
                if(locacao_id == Integer.valueOf(st.nextToken())){
                    midias.add(searchMidia(Integer.valueOf(st.nextToken())));
                }
            }
            reader.close();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return midias;
    }
    
    public static LocacaoBean searchLocacao(int id){
        ArrayList<LocacaoBean> locacoes = readerFileLocacao();
        for (LocacaoBean locacao : locacoes) {
            if (locacao.getId() == id)
                return locacao;
        }
        return null;
    }
        
    public static ArrayList<AutorBean> readerFileAutor(){
        ArrayList<AutorBean> autores = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_AUTOR));
        
            while(reader.ready()){
            
                String line = reader.readLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                
                AutorBean autor = new AutorBean();
                autor.setId(Integer.parseInt(st.nextToken()));
                autor.setNome(st.nextToken());
                
                autores.add(autor);
                System.out.println("Salvar:"+autor);
            }
            reader.close();
        
        }catch(IOException ex){ 
            System.out.println("Erro ao ler o arquivo");
            System.out.println(ex.getMessage());}
        
        return autores;
    }
    
    public static AutorBean searchAutor(int id){
        ArrayList<AutorBean> autores = readerFileAutor();

        for (AutorBean autor : autores) {
            if(autor.getId() == id){
                return autor;
            }
        }
        return null;
    }
        
    public static DiretorBean searchDiretor(int id){
        ArrayList<DiretorBean> diretores = readerFileDiretor();
        
        for(DiretorBean diretor: diretores){
            if(diretor.getId() == id){
                return diretor;
            }
        }
        return null;
    }
    
    public static ArrayList<DiretorBean> readerFileDiretor(){
        ArrayList<DiretorBean> diretores = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_DIRETOR));
        
            while(reader.ready()){
                String line = reader.readLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                
                DiretorBean diretor = new DiretorBean();
                diretor.setId(Integer.parseInt(st.nextToken()));
                diretor.setNome(st.nextToken());
                diretores.add(diretor);
            }
            reader.close();
        
        }catch(IOException ex){ 
            System.out.println("Erro ao ler o arquivo");
            System.out.println(ex.getMessage());}
        
        return diretores;
    }
    
    public static ArrayList<ClienteBean> readerFileCliente(){
        ArrayList<ClienteBean> clientes = new ArrayList();
        
        try{
            //Estanciando um leitor do arquivo clientebean.
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_CLIENTE));
            //Responsavel por verificar o metodo acima esta pronto.
            while(reader.ready()){
                String line = reader.readLine();                      //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line,";"); //Lendo a linha e verificando os valores.
                
                ClienteBean cliente = new ClienteBean();
                //Dados basicos.
                cliente.setId(Integer.valueOf(st.nextToken()));
                cliente.setCpf(st.nextToken());
                cliente.setRg(st.nextToken());
                cliente.setNome(st.nextToken());
                cliente.setData_aniversario(st.nextToken());
                cliente.setSexo(st.nextToken());
                //Endereco
                cliente.setCep(st.nextToken());
                cliente.setLogradouro(st.nextToken());
                cliente.setNumero_logradouro(st.nextToken());
                cliente.setBairro(st.nextToken());
                cliente.setMunicipio(st.nextToken());
                cliente.setUf(st.nextToken());
                cliente.setPais(st.nextToken());
                //Contato
                cliente.setNumero_residencial(st.nextToken());
                cliente.setNumero_celular(st.nextToken());
                cliente.setEmail(st.nextToken());
                cliente.setSituacao(st.nextToken());
                
                
                clientes.add(cliente);
            }
            
            reader.close();
            
        }catch(IOException ex){
            System.out.println("Erro ao ler o arquivo");
            System.out.println(ex.getMessage());
        }
        return clientes;
    }
    
    public static ClienteBean searchCliente(int id){
        ArrayList<ClienteBean> clientes = readerFileCliente();
        
        for (ClienteBean cliente : clientes) {
            if(cliente.getId() == id){
                return cliente;
            }
        }
        return null;
    }
    
    public static ArrayList<MidiaBean> readerFileMidia(){
        ArrayList<MidiaBean> midias = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_MIDIA));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                
                MidiaBean midia = new MidiaBean();

                midia.setId(Integer.valueOf(st.nextToken()));
                midia.setFornecedor(searchRegisterFornecedor(Integer.valueOf(st.nextToken())));
                midia.setDiretor(searchDiretor(Integer.valueOf(st.nextToken())));
                midia.setAutor(searchAutor(Integer.valueOf(st.nextToken())));
                midia.setGrupo(st.nextToken());
                midia.setGenero(st.nextToken());
                midia.setCensura(st.nextToken());
                midia.setProdutora(st.nextToken());
                midia.setTitulo(st.nextToken());
                midia.setCategoria(st.nextToken());
                midia.setData_lancamento(st.nextToken());
                midia.setValor_custo(st.nextToken());
                midia.setValor_locacao(st.nextToken());
                midia.setQuantidade(Integer.valueOf(st.nextToken()));
                midia.setSinopse(st.nextToken());
                midias.add(midia);
            }
            reader.close();

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
        return midias;
    }
    
    public static MidiaBean searchMidia(int id) {
        ArrayList<MidiaBean> midias = readerFileMidia();
        
        for (MidiaBean midia : midias) {
            if(midia.getId() == id){
                return midia;
            }
        }
        return null;
    }
    
    public static ArrayList<FornecedorBean> readerFileFornecedor() {
        ArrayList<FornecedorBean> fornecedores = new ArrayList();

        try {
            BufferedReader reader = new BufferedReader(new FileReader(Save.LOCAL_FORNECEDOR));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                
                FornecedorBean fornecedor = new FornecedorBean();
                fornecedor.setId(Integer.valueOf(st.nextToken()));
                fornecedor.setCnpj(st.nextToken());
                fornecedor.setInscricao_estadual(st.nextToken());
                fornecedor.setRazao_social(st.nextToken());
                fornecedor.setCep(st.nextToken());
                fornecedor.setLogradouro(st.nextToken());
                fornecedor.setNumero_logradouro(st.nextToken());
                fornecedor.setBairro(st.nextToken());
                fornecedor.setMunicipio(st.nextToken());
                fornecedor.setUf(st.nextToken());
                fornecedor.setPais(st.nextToken());
                fornecedor.setNumero_residencial(st.nextToken());
                fornecedor.setNumero_celular(st.nextToken());
                fornecedor.setEmail(st.nextToken());
                fornecedor.setSituacao(st.nextToken());
                fornecedores.add(fornecedor);
            }
            reader.close();

        }catch(IOException ex){
            System.out.println("Não foi possivel ler");
            System.out.println(ex.getMessage());
        }
        return fornecedores;
    }
     
    public static FornecedorBean searchRegisterFornecedor(int id) {
        ArrayList<FornecedorBean> fornecedores = readerFileFornecedor();

        for (FornecedorBean fornecedor : fornecedores) {
            if (fornecedor.getId() == id)
                return fornecedor;
        }

        return null;
    }
}
