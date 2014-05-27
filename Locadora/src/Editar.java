
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
                //Endereco.
                fornecedor.setCep(fornecedor_selecionado.getCep());
                fornecedor.setLogradouro(fornecedor_selecionado.getLogradouro());
                fornecedor.setNumero_logradouro(fornecedor_selecionado.getNumero_logradouro());
                fornecedor.setBairro(fornecedor_selecionado.getBairro());
                fornecedor.setMunicipio(fornecedor_selecionado.getMunicipio());
                fornecedor.setUf(fornecedor_selecionado.getUf());
                fornecedor.setPais(fornecedor_selecionado.getPais());
                //Contato.
                fornecedor.setNumero_telefone(fornecedor_selecionado.getNumero_telefone());
                fornecedor.setNumero_celular(fornecedor_selecionado.getNumero_celular());
                fornecedor.setEmail(fornecedor_selecionado.getEmail());
                //Situacao Ativo ou Inativo
                fornecedor.setSituacao(fornecedor_selecionado.getSituacao());

                lista.add(i, fornecedor);
                ret = true;
                ret = Salvar.saveFile(lista);
            }
        }
        return ret;
    }
}
