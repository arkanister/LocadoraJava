
import java.util.List;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        SaveFile svCliente = new SaveFile();
        SaveFile svPessoa = new SaveFile();
        SaveFile svTelefone = new SaveFile();
        SaveFile svEndereco = new SaveFile();
        
        svCliente.SaveCliente(svCliente.classCliente, svPessoa.classCliente);
        svCliente.classTelefone(svTelefone.classTelefone);
        svCliente.classEndereco(svEndereco.classEndereco);
    }
   
}

