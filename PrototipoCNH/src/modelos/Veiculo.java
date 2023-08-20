/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Veiculo {
   private String placa = "";
   private String cor = "";
   private String combustivel = "";
   private String modelo = "";
   private String ano = "";
   private String proprietarioVeiculo = "";

    public Veiculo() {
        placa = "";
        cor = "";
        combustivel = "";
        modelo = "";
        ano = "";
        proprietarioVeiculo = "";
    }
    public Veiculo(String placa,String cor,String combustivel,String modelo,String ano, String proprietarioVeiculo)throws Exception{
       this.placa = placa;
       if ( placa.equals("") ) throw new Exception("CAMPO PLACA ESTÁ VAZIO");
       
       this.cor = cor;
       if ( cor.equals("") ) throw new Exception("CAMPO COR ESTÁ VAZIO");  
       
       this.combustivel = combustivel;
       if ( combustivel.equals("") ) throw new Exception("CAMPO COMBUSTIVEL ESTÁ VAZIO");  
       
       if ( modelo.equals("") ) throw new Exception("CAMPO MODELO ESTÁ VAZIO");
       this.modelo = modelo;
       
       if ( ano.equals("") ) throw new Exception("CAMPO ANO ESTÁ VAZIO");
       this.ano = ano;
       this.proprietarioVeiculo = proprietarioVeiculo;
       
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getProprietarioVeiculo() {
        return proprietarioVeiculo;
    }

    public void setProprietarioVeiculo(String proprietarioVeiculo) {
        this.proprietarioVeiculo = proprietarioVeiculo;
    }
    
    @Override
    public String toString() {
        return placa+";"+cor+";"+combustivel+";"+modelo+";"+ano+";"+proprietarioVeiculo;
    }
    
    
        
   
   
    
}
