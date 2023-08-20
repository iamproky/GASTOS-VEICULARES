/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import modelos.IVeiculoCRUD;
import modelos.Marca;
import modelos.Veiculo;
/**
 *
 * @author Aluno
 */
public class VeiculoDAO implements IVeiculoCRUD{
    private String nomeDoArquivoNoDisco = null;
    
    public VeiculoDAO (){
        
        nomeDoArquivoNoDisco = "./src/bancodedados/Veiculobd.txt";
    }

    @Override
    public void Cadastrar(Veiculo objVeiculo) throws Exception {
        try{
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
         //Criar o buffer do arquivo
         BufferedWriter bw = new BufferedWriter(fw);
         //Escreve no arquivo
         bw.write(objVeiculo.toString()+"\n");
         //fecha o arquivo
         bw.close();		
      }catch(Exception erro){
        String msg = "Metodo Incluir Contato - "+erro.getMessage();
        throw new Exception("Cadastro efetuado com sucesso");
     }
    }

    @Override
    public void Alterar(Veiculo objVeiculo) throws Exception {
      try {
            ArrayList<Veiculo> agenda = ObterListagemDeVeiculos();
            for (Veiculo i : agenda) {
                if (i.getPlaca().equals(objVeiculo.getPlaca())) {
                    agenda.indexOf(i);
                    i.setCor(objVeiculo.getCor());
                    i.setCombustivel(objVeiculo.getCombustivel());
                    i.setModelo(objVeiculo.getModelo());
                    i.setAno(objVeiculo.getAno()); 
                    System.out.println(agenda.indexOf(i));
                }
            }
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println(agenda);

            for (Veiculo i : agenda) {
                bw.write(i.toString()+"\n");
            }

            bw.close();

            
        } catch (Exception erro) {
            String msg = "Metodo ALTERAR/VeiculoDAO - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
    @Override
    public ArrayList<Veiculo> ObterListagemDeVeiculos() throws Exception {
         try {
            ArrayList<Veiculo> listaDeVeiculo = new ArrayList<Veiculo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String placa = vetorStr[0];
                String cor = vetorStr[1];
                String combustivel = vetorStr[2];              
                String modelo = vetorStr[3];
                String ano = vetorStr[4];
                String proprietarioVeiculo = vetorStr[5];
                
                Veiculo objVeiculo = new Veiculo(placa, cor, combustivel, modelo, ano, proprietarioVeiculo);
                listaDeVeiculo.add(objVeiculo);

                System.out.println(vetorStr[0] + vetorStr[1] + vetorStr[2] + vetorStr[3] + vetorStr[4]);
            }
            br.close();
            return listaDeVeiculo;
        } catch (Exception erro) {

            throw new Exception("obterlistagem erro Veiculo");

        }
    }
}