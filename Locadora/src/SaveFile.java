
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SaveFile {
    String barra = File.separator;
    
    ClienteBean classCliente = new ClienteBean();
    public boolean SaveCliente(ClienteBean cliente, PessoaBean pessoa){
        boolean ret = false;
        
        File file = new File("c:"+ barra + "Locadora" + barra + "Cliente.txt");
        
        try{
            if(!file.exists()){
                    file.createNewFile();
            }
            FileWriter fw = new FileWriter(file, true);
            //ClienteBean
            fw.write(cliente.getId()+";");
            fw.write(cliente.getNome()+";");
            fw.write(cliente.getRg()+";");
            fw.write(cliente.getCpf()+";");
            fw.write(cliente.getSexo()+";");
            fw.write(cliente.getData_aniversario()+";");
            
            //Class Pessoa
           fw.write(pessoa.getEmail()+";");
           fw.write(pessoa.getSituacao()+";");
            
           //ClienteBean
           fw.write(cliente.getData_cadastro()+";");
            
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
