/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import java.util.ArrayList;
import modelos.Marca;
import modelos.IMarcaCRUD;
import modelos.Telefone;
import persistencia.MarcaDAO;


/**
 *
 * @author Aluno
 */
public class MarcaControle implements IMarcaCRUD {
         IMarcaCRUD marcaPersistencia = null;
         
         
     public MarcaControle() {
        marcaPersistencia = new MarcaDAO();
        
     }

    @Override
    public void Incluir(Marca objmarca) throws Exception {
        try {
            if(objmarca.getId().isBlank()) throw new Exception ("CAMPO ID ESTÁ EM BRANCO");
            if (marcaPersistencia.Consultar(" ") != null) throw new Exception ("ID EXISTENTE");
            
            marcaPersistencia.Incluir(objmarca);
        } catch (Exception erro) {
            
        }
        
    }

    @Override
    public ArrayList<Marca> ObterListagemDeMarcas() throws Exception {
       return   marcaPersistencia.ObterListagemDeMarcas();
    }


    @Override
    public void Alterar(Marca objmarca) throws Exception {
       marcaPersistencia.Alterar(objmarca);
    }

    @Override
    public Marca Consultar(String id) throws Exception {
      return  marcaPersistencia.Consultar(id);
    }
}
    

