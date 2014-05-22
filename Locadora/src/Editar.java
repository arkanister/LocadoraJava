
import java.util.ArrayList;

public class Editar {

    public static boolean editRegister(FornecedorBean fornecedor_selecionado){
    FornecedorBean fornecedor = new FornecedorBean();

        boolean ret = false;
        ArrayList lista = Leitor.loaderFile();

        for (int i = 0; i < lista.size(); i++) {

            fornecedor = (FornecedorBean) lista.get(i);

            if (String.valueOf(fornecedor_selecionado.getId()).equals(String.valueOf(fornecedor.getId()))) {
                lista.remove(i);

                fornecedor.setId(fornecedor_selecionado.getId());
                fornecedor.setCnpj(fornecedor_selecionado.getCnpj());
                fornecedor.setIe(fornecedor_selecionado.getIe());
                fornecedor.setRazao_social(fornecedor_selecionado.getRazao_social());

                lista.add(i, fornecedor);
                ret = true;
                ret = Salvar.saveFile(lista);
            }

        }
        return ret;
    }
}
