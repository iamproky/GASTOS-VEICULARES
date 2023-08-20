/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Modelo {
    private String id = "";
    private String descricao = "";
    private String marca = "";
    private String tipoDoVeiculo = "";

    public Modelo() {
       id = "";
       descricao = "";
       marca = "";     
       tipoDoVeiculo = "";
       
      
    }
    public Modelo(String id, String descricao,String marca ,String tipoDoVeiculo) {
       this.id = id;
       this.descricao = descricao;
       this.marca = marca;     
       this.tipoDoVeiculo = tipoDoVeiculo;
       
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

   

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipoDoVeiculo() {
        return tipoDoVeiculo;
    }

    public void setTipoDoVeiculo(String tipoDoVeiculo) {
        this.tipoDoVeiculo = tipoDoVeiculo;
    }
    
    

  

 




    @Override
    public String toString() {
        return id+";"+descricao+";"+marca+";"+tipoDoVeiculo;
    }
}
