
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
public class Delete {
    
        public static boolean removeRegistro(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFile();
       
        FornecedorBean fornecedor = new FornecedorBean();
        
        for (int i = 0; i < lista.size(); i++) {
            fornecedor = (FornecedorBean) lista.get(i);
            
            if (id.equals(String.valueOf(fornecedor.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFile(lista);
            }
        }
        return ret;
    }
}