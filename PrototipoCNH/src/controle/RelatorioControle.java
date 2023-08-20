/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;
import modelos.IRelatorioCRUD;
import modelos.Relatorio;
import persistencia.RelatorioDAO;
/**
 *
 * @author Aluno
 */
public class RelatorioControle implements IRelatorioCRUD {
     IRelatorioCRUD relatorioPersistencia = null;
     
     public RelatorioControle() {
        relatorioPersistencia = new RelatorioDAO();
    
     }
    @Override
    public void calcular(Relatorio objrelatorio) throws Exception {
        relatorioPersistencia.calcular(objrelatorio);
    }
    
}
