package Locadora01;


import java.util.ArrayList;

public class Editar {

    public static boolean editRegisterFornecedor(FornecedorBean fornecedor_selecionado){
        FornecedorBean fornecedor;

        boolean ret = false;
        ArrayList lista = Leitor.loaderFileFornecedor();

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
                ret = Salvar.saveFileFornecedor(lista);
            }
        }
        return ret;
    }
    
    public static boolean editRegisterCliente(ClienteBean cliente_selecionado){
        ClienteBean cliente;

        boolean ret = false;
        ArrayList lista = Leitor.loaderFileCliente();

        for (int i = 0; i < lista.size(); i++) {

            cliente = (ClienteBean) lista.get(i);

            if (String.valueOf(cliente_selecionado.getId()).equals(String.valueOf(cliente.getId()))) {
                lista.remove(i);

                cliente.setId(cliente_selecionado.getId());
                cliente.setCpf(cliente_selecionado.getCpf());
                cliente.setRg(cliente_selecionado.getRg());
                cliente.setNome(cliente_selecionado.getNome());
                //Endereco.
                cliente.setCep(cliente_selecionado.getCep());
                cliente.setLogradouro(cliente_selecionado.getLogradouro());
                cliente.setNumero_logradouro(cliente_selecionado.getNumero_logradouro());
                cliente.setBairro(cliente_selecionado.getBairro());
                cliente.setMunicipio(cliente_selecionado.getMunicipio());
                cliente.setUf(cliente_selecionado.getUf());
                cliente.setPais(cliente_selecionado.getPais());
                //Contato.
                cliente.setNumero_telefone(cliente_selecionado.getNumero_telefone());
                cliente.setNumero_celular(cliente_selecionado.getNumero_celular());
                cliente.setEmail(cliente_selecionado.getEmail());
                //Situacao Ativo ou Inativo
                cliente.setSituacao(cliente_selecionado.getSituacao());

                lista.add(i, cliente);
                ret = true;
                ret = Salvar.saveFileCliente(lista);
            }
        }
        return ret;
    }
    
    public static boolean editRegisterMidia(MidiaBean midia_selecionado){
        MidiaBean midia;

        boolean ret = false;
        ArrayList lista = Leitor.loaderFileMidia();

        for (int i = 0; i < lista.size(); i++) {

            midia = (MidiaBean) lista.get(i);

            if (String.valueOf(midia_selecionado.getId()).equals(String.valueOf(midia.getId()))) {
                lista.remove(i);

                midia.setId(midia_selecionado.getId());
                midia.setFornecedor_id(midia_selecionado.getFornecedor_id());
                midia.setGrupo(midia_selecionado.getGrupo());
                midia.setGenero(midia_selecionado.getGenero());
                midia.setCensura(midia_selecionado.getCensura());
                
                midia.setTitulo(midia_selecionado.getTitulo());
                midia.setAutor(midia_selecionado.getAutor());
                midia.setDiretor(midia_selecionado.getDiretor());
                midia.setCategoria(midia_selecionado.getCategoria());
                midia.setData_lancamento(midia_selecionado.getData_lancamento());

                midia.setSinopse(midia_selecionado.getSinopse());
                midia.setValor_custo(midia_selecionado.getValor_custo());
                midia.setValor_locacao(midia_selecionado.getValor_locacao());
               
                lista.add(i, midia);
                ret = true;
                ret = Salvar.saveFileMidia(lista);
            }
        }
        return ret;
    }
    
    public static boolean editRegisterAutor(AutorBean autor_selecionado){
        AutorBean autor;

        boolean ret = false;
        ArrayList lista = Leitor.loaderFileAutor();

        for (int i = 0; i < lista.size(); i++) {

            autor = (AutorBean) lista.get(i);

            if (autor_selecionado.getId().equals(autor.getId())) {
                lista.remove(i);

                autor.setId(autor_selecionado.getId());
                autor.setNome(autor_selecionado.getNome());
                
               
                lista.add(i, autor);
                ret = true;
                ret = Salvar.saveFileAutor(lista);
            }
        }
        return ret;
    }
    
    public static boolean editRegisterDiretor(DiretorBean diretor_selecionado){
        DiretorBean diretor;

        boolean ret = false;
        ArrayList lista = Leitor.loaderFileDiretor();

        for (int i = 0; i < lista.size(); i++) {

            diretor = (DiretorBean) lista.get(i);

            if (diretor_selecionado.getId().equals(diretor.getId())) {
                lista.remove(i);

                diretor.setId(diretor_selecionado.getId());
                diretor.setNome(diretor_selecionado.getNome());
                
               
                lista.add(i, diretor);
                ret = true;
                ret = Salvar.saveFileDiretor(lista);
            }
        }
        return ret;
    }
}
