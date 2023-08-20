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

import modelos.IModeloCRUD;
import modelos.Marca;
import modelos.Modelo;
import modelos.Proprietario;

/**
 *
 * @author Aluno
 */
public class ModeloDAO implements IModeloCRUD {
    private String nomeDoArquivoNoDisco = null;

    public ModeloDAO() {
        nomeDoArquivoNoDisco = "./src/bancodedados/Modelobd.txt";
        
    }
    @Override
    public void Incluir(Modelo modelos) throws Exception {
        try{
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
         //Criar o buffer do arquivo
         BufferedWriter bw = new BufferedWriter(fw);
         //Escreve no arquivo
         bw.write(modelos.toString()+"\n");
         //fecha o arquivo
         bw.close();		
      }catch(Exception erro){
        String msg = "Metodo Incluir ModeloDAO - "+erro.getMessage();
        throw new Exception("Cadastro efetuado com sucesso");
     }
    }

    @Override
    public ArrayList<Modelo> ObterListagemDeModelos() throws Exception {           
         try {
            ArrayList<Modelo> listaDeModelos = new ArrayList<Modelo>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String id = vetorStr[0];
                String descricao = vetorStr[1];
                String marca = vetorStr[2];              
                String categoria = vetorStr[3];
                
                Modelo objModelo = new Modelo(id, descricao, marca, categoria);
                listaDeModelos.add(objModelo);

                System.out.println(vetorStr[0] + vetorStr[1] + vetorStr[2]);
            }
            br.close();
            return listaDeModelos;
        } catch (Exception erro) {

            throw new Exception("obterlistagem erro modelos");

        }
    }

    @Override
    public void Alterar(Modelo modelo) throws Exception {
        try {
            ArrayList<Modelo> agenda = ObterListagemDeModelos();
            for (Modelo i : agenda) {
                if (i.getId().equals(modelo.getId())) {
                    agenda.indexOf(i);
                    i.setDescricao(modelo.getDescricao());
                    i.setMarca(modelo.getMarca());
                    i.setTipoDoVeiculo(modelo.getTipoDoVeiculo());
                    System.out.println(agenda.indexOf(i));
                }
            }
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println(agenda);

            for (Modelo i : agenda) {
                bw.write(i.toString()+"\n");
            }

            bw.close();

            
        } catch (Exception erro) {
            String msg = "Metodo ALTERAR/ModeloDAO - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    @Override
    public Modelo Consultar(String id) throws Exception {
         try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String ide = vetorStr[0];
                String descricao = vetorStr[1];
                String marca = vetorStr[2];
                String tipo = vetorStr[3];
                
                

                Modelo objmodelo = new Modelo(id, descricao, marca, tipo);
                if (ide.equals(ide)) {
                    br.close();
                    return objmodelo;
                }
            }
            br.close();
            return null;
        } catch (Exception erro) {
            String msg = "MetodoConsultarModelo - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
}
    

   
    

