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
public interface ITiposDeGastosCRUD {
    
    public void Incluir (TiposDeGastos objTiposDeGastos) throws Exception;
    public  ArrayList<TiposDeGastos> ObterListagemDeTiposDeGastos()throws Exception; 
}
