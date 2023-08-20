/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import modelos.Modelo;
import modelos.IModeloCRUD;

import persistencia.ModeloDAO;

/**
 *
 * @author Aluno
 */
public class ModeloControle implements IModeloCRUD{
    
     IModeloCRUD modeloPersistencia = null;
     
     public ModeloControle() {
        modeloPersistencia = new ModeloDAO();
    
     }

    @Override
    public void Incluir(Modelo objmodelo) throws Exception {
        try {
           if (objmodelo.getId().isEmpty())throw new Exception ("ID ESTÁ EM BRANCO");
             modeloPersistencia.Incluir(objmodelo);
        } catch (Exception erro) {
            String msg = "Metodo INCLUIR/MODELOCONTROLE - " +erro.getMessage();
            throw new Exception(msg);
        }
       
    }

    @Override
    public ArrayList<Modelo> ObterListagemDeModelos() throws Exception {
        return modeloPersistencia.ObterListagemDeModelos();
    }

    @Override
    public void Alterar(Modelo modelo) throws Exception {
         modeloPersistencia.Alterar(modelo);
  
    }

    @Override
    public Modelo Consultar(String id) throws Exception {
        return modeloPersistencia.Consultar(id);
    }
}


