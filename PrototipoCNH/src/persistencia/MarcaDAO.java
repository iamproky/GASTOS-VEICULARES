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
import modelos.IMarcaCRUD;
import modelos.Marca;
import modelos.Proprietario;
import modelos.Telefone;

/**
 *
 * @author Aluno
 */
public class MarcaDAO implements IMarcaCRUD {
    private String nomeDoArquivoNoDisco = null;

    public MarcaDAO() {
        nomeDoArquivoNoDisco = "./src/bancodedados/Marcabd.txt";
        
    }
    @Override
    public void Incluir(Marca objmarca) throws Exception {
        try{
         //cria o arquivo
         FileWriter fw = new FileWriter(nomeDoArquivoNoDisco,true);
         //Criar o buffer do arquivo
         BufferedWriter bw = new BufferedWriter(fw);
         //Escreve no arquivo
         bw.write(objmarca.toString()+"\n");
         //fecha o arquivo
         bw.close();		
      }catch(Exception erro){
        String msg = "Metodo Incluir MarcaDAO - "+erro.getMessage();
        throw new Exception("Cadastro efetuado com sucesso");
     }
    }

    @Override
    public ArrayList<Marca> ObterListagemDeMarcas() throws Exception {
         try {
            ArrayList<Marca> listaDeMarcas = new ArrayList<Marca>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String id = vetorStr[0];
                String marca = vetorStr[1];
                String logo = vetorStr[2];              

                Marca objMarca = new Marca(id, marca, logo);
                listaDeMarcas.add(objMarca);

                System.out.println(vetorStr[0] + vetorStr[1] + vetorStr[2]);
            }
            br.close();
            return listaDeMarcas;
        } catch (Exception erro) {

            throw new Exception("obterlistagem erro marcaDAO");

        }
    }


    @Override
    public void Alterar(Marca objmarca) throws Exception {
         try {
            ArrayList<Marca> agenda = ObterListagemDeMarcas();
            for (Marca i : agenda) {
                if (i.getId().equals(objmarca.getId())) {
                    agenda.indexOf(i);
                    i.setMarca(objmarca.getMarca());
                    i.setLogo(objmarca.getLogo());                   
                    System.out.println(agenda.indexOf(i));
                }
            }
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println(agenda);

            for (Marca i : agenda) {
                bw.write(i.toString()+"\n");
            }

            bw.close();

            
        } catch (Exception erro) {
            String msg = "Metodo ALTERAR/MarcaDAO - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    @Override
    public Marca Consultar(String id) throws Exception {
        try{
        FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String ide = vetorStr[0];
                String marca = vetorStr[1];
                String logo = vetorStr[2];
                
                
                

                Marca objmarca = new Marca(id, marca, logo);
                if (ide.equals(ide)) {
                    br.close();
                    return objmarca;
                }
            }
            br.close();
            return null;
        } catch (Exception erro) {
            String msg = "MetodoConsultarMarca - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
}



    

