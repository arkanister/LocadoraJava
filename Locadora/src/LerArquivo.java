
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LerArquivo {
    String barra = File.separator;
    
//    public ClienteBean lerCliente(String tela){
//        ClienteBean cliente = new ClienteBean();
//        ArrayList<ClienteBean> _cliente = new ArrayList<ClienteBean>();
//        try{
//            BufferedReader ler = new BufferedReader(new FileReader("c:"+ barra + "Locadora" + barra + "Cliente.txt"));
//            
//            while(ler.ready()){
//                String line = ler.readLine();
//                StringTokenizer st = new StringTokenizer(line, ";");
//                String id = st.nextToken();
//                
//                
//                if(id.trim().equals(tela.trim())){
//                    cliente.setId(Integer.parseInt(id));
//                    cliente.setNome(st.nextToken());
//                    cliente.setRg(st.nextToken());
//                    cliente.setCpf(st.nextToken());
//                    cliente.setSexo(Integer.parseInt(st.nextToken()));
////                    cliente.setSituacao(Integer.parseInt(st.nextToken()));
//                    break;
//                }
//            }
//            Update teste = new Update();
//            teste.UpdateCliente(cliente);
//            
//            ler.close();
//        }catch(FileNotFoundException ex){
//            System.out.println("Arquivo não encontrado!");
//        }catch(IOException ex)
//        {
//            System.out.println("Erro na leitura do arquivo");
//        }
//     return cliente;           
//    }
    
    
    public FornecedorBean ReadFile(String tela){
         String barra = File.separator;
         FornecedorBean fornecedor = new FornecedorBean();
         
         try{
              BufferedReader read = new BufferedReader(new FileReader("c:"+ barra + "Locadora" + barra + "Fornecedores.txt"));
              
              while(read.ready()){
                  String line = read.readLine();
                  StringTokenizer st = new StringTokenizer(line, ";");
                  String id = st.nextToken();

                  if(id.trim().equals(tela.trim())){
                  fornecedor.setId(Integer.parseInt(id));
                  fornecedor.setCnpj(st.nextToken());
                  fornecedor.setIe(st.nextToken());
                  fornecedor.setRazao_social(st.nextToken());
                  break;
                  }
              }
              read.close();
              
         }catch(FileNotFoundException ex){
             System.out.println("Arquivo Nao encontrado");
             
         }catch(IOException ex){
             System.out.println("Erro na Leitura");
         }
         return fornecedor;
    }
}
