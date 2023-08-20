/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import modelos.Proprietario;
import modelos.IProprietarioCRUD;
import persistencia.ProprietarioDAO;

/**
 *
 * @author Aluno
 */
public class ProprietarioControle implements IProprietarioCRUD{
    
     IProprietarioCRUD proprietarioPersistencia = null;
     ValidaCpf ValidarCpf = new ValidaCpf();
     
     
     public ProprietarioControle() {
        proprietarioPersistencia = new ProprietarioDAO();
        
     }  

    @Override
    public void Incluir(Proprietario objproprietarios) throws Exception {
        try {
            if(objproprietarios.getFone().getDdi().contains(" "))throw new Exception ("CAMPO DDI ESTÁ EM BRANCO");
            if(objproprietarios.getFone().getDdd().contains(" "))throw new Exception ("CAMPO DDD ESTÁ EM BRANCO");
            if(objproprietarios.getFone().getNumero().contains(" "))throw new Exception ("CAMPO NUMERO ESTÁ EM BRANCO");
            if(!objproprietarios.getNomecompleto().contains(" ")) throw new Exception("NOME INVALIDO, COLOQUE NOME E SOBRENOME");
            if(ValidarEmail.isValidEmailAddressRegex(objproprietarios.getEmail()) == false)throw new Exception("EMAIL INCOMPATÍVEL");
            if (ValidarCpf.isCPF(objproprietarios.getCpf())) {
            
            }else{
                throw new Exception("CPF INVALIDO!!");
            }
            
            if (objproprietarios.getCnh().contains(" ")) throw new Exception("CAMPO CNH ESTÁ EM BRANCO");
            if (proprietarioPersistencia.Consultar(objproprietarios.getCpf())!= null) throw new Exception ("CPF JA EXISTENTE");
            proprietarioPersistencia.Incluir(objproprietarios);
       
        } catch (Exception erro) {
            String msg = "Metodo INCLUIR/PROPRIETARIOCONTROLE - " +erro.getMessage();
            throw new Exception(msg);
        }
    }
     @Override
     public ArrayList<Proprietario> ObterListagemDeContatos() throws Exception {
            
             return   proprietarioPersistencia.ObterListagemDeContatos();
    }

    @Override
    public void Alterar(Proprietario objproprietarios) throws Exception {
      try {
         if(!objproprietarios.getNomecompleto().contains(" ")) throw new Exception("NOME INVALIDO, COLOQUE NOME E SOBRENOME");
         if(ValidarEmail.isValidEmailAddressRegex(objproprietarios.getEmail()) == false)throw new Exception("EMAIL INCOMPATÍVEL");
          if (ValidarCpf.isCPF(objproprietarios.getCpf())) {
                
            }else{
                throw new Exception("CPF INVALIDO!!");
            }
         if (objproprietarios.getCnh().contains(" ")) throw new Exception("CAMPO CNH ESTÁ EM BRANCO");
         
         
         proprietarioPersistencia.Alterar(objproprietarios);
        } catch (Exception erro) {
            String msg = "Metodo ALTERAR/ProprietarioControle - " +erro.getMessage();
            throw new Exception(msg);
            
     }
    }

    @Override
    public Proprietario Consultar(String Cpf) throws Exception {
       try {
        //instancia com com referencia a contato e verifica passando parametro CPF
        
        //Verifica se o campo cpf esta vazio, caso esteja retorna para preencher o campo
        if (Cpf.equals("")) throw new Exception("Preencha o campo CPF para buscar o contato!");
        //verifica se retorno do contato esta null, caso esteja null -> retorna contato inexistente;
        //if ( contato == null ) throw new Exception("Contato inexistente!");
        //se passar pela condição ele retorna o contato;
         Proprietario contato = proprietarioPersistencia.Consultar(Cpf);
        return contato;
        } catch (Exception erro) {
            String msg = "Metodo ConsultarProprietario - " +erro.getMessage();
            throw new Exception(msg);
        }
    }
   }


       