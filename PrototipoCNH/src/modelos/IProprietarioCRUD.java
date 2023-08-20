/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public interface IProprietarioCRUD {
    
    public void Incluir (Proprietario objproprietarios) throws Exception;
    public void Alterar(Proprietario objproprietarios)throws Exception;
    public Proprietario Consultar(String Cpf)throws Exception;
    public  ArrayList<Proprietario> ObterListagemDeContatos()throws Exception;  
}
