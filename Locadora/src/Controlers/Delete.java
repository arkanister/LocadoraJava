package Controlers;

import Model.*;
import java.io.File;
import java.util.ArrayList;

public class Delete {
    private static final String BARRA = File.separator;
    
    public static boolean removeRegisterLocacao(int id){
        ArrayList list = Read.readerFileLocacao();
        LocacaoBean locacao;
        
        for(int i=0; i < list.size(); i++){
            locacao = (LocacaoBean) list.get(i);
            if(id == locacao.getId())
                list.remove(i);
                Save.createFileLocacao(list);
                System.out.println("Salvo com sucesso");
        }
        return true;
    }

    public static boolean removeRegisterAutor(int id){
        ArrayList list = Read.readerFileAutor();
        AutorBean autor;
        
        for(int i=0; i < list.size(); i++){
            autor = (AutorBean) list.get(i);
            if(id == autor.getId())
                list.remove(i);
                Save.createFileAutor(list);
                System.out.println("Salvo com sucesso");
        }
        return true;
    }
    
    public static boolean removeRegisterDiretor(int id){
        ArrayList list = Read.readerFileDiretor();
        DiretorBean diretor;

        for(int i=0; i < list.size(); i++){
            diretor = (DiretorBean) list.get(i);
            if(id == diretor.getId())
                list.remove(i);
                Save.createFileDiretor(list);
                System.out.println("Removido com sucesso");
        }
        return true;
    }
    
    public static boolean removeRegisterCliente(int id){
        ArrayList list = Read.readerFileCliente();
        ClienteBean cliente;
        for(int i=0; i < list.size(); i++){
            cliente = (ClienteBean) list.get(i);
            if(id == cliente.getId())
                list.remove(i);
                Save.createFileCliente(list);
                System.out.println("Salvo com sucesso");
        }
    return true;
    }
    
    public static boolean removeRegistroFornecedor(int id) {
        boolean ret = false;
        
        ArrayList lista = Read.readerFileFornecedor();
        FornecedorBean fornecedor;
        
        for (int i = 0; i < lista.size(); i++) {
            fornecedor = (FornecedorBean) lista.get(i);
            
            if (id == fornecedor.getId()) {
                lista.remove(i);
                ret = true;
                ret = Save.createFileFornecedor(lista);
                System.out.println("Removido com sucesso");
            }
        }
        return ret;
    }
    
    public static boolean removeRegistroMidia(String id) {
        boolean ret = false;
        
        ArrayList lista = Read.readerFileMidia();
       
        MidiaBean midia;
        
        for (int i = 0; i < lista.size(); i++) {
            midia = (MidiaBean) lista.get(i);
            
            if (id.equals(String.valueOf(midia.getId()))) {
                lista.remove(i);
                ret = true;
                ret = Save.createFileMidia(lista);
            }
        }
        return ret;
    }
}
