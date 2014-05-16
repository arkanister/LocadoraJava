
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F146DSq
 */
public class LerArquivo {
    String barra = File.separator;
    
    public ClienteBean lerCliente(String tela){
        
        ClienteBean cliente = new ClienteBean();
        try{
            BufferedReader ler = new BufferedReader(new FileReader("c:"+ barra + "Locadora" + barra + "Cliente.txt"));
            while(ler.ready()){
                String line = ler.readLine();
                StringTokenizer st = new StringTokenizer(line, ";");
                String id = st.nextToken();
                
                if(id.trim().equals(tela.trim())){
                    cliente.setId(id);
                    cliente.setNome(st.nextToken());
                    cliente.setRg(st.nextToken());
                    cliente.setCpf(st.nextToken());
                    cliente.setSexo(Integer.parseInt(st.nextToken()));
                    cliente.setSituacao(Integer.parseInt(st.nextToken()));
                    
                    break;
                }
            }
            ler.close();
        }catch(FileNotFoundException ex){
            System.out.println("Arquivo não encontrado!");
        }catch(IOException ex)
        {
            System.out.println("Erro na leitura do arquivo");
        }
     return cliente;           
    }
}
