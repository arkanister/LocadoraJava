
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class Update {
    String barra = File.separator;
    
    public void UpdateCliente(ClienteBean cliente) {
        
        ArrayList _cliente = new ArrayList();
        LerArquivo read = new LerArquivo();
        
         _cliente.add(cliente.getId());
        _cliente.add(cliente.getNome());
        _cliente.add(cliente.getRg());
        _cliente.add(cliente.getCpf());
        for(Object nome : _cliente){
            System.out.println(nome);
        }
        
      }
 }
