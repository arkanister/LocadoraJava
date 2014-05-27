import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Leitor {
//Declarando um metodo estatico de um array list do objeto do Fornecedor(Classe FornecedorBean)
    public static ArrayList<FornecedorBean> loaderFile(){
        ArrayList<FornecedorBean> fornecedores = new ArrayList();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL));

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
     public static FornecedorBean searchRegister(String idTela) {
        FornecedorBean fornecedor = new FornecedorBean();

        try{
            BufferedReader reader = new BufferedReader(new FileReader(Salvar.LOCAL));

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
}
