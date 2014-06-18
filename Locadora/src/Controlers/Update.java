package Controlers;

import Model.*;
import java.io.File;
import java.util.ArrayList;
import javax.xml.ws.Service;

public class Update {
    private static final String BARRA = File.separator;
    
    public static boolean updateLocacao(LocacaoBean selecao){
        try{
        boolean ret = false;
        LocacaoBean locacao;
        ArrayList<LocacaoBean> list = Read.readerFileLocacao();
        ArrayList<MidiaBean> list_midia = Read.readerFileMidia();
            for(int i=0; i < list.size();i++){
                locacao = (LocacaoBean) list.get(i);
                if(selecao.getId() == locacao.getId())
                    locacao.setId(locacao.getId());
                    locacao.setCliente(Read.searchCliente(locacao.getCliente().getId()));
                    locacao.setValor_pago(selecao.getValor_pago());
                    locacao.setData_locacao(locacao.getData_locacao());
                    locacao.setData_devolucao(selecao.getData_devolucao());
                    locacao.setSituacao(selecao.getSituacao());
                    list.remove(i);
                    list.add(i, locacao);
                    ret = Save.createFileLocacao(list);
            }
        return ret;
        }
        catch(Exception ex){
            System.out.println("Erro ao atualizar o registro");
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean updateDiretor(DiretorBean selecao){
        try{
        boolean ret = false;
        DiretorBean diretor;
        ArrayList<DiretorBean> list = Read.readerFileDiretor();
            for(int i=0; i < list.size();i++){
                diretor = (DiretorBean) list.get(i);
                if(selecao.getId() == diretor.getId())
                    diretor.setId(selecao.getId());
                    diretor.setNome(selecao.getNome());
                    list.remove(i);
                    list.add(i, diretor);
                    ret = Save.createFileDiretor(list);
            }
        return ret;
        }
        
        catch(Exception ex){
            System.out.println("Erro ao atualizar o registro");
            System.out.println(ex.getMessage());
            return false;
        }
    }
    
    public static boolean updateAutor(AutorBean selecao){
        try{
        boolean ret = false;
        AutorBean autor;
        ArrayList<AutorBean> list = Read.readerFileAutor();
            for(int i=0; i < list.size();i++){
                autor = (AutorBean) list.get(i);
                if(selecao.getId() == autor.getId())
                    autor.setId(selecao.getId());
                    autor.setNome(selecao.getNome());
                
                    list.add(i, autor);
                    ret = Save.createFileAutor(list);
            }
            return ret;
        }
        catch(Exception ex){
            System.out.println("Erro ao atualizar o registro");
            System.out.println(ex.getMessage());
            return false;
        }
    }
      
    public static boolean updateCliente(ClienteBean selecao){
        try{
        boolean ret = false;
        ClienteBean cliente;
        ArrayList<ClienteBean> list = Read.readerFileCliente();
            for(int i=0; i < list.size();i++){
                cliente = (ClienteBean) list.get(i);
                if(selecao.getId() == cliente.getId())
                    cliente.setId(selecao.getId());
                    cliente.setCpf(selecao.getCpf());
                    cliente.setRg(selecao.getRg());
                    cliente.setNome(selecao.getNome());
                    cliente.setData_aniversario(selecao.getData_aniversario());
                    cliente.setSexo(selecao.getSexo());
                    cliente.setCep(selecao.getCep());
                    cliente.setLogradouro(selecao.getLogradouro());
                    cliente.setNumero_logradouro(selecao.getNumero_logradouro());
                    cliente.setBairro(selecao.getBairro());
                    cliente.setMunicipio(selecao.getMunicipio());
                    cliente.setUf(selecao.getUf());
                    cliente.setPais(selecao.getPais());
                    cliente.setNumero_residencial(selecao.getNumero_residencial());
                    cliente.setNumero_celular(selecao.getNumero_celular());
                    cliente.setEmail(selecao.getEmail());
                    cliente.setSituacao(selecao.getSituacao());
                    list.remove(i);
                    list.add(i, cliente);
                    ret = Save.createFileCliente(list);
            }
        return ret;
        }
        
        catch(Exception ex){
            System.out.println("Erro ao atualizar o registro");
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public static boolean updateMidia(MidiaBean selecao){
        MidiaBean midia;
        boolean ret = false;
        ArrayList lista = Read.readerFileMidia();
        ArrayList<FornecedorBean> list_fornecedor = Read.readerFileFornecedor();
        
        for (int i = 0; i < lista.size(); i++) {
            midia = (MidiaBean) lista.get(i);
            if (selecao.getId() == midia.getId()) {
                midia.setId(selecao.getId());
                for (FornecedorBean fornecedor: list_fornecedor) {
                    midia.setFornecedor(Read.searchRegisterFornecedor(fornecedor.getId()));
                }
                midia.setGrupo(selecao.getGrupo());
                midia.setGenero(selecao.getGenero());
                midia.setCensura(selecao.getCensura());
                midia.setTitulo(selecao.getTitulo());
                midia.setAutor(selecao.getAutor());
                midia.setDiretor(selecao.getDiretor());
                midia.setCategoria(selecao.getCategoria());
                midia.setData_lancamento(selecao.getData_lancamento());
                midia.setSinopse(selecao.getSinopse());
                midia.setValor_custo(selecao.getValor_custo());
                midia.setValor_locacao(selecao.getValor_locacao());
                midia.setQuantidade(Integer.parseInt(selecao.getValor_locacao()));
                lista.remove(i);
                lista.add(i, midia);
                ret = Save.createFileMidia(lista);
            }
        }
        return ret;
    }

    public static boolean updateFornecedor(FornecedorBean selecao){
        FornecedorBean fornecedor;

        boolean ret = false;
        ArrayList lista = Read.readerFileFornecedor();

        for (int i = 0; i < lista.size(); i++) {
            fornecedor = (FornecedorBean) lista.get(i);
            if (selecao.getId() == fornecedor.getId()) {
                fornecedor.setId(selecao.getId());
                fornecedor.setCnpj(selecao.getCnpj());
                fornecedor.setInscricao_estadual(selecao.getInscricao_estadual());
                fornecedor.setRazao_social(selecao.getRazao_social());
                //Endereco.
                fornecedor.setCep(selecao.getCep());
                fornecedor.setLogradouro(selecao.getLogradouro());
                fornecedor.setNumero_logradouro(selecao.getNumero_logradouro());
                fornecedor.setBairro(selecao.getBairro());
                fornecedor.setMunicipio(selecao.getMunicipio());
                fornecedor.setUf(selecao.getUf());
                fornecedor.setPais(selecao.getPais());
                //Contato.
                fornecedor.setNumero_residencial(selecao.getNumero_residencial());
                fornecedor.setNumero_celular(selecao.getNumero_celular());
                fornecedor.setEmail(selecao.getEmail());
                //Situacao Ativo ou Inativo
                fornecedor.setSituacao(selecao.getSituacao());
                lista.remove(i);
                lista.add(i, fornecedor);
                ret = Save.createFileFornecedor(lista);
            }
        }
        return ret;
    }
}
