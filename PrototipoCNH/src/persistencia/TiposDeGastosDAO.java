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
import modelos.ITiposDeGastosCRUD;
import modelos.Marca;
import modelos.TiposDeGastos;

/**
 *
 * @author Aluno
 */
public class TiposDeGastosDAO implements ITiposDeGastosCRUD {

    private String nomeDoArquivoNoDisco = null;

    public TiposDeGastosDAO() {
        nomeDoArquivoNoDisco = "./src/bancodedados/TiposDeGastos.txt";

    }

    @Override
    public void Incluir(TiposDeGastos objTiposDeGastos) throws Exception {
       try{
             FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escreve no arquivo
            bw.write(objTiposDeGastos.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {       
        }
    }

    @Override
    public ArrayList<TiposDeGastos> ObterListagemDeTiposDeGastos() throws Exception {
          try {
            ArrayList<TiposDeGastos> listaDeGastos= new ArrayList<TiposDeGastos>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String tipodegastos = vetorStr[0];
                String valor = vetorStr[1];
                String data = vetorStr[2];              
                String placa = vetorStr[3];
               TiposDeGastos gastos = new TiposDeGastos(tipodegastos, valor, data, placa);
                listaDeGastos.add(gastos);

                System.out.println(vetorStr[0] + vetorStr[1] + vetorStr[2]);
            }
            br.close();
            return listaDeGastos;
        } catch (Exception erro) {

            throw new Exception("obterlistagem erro TiposDeGastos");

        }
    }
  }
