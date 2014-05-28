package Locadora01;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Salvar {
    //Decladado as variaveis que não podem ser alteradas. 
    private static final String BARRA = File.separator;
    public static final String LOCAL_FORNECEDOR = ("c:"+ BARRA + "Locadora" + BARRA + "Fornecedores.txt");
    public static final String LOCAL_CLIENTE = ("c:"+ BARRA + "Locadora" + BARRA + "Clientes.txt");
    public static final String LOCAL_MIDIA = ("c:"+ BARRA + "Locadora" + BARRA + "Midias.txt");
    public static final String LOCAL_MOVIMENTO = ("c:"+ BARRA + "Locadora" + BARRA + "Movimentos.txt");
    
    //Metodo responsavel por gravar os dados que estão armazenados no array list no arquivo
    public static boolean  saveFileFornecedor(ArrayList<FornecedorBean> fornecedores){
        File file = new File(LOCAL_FORNECEDOR);
    
        try{
            //Se o arquivo não existir ele vai criar um novo.
            if(!file.exists()) file.createNewFile();
            //Instanciando um Gravador e indicando o arquivo que ele vai utilizar.
            FileWriter fw = new FileWriter(file);
            
            for(int i=0; i < fornecedores.size(); i++){
                //Instanciado um novo fornecedor e recebendo a utima posição da lista de fornecedores.
                
                FornecedorBean fornecedor = fornecedores.get(i);
                //Daodos Básico.
                fw.write(fornecedor.getId()+";");
                fw.write(fornecedor.getCnpj()+";");
                fw.write(fornecedor.getIe()+";");
                fw.write(fornecedor.getRazao_social()+";");
                //Endereço.
                fw.write(fornecedor.getCep()+";");
                fw.write(fornecedor.getLogradouro()+";");
                fw.write(fornecedor.getNumero_logradouro()+";");
                fw.write(fornecedor.getBairro()+";");
                fw.write(fornecedor.getMunicipio()+";");
                fw.write(fornecedor.getUf()+";");
                fw.write(fornecedor.getPais()+";");
                //Contato.
                fw.write(fornecedor.getNumero_telefone()+";");
                fw.write(fornecedor.getNumero_celular()+";");
                fw.write(fornecedor.getEmail()+";");
                //Situação Ativa ou Inativa.
                fw.write(fornecedor.getSituacao()+"\n"); 
            }
        fw.flush();
        fw.close();
        return true;
        
        } catch(IOException ex){
            return false;
        }
    }   
    
    public static boolean  saveFileCliente(ArrayList<ClienteBean> clientes){
        File file = new File(LOCAL_CLIENTE);
    
        try{
            //Se o arquivo não existir ele vai criar um novo.
            if(!file.exists()) file.createNewFile();
            //Instanciando um Gravador e indicando o arquivo que ele vai utilizar.
            FileWriter fw = new FileWriter(file);
            
            for(int i=0; i < clientes.size(); i++){
                //Instanciado um novo fornecedor e recebendo a utima posição da lista de fornecedores.
                ClienteBean cliente = clientes.get(i);
                //Daodos Básico.
                fw.write(cliente.getId()+";");
                fw.write(cliente.getCpf()+";");
                fw.write(cliente.getRg()+";");
                fw.write(cliente.getNome()+";");
                fw.write(cliente.getData_aniversario()+";");
                //Endereço.
                fw.write(cliente.getCep()+";");
                fw.write(cliente.getLogradouro()+";");
                fw.write(cliente.getNumero_logradouro()+";");
                fw.write(cliente.getBairro()+";");
                fw.write(cliente.getMunicipio()+";");
                fw.write(cliente.getUf()+";");
                fw.write(cliente.getPais()+";");
                //Contato.
                fw.write(cliente.getNumero_telefone()+";");
                fw.write(cliente.getNumero_celular()+";");
                fw.write(cliente.getEmail()+";");
                //Situação Ativa ou Inativa.
                fw.write(cliente.getSituacao()+"\n"); 
            }
        fw.flush();
        fw.close();
        return true;
        
        } catch(IOException ex){
            return false;
        }
    }

    public static boolean  saveFileMidia(ArrayList<MidiaBean> midias){
        File file = new File(LOCAL_MIDIA);
    
        try{
            //Se o arquivo não existir ele vai criar um novo.
            if(!file.exists()) file.createNewFile();
            //Instanciando um Gravador e indicando o arquivo que ele vai utilizar.
            FileWriter fw = new FileWriter(file);
            
            for(int i=0; i < midias.size(); i++){
                //Instanciado um novo fornecedor e recebendo a utima posição da lista de fornecedores.
                
                MidiaBean midia = midias.get(i);
                //Daodos Básico.
                fw.write(midia.getId()+";");
                fw.write(midia.getFornecedor_id()+";");
                fw.write(midia.getGenero()+";");
                fw.write(midia.getGrupo()+";");
                fw.write(midia.getCensura()+";");
                //Endereço.
                fw.write(midia.getTitulo()+";");
                fw.write(midia.getCategoria()+";");
                fw.write(midia.getAutor()+";");
                fw.write(midia.getDiretor()+";");
                fw.write(midia.getData_lancamento()+";");
                fw.write(midia.getValor_custo()+";");
                fw.write(midia.getValor_locacao()+"\n");
            }
        fw.flush();
        fw.close();
        return true;
        
        } catch(IOException ex){
            return false;
        }
    }
    
    public static boolean  saveFileMovimento(ArrayList<MovimentoBean> movimentos){
        File file = new File(LOCAL_MOVIMENTO);
    
        try{
            //Se o arquivo não existir ele vai criar um novo.
            if(!file.exists()) file.createNewFile();
            //Instanciando um Gravador e indicando o arquivo que ele vai utilizar.
            FileWriter fw = new FileWriter(file);
            
            for(int i=0; i < movimentos.size(); i++){
                //Instanciado um novo fornecedor e recebendo a utima posição da lista de fornecedores.
                
                MovimentoBean movimento = movimentos.get(i);
                //Daodos Básico.
                fw.write(movimento.getId()+";");
                fw.write(movimento.getCliente_id()+";");
                fw.write(movimento.getMidia_id()+";");
                fw.write(movimento.getData_locacao()+";");
                fw.write(movimento.getData_devolucao()+";");
                fw.write(movimento.getValor_total()+";");
                fw.write(movimento.getValor_pago()+";");
                fw.write(movimento.getValor_total()+"\n");
            }
        fw.flush();
        fw.close();
        return true;
        
        } catch(IOException ex){
            return false;
        }
    }
    
}
