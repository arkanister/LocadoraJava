package Locadora01;

import java.util.ArrayList;

public class Remover {
    public static boolean removeRegistroFornecedor(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileFornecedor();
       
        FornecedorBean fornecedor = new FornecedorBean();
        
        for (int i = 0; i < lista.size(); i++) {
            fornecedor = (FornecedorBean) lista.get(i);
            
            if (id.equals(String.valueOf(fornecedor.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFileFornecedor(lista);
            }
        }
        return ret;
    }
    
    public static boolean removeRegistroCliente(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileFornecedor();
       
        ClienteBean cliente = new ClienteBean();
        
        for (int i = 0; i < lista.size(); i++) {
            cliente = (ClienteBean) lista.get(i);
            
            if (id.equals(String.valueOf(cliente.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFileCliente(lista);
            }
        }
        return ret;
    }
    
    public static boolean removeRegistroMidia(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileFornecedor();
       
        MidiaBean midia = new MidiaBean();
        
        for (int i = 0; i < lista.size(); i++) {
            midia = (MidiaBean) lista.get(i);
            
            if (id.equals(String.valueOf(midia.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFileMidia(lista);
            }
        }
        return ret;
    }
}
