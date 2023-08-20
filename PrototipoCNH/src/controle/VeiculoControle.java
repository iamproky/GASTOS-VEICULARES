/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import modelos.IVeiculoCRUD;
import modelos.Veiculo;
import persistencia.VeiculoDAO;

/**
 *
 * @author Aluno
 */
public class VeiculoControle implements IVeiculoCRUD{
    IVeiculoCRUD veiculoPersistencia = null;
    
    public VeiculoControle (){
        veiculoPersistencia = new VeiculoDAO();
    }

    @Override
    public void Cadastrar(Veiculo objVeiculo) throws Exception {
        veiculoPersistencia.Cadastrar(objVeiculo);
    }

    @Override
    public void Alterar(Veiculo objVeiculo) throws Exception {
       veiculoPersistencia.Alterar(objVeiculo);
    }

    @Override
    public ArrayList<Veiculo> ObterListagemDeVeiculos() throws Exception {
        return veiculoPersistencia.ObterListagemDeVeiculos();
    }
    
}
