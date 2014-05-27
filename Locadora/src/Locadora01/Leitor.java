package Locadora01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

public class Leitor {
    public static ArrayList<FornecedorBean> loaderFileFornecedor(){
        ArrayList<FornecedorBean> fornecedores = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_FORNECEDOR));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                
                FornecedorBean fornecedor = new FornecedorBean();

                fornecedor.setId(Integer.parseInt(st.nextToken()));
                fornecedor.setCnpj(st.nextToken());
                fornecedor.setIe(st.nextToken());
                fornecedor.setRazao_social(st.nextToken());
            //Endereco
                fornecedor.setCep(st.nextToken());
                fornecedor.setLogradouro(st.nextToken());
                fornecedor.setNumero_logradouro(Integer.parseInt(st.nextToken()));
                fornecedor.setBairro(st.nextToken());
                fornecedor.setMunicipio(st.nextToken());
                fornecedor.setUf(st.nextToken());
                fornecedor.setPais(st.nextToken());
            //Contatos
                fornecedor.setNumero_telefone(st.nextToken());
                fornecedor.setNumero_celular(st.nextToken());
                fornecedor.setEmail(st.nextToken());
            //Situacao Ativo ou Inativo.
                fornecedor.setSituacao(st.nextToken());
            //Adicionando os valores na lista de fornecedores.
                fornecedores.add(fornecedor);
            }
            reader.close();

        }catch(IOException ex){

        }
        return fornecedores;
    }
     
    public static FornecedorBean searchRegisterFornecedor(String idTela) {
        FornecedorBean fornecedor = new FornecedorBean();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_FORNECEDOR));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                String id = st.nextToken();

                if (id.trim().equals(idTela.trim())) {
                    fornecedor.setId(Integer.parseInt(id));
                    fornecedor.setCnpj(st.nextToken());
                    fornecedor.setIe(st.nextToken());
                    fornecedor.setRazao_social(st.nextToken());
                //Endereco
                    fornecedor.setCep(st.nextToken());
                    fornecedor.setLogradouro(st.nextToken());
                    fornecedor.setNumero_logradouro(Integer.parseInt(st.nextToken()));
                    fornecedor.setBairro(st.nextToken());
                    fornecedor.setMunicipio(st.nextToken());
                    fornecedor.setUf(st.nextToken());
                    fornecedor.setPais(st.nextToken());
                //Contatos
                    fornecedor.setNumero_telefone(st.nextToken());
                    fornecedor.setNumero_celular(st.nextToken());
                    fornecedor.setEmail(st.nextToken());
                //Situacao Ativo ou Inativo.
                    fornecedor.setSituacao(st.nextToken());
                    break;
                }
            }
            reader.close();

       } catch (FileNotFoundException ex) {
            System.out.println("TESTE não encontrado");
       } catch (IOException ex) {
            System.out.println("Erro na leitura do arquivo");
       }
       return fornecedor;
    }

    public static ArrayList<ClienteBean> loaderFileCliente(){
        ArrayList<ClienteBean> clientes = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_CLIENTE));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                
                ClienteBean cliente = new ClienteBean();

                cliente.setId(Integer.parseInt(st.nextToken()));
                cliente.setCpf(st.nextToken());
                cliente.setRg(st.nextToken());
                cliente.setNome(st.nextToken());
                cliente.setData_aniversario(st.nextToken());
            //Endereco
                cliente.setCep(st.nextToken());
                cliente.setLogradouro(st.nextToken());
                cliente.setNumero_logradouro(Integer.parseInt(st.nextToken()));
                cliente.setBairro(st.nextToken());
                cliente.setMunicipio(st.nextToken());
                cliente.setUf(st.nextToken());
                cliente.setPais(st.nextToken());
            //Contatos
                cliente.setNumero_telefone(st.nextToken());
                cliente.setNumero_celular(st.nextToken());
                cliente.setEmail(st.nextToken());
            //Situacao Ativo ou Inativo.
                cliente.setSituacao(st.nextToken());
            
            //Adicionando os valores na lista de fornecedores.
                clientes.add(cliente);
            }
            reader.close();

        }catch(IOException ex){

        }
        return clientes;
    }
    
    public static ClienteBean searchFileCliente(String idTela){
        ClienteBean cliente = new ClienteBean();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_CLIENTE));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                String id = st.nextToken();
                
                
                if (id.trim().equals(idTela.trim())) {
                cliente.setId(Integer.parseInt(st.nextToken()));
                cliente.setCpf(st.nextToken());
                cliente.setRg(st.nextToken());
                cliente.setNome(st.nextToken());
                cliente.setData_aniversario(st.nextToken());
            //Endereco
                cliente.setCep(st.nextToken());
                cliente.setLogradouro(st.nextToken());
                cliente.setNumero_logradouro(Integer.parseInt(st.nextToken()));
                cliente.setBairro(st.nextToken());
                cliente.setMunicipio(st.nextToken());
                cliente.setUf(st.nextToken());
                cliente.setPais(st.nextToken());
            //Contatos
                cliente.setNumero_telefone(st.nextToken());
                cliente.setNumero_celular(st.nextToken());
                cliente.setEmail(st.nextToken());
            //Situacao Ativo ou Inativo.
                cliente.setSituacao(st.nextToken());
            
            //Adicionando os valores na lista de fornecedores.
                }
            }
            reader.close();

       } catch (FileNotFoundException ex) {
            System.out.println("TESTE não encontrado");
       } catch (IOException ex) {
            System.out.println("Erro na leitura do arquivo");
       }
        return cliente;
    }
    
    public static ArrayList<MidiaBean> loaderFileMidia(){
        ArrayList<MidiaBean> midias = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_MIDIA));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                
                MidiaBean midia = new MidiaBean();

                midia.setId(st.nextToken());
                midia.setFornecedor_id(st.nextToken());
                midia.setGrupo(st.nextToken());
                midia.setGenero(st.nextToken());
                midia.setCensura(st.nextToken());
                midia.setTitulo(st.nextToken());
                midia.setAutor(st.nextToken());
                midia.setDiretor(st.nextToken());
                midia.setCategoria(st.nextToken());
                midia.setValor_custo(st.nextToken());
                midia.setValor_locacao(st.nextToken());
                
                midias.add(midia);
            }
            reader.close();

        }catch(IOException ex){

        }
        return midias;
    }
    
    public static MidiaBean searchRegisterMidia(String idTela) {
        MidiaBean midia = new MidiaBean();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL_MIDIA));

            while(reader.ready()){
                String line = reader.readLine(); //declarando uma variavel e recebendo a linha do arquivo.
                StringTokenizer st = new StringTokenizer(line, ";"); //Lendo a linha e verificando os valores.
                String id = st.nextToken();

                if (id.trim().equals(idTela.trim())) {
                    midia.setId(st.nextToken());
                    midia.setFornecedor_id(st.nextToken());
                    midia.setGrupo(st.nextToken());
                    midia.setGenero(st.nextToken());
                    midia.setCensura(st.nextToken());
                    midia.setTitulo(st.nextToken());
                    midia.setAutor(st.nextToken());
                    midia.setDiretor(st.nextToken());
                    midia.setCategoria(st.nextToken());
                    midia.setValor_custo(st.nextToken());
                    midia.setValor_locacao(st.nextToken());
                    break;
                }
            }
            reader.close();

       } catch (FileNotFoundException ex) {
            System.out.println("TESTE não encontrado");
       } catch (IOException ex) {
            System.out.println("Erro na leitura do arquivo");
       }
       return midia;
    }
}