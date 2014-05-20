
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author F1_SYSTEM1
 */
public class Dados {
    ArrayList<FornecedorBean> fornecedores = new ArrayList();
    
    public void Salvar(FornecedorBean fornecedor){
        fornecedores.add(fornecedor);
    }
}
