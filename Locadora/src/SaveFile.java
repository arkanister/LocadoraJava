
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class SaveFile {
    String barra = File.separator;
    
    PessoaBean classCliente = new ClienteBean();
    TelefoneBean classTelefone = new TelefoneBean();
    EnderecoBean classEndereco = new EnderecoBean();
    
    public boolean SaveCliente(ClienteBean cliente, PessoaBean pessoa, EnderecoBean endereco, TelefoneBean telefone){
        boolean ret = false;
        
        File file = new File("c:"+ barra + "Locadora" + barra + "Cliente.txt");
        
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
            fw.write(cliente.getData_aniversario()+";");
           
            //Class Endereco
            fw.write(endereco.getCep() + ";");
            fw.write(endereco.getLogradouro() + ";");
            fw.write(endereco.getNumero() + ";");
            fw.write(endereco.getBairro() + ";");
            fw.write(endereco.getMunicipio() + ";");
            fw.write(endereco.getUf() + ";");
            fw.write(endereco.getPais() + ";");
            fw.write(endereco.getComplemento() + ";");
             
            //Class Telefone
            fw.write(telefone.getNumero() + ";");
            fw.write(telefone.getTipo() + ";");
            
            //Class Pessoa
            fw.write(pessoa.getEmail()+";");
            fw.write(pessoa.getSituacao()+";");
           
            //Class Cliente
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
