
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.filechooser.FileFilter;

public class SaveFile {
    String barra = File.separator;
    
    ClienteBean classCliente = new ClienteBean();
    
    
    public boolean SaveFornecedor(FornecedorBean fornecedor){
        boolean ret = false;
        
        File file = new File("c:"+ barra + "Locadora" + barra + "Fornecedores.txt");
                                                        
    try{
        if(!file.exists()){
            file.createNewFile();
        }
        else {
            
            FileWriter fw = new FileWriter(file, true);
            fw.write(fornecedor.getId()+";");
            fw.write(fornecedor.getCnpj()+";");
            fw.write(fornecedor.getIe()+";");
            fw.write(fornecedor.getRazao_social()+"\n");
            fw.flush();
            fw.close();
  
            ret = true;
        }
        
     
    }
        catch(IOException ex){
            ret = false;
            System.out.println("Erro ao registrar");
        }
        return ret;   
    }
    
    
    public boolean SaveCliente(ClienteBean cliente){
        boolean ret = false;
        
        File file = new File("c:"+ barra + "Locadora" + barra + "Cliente.txt");
        ArrayList<ClienteBean> _cliente = new ArrayList<ClienteBean>();
        
        try{
            if(!file.exists()){
                    file.createNewFile();
            }
            
            FileWriter fw = new FileWriter(file, true);
            
            //Class Cliente
            fw.write(cliente.getId()+";");
            
            fw.write(cliente.getNome()+";");
            fw.write(cliente.getRg()+";");
            fw.write(cliente.getCpf()+";");
            fw.write(cliente.getSexo()+";");
            //fw.write(cliente.getData_aniversario()+";");
           
            //Class Endereco
            fw.write(cliente.getCep() + ";");
            fw.write(cliente.getLogradouro() + ";");
            fw.write(cliente.getNumero_logradouro() + ";");
            fw.write(cliente.getBairro() + ";");
            fw.write(cliente.getMunicipio() + ";");
            fw.write(cliente.getUf() + ";");
            fw.write(cliente.getPais() + ";");
            fw.write(cliente.getComplemento() + ";");
             
            //Class Telefone
            fw.write(cliente.getNumero_telefone() + ";");
            //fw.write(cliente.getNumero_celular() + ";");
            fw.write(cliente.getTipo() + ";");
            
            //Class Pessoa
            fw.write(cliente.getEmail()+";");
            fw.write(cliente.getSituacao()+";");
           
            //Class Cliente
            //fw.write(cliente.getData_cadastro()+";");
            
            System.out.println(cliente);
            fw.flush();
            fw.close();
            ret = true;
        }catch(IOException ex){
            ret = false;
            System.out.println("Erro ao registrar");
        }
        return ret;
    }
}
