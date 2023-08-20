/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelos.ITiposDeGastosCRUD;
import modelos.TiposDeGastos;
import persistencia.TiposDeGastosDAO;
import modelos.TiposDeGastos;
/**
 *
 * @author Aluno
 */
public class TiposDeGastosControle implements ITiposDeGastosCRUD {

    ITiposDeGastosCRUD tiposdegastosPersistencia = null;
    ValidaData validardata = new ValidaData();

    public TiposDeGastosControle() {
        tiposdegastosPersistencia = new TiposDeGastosDAO();
    }

    @Override
    public void Incluir(TiposDeGastos objTiposDeGastos) throws Exception {
        try {
            
            tiposdegastosPersistencia.Incluir(objTiposDeGastos);
            
        } catch (Exception erro) {
            String msg = "Metodo INCLUIR/Tipos de Gastos Controle - " +erro.getMessage();
            throw new Exception(msg);
        }
    }
    @Override
    public ArrayList<TiposDeGastos> ObterListagemDeTiposDeGastos() throws Exception {
        return tiposdegastosPersistencia.ObterListagemDeTiposDeGastos();
    }
}
