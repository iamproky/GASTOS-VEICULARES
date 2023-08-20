/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.util.ArrayList;

import modelos.IProprietarioCRUD;
import modelos.Proprietario;
import modelos.Telefone;

public class ProprietarioDAO implements IProprietarioCRUD {

//atributos
    private String nomeDoArquivoNoDisco = null;

    public ProprietarioDAO() {
        nomeDoArquivoNoDisco = "./src/bancodedados/Proprietariosbd.txt";

    }

    @Override
    public void Incluir(Proprietario objproprietarios) throws Exception {
        try {
            //cria o arquivo
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco, true);
            //Criar o buffer do arquivo
            BufferedWriter bw = new BufferedWriter(fw);
            //Escreve no arquivo
            bw.write(objproprietarios.toString() + "\n");
            //fecha o arquivo
            bw.close();
        } catch (Exception erro) {
            String msg = "Metodo Incluir ProprietarioDAO - " + erro.getMessage();
            throw new Exception("Cadastro efetuado com sucesso");
        }
    }

    @Override
    public ArrayList<Proprietario> ObterListagemDeContatos() throws Exception {
        try {
            ArrayList<Proprietario> listaDeProprietarios = new ArrayList<Proprietario>();
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String cpf = vetorStr[0];
                String nomeCompleto = vetorStr[1];
                String email = vetorStr[2];

                String fone1 = vetorStr[3];
                String fone2 = vetorStr[4];
                String fone3 = vetorStr[5];

                Telefone fone = new Telefone((fone1),(fone2),(fone3));

                String cnh = vetorStr[6];
                String categoria = vetorStr[7];
                String imagem = vetorStr[8];

                Proprietario objProprietarios = new Proprietario(cpf, nomeCompleto, email, fone, cnh, categoria, imagem);
                listaDeProprietarios.add(objProprietarios);

            }
            br.close();
            return listaDeProprietarios;
        } catch (Exception erro) {

            throw new Exception("obterlistagem erro");

        }
    }

    @Override
    public void Alterar(Proprietario objproprietarios) throws Exception {
        try {
            ArrayList<Proprietario> agenda = ObterListagemDeContatos();
            for (Proprietario i : agenda) {
                if (i.getCpf().equals(objproprietarios.getCpf())) {
                    agenda.indexOf(i);
                    i.setNomecompleto(objproprietarios.getNomecompleto());
                    i.setEmail(objproprietarios.getEmail());
                    i.setFone(objproprietarios.getFone());
                    System.out.println(agenda.indexOf(i));
                }
            }
            FileWriter fw = new FileWriter(nomeDoArquivoNoDisco);
            BufferedWriter bw = new BufferedWriter(fw);
            //System.out.println(agenda);

            for (Proprietario i : agenda) {
                bw.write(i.toString() + "\n");
            }

            bw.close();

            //System.out.println(agenda.indexOf(objContato));
        } catch (Exception erro) {
            String msg = "Metodo ALTERAR/proprietarioDAO - " + erro.getMessage();
            throw new Exception(msg);
        }
    }

    @Override
    public Proprietario Consultar(String Cpf) throws Exception {
        try {
            FileReader fr = new FileReader(nomeDoArquivoNoDisco);
            BufferedReader br = new BufferedReader(fr);
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String vetorStr[] = linha.split(";");
                String cpf = vetorStr[0];
                String nomeCompleto = vetorStr[1];
                String email = vetorStr[2];
                String fone1 = vetorStr[3];
                String fone2 = vetorStr[4];
                String fone3 = vetorStr[5];

                Telefone fone = new Telefone((fone1),(fone2),(fone3));

                String cnh = vetorStr[6];
                String categoria = vetorStr[7];
                String imagem = vetorStr[8];

                if (Cpf.equals(cpf)) {
                    Proprietario objProprietarios = new Proprietario(cpf, nomeCompleto, email, fone, cnh, categoria, imagem);
                    br.close();
                    return objProprietarios;
                }
            }
            br.close();
            return null;
        } catch (Exception erro) {
            String msg = "Metodo buscar Contato - " + erro.getMessage();
            throw new Exception(msg);
        }
    }
}
