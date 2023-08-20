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
public interface IModeloCRUD {
    
    public void Incluir (Modelo objmodelo) throws Exception;
    public void Alterar(Modelo objmodelo)throws Exception;
    public Modelo Consultar(String id)throws Exception;
    public  ArrayList<Modelo> ObterListagemDeModelos()throws Exception;
    
}
