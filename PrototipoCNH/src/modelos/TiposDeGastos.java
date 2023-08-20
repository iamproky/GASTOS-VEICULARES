/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class TiposDeGastos {
    private String tipodogastos = "";
    private String valor = "";
    private String data = "";
    private String placa = "";

    public TiposDeGastos() {
        tipodogastos = "";
        valor = "";
        data = "";
        placa = "";
    }
    public TiposDeGastos(String tipodogastos, String valor, String data, String placa)throws Exception{
        this.tipodogastos = tipodogastos;
        //if (valor <= 0) throw new Exception("O valor nao pode ser menor ou igual a 0");
        if (valor.equals("") ) throw new Exception("CAMPO DO VALOR ESTÁ VAZIO");
        this.valor = valor;
        if (data.equals("") ) throw new Exception("CAMPO DO DATA ESTÁ VAZIO");
        this.data = data;
        this.placa = placa;
    }

    public String getTipodogastos() {
        return tipodogastos;
    }

    public void setTipodogastos(String tipodogastos) {
        this.tipodogastos = tipodogastos;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor)throws Exception {
        if (valor.equals("") ) throw new Exception("CAMPO DO VALOR ESTÁ VAZIO");
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data)throws Exception{
        if (data.equals("") ) throw new Exception("CAMPO DO DATA ESTÁ VAZIO");
        this.data = data;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    

    @Override
    public String toString() {
        return tipodogastos + ";" + valor + ";" + data + ";"+placa;
    }
    
}
