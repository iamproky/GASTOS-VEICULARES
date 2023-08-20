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
public interface IVeiculoCRUD {
    
    public void Cadastrar (Veiculo objVeiculo) throws Exception;
    public void Alterar(Veiculo objVeiculo)throws Exception;
    public  ArrayList<Veiculo> ObterListagemDeVeiculos()throws Exception; 
}
