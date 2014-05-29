package Locadora01;

import java.util.ArrayList;

public class Remover {
    public static boolean removeRegistroFornecedor(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileFornecedor();
       
        FornecedorBean fornecedor;
        
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
       
        ClienteBean cliente;
        
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
       
        MidiaBean midia;
        
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
    
    public static boolean removeRegistroAutor(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileAutor();
       
        AutorBean autor;
        
        for (int i = 0; i < lista.size(); i++) {
            autor = (AutorBean) lista.get(i);
            
            if (id.equals(String.valueOf(autor.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFileAutor(lista);
            }
        }
        return ret;
    }
    
    public static boolean removeRegistroDiretor(String id) {
        boolean ret = false;
        
        ArrayList lista = Leitor.loaderFileDiretor();
       
        DiretorBean diretor;
        
        for (int i = 0; i < lista.size(); i++) {
            diretor = (DiretorBean) lista.get(i);
            
            if (id.equals(String.valueOf(diretor.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Salvar.saveFileDiretor(lista);
            }
        }
        return ret;
    }
}
