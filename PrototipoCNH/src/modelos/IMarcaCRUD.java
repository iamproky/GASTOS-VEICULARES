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
public interface IMarcaCRUD {
    public void Incluir (Marca objmarca) throws Exception;
    public void Alterar(Marca objmarca)throws Exception;
    public Marca Consultar(String id)throws Exception;
    public  ArrayList<Marca> ObterListagemDeMarcas()throws Exception;  
}
