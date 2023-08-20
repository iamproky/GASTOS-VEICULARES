/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedWriter;
import java.io.FileWriter;
import modelos.IRelatorioCRUD;
import modelos.Relatorio;

/**
 *
 * @author Aluno
 */
public class RelatorioDAO implements IRelatorioCRUD {

    private String nomeDoArquivoNoDisco = null;

    public RelatorioDAO() {
        nomeDoArquivoNoDisco = "./src/bancodedados/Relatoriobd.txt";
    }

    @Override
    public void calcular(Relatorio objrelatorio) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escreve no arquivo
            bw.write(objrelatorio.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            String msg = "Metodo Incluir RelatorioDAO - " + erro.getMessage();
        }
    }
}
