
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Salvar {
    //Decladado as variaveis que não podem ser alteradas. 
    private static final String BARRA = File.separator;
    public static final String LOCAL = ("c:"+ BARRA + "Locadora" + BARRA + "Fornecedores.txt");
    
    //Metodo responsavel por gravar os dados que estão armazenados no array list no arquivo
    public static boolean  saveFile(ArrayList<FornecedorBean> fornecedores){
        File file = new File(LOCAL);
    
        try{
            //Se o arquivo não existir ele vai criar um novo.
            if(!file.exists()) file.createNewFile();
            //Instanciando um Gravador e indicando o arquivo que ele vai utilizar.
            FileWriter fw = new FileWriter(file);
            
            for(int i=0; i < fornecedores.size(); i++){
                //Instanciado um novo fornecedor e recebendo a utima posição da lista de fornecedores.
                
                FornecedorBean fornecedor = fornecedores.get(i);
                
                fw.write(fornecedor.getId()+";");
                fw.write(fornecedor.getCnpj()+";");
                fw.write(fornecedor.getIe()+";");
                fw.write(fornecedor.getRazao_social()+"\n");
            }
        fw.flush();
        fw.close();
        return true;
        
        } catch(IOException ex){
            return false;
        }
    }    
}
