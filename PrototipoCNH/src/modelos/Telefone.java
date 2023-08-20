/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Telefone {
    private String ddi = "";
    private String ddd = "";
    private String numero = "";

    public Telefone() {
        ddi = "";
        ddd = "";
        numero = "";
    }
   public Telefone (String ddi, String ddd, String numero)throws Exception {
     
       this.ddi = ddi;
       this.ddd = ddd;
       this.numero = numero;
   }

    public String getDdi() {
        return ddi;
    }

    public void setDdi(String ddi)throws Exception {
        this.ddi = ddi;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd)throws Exception {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero)throws Exception {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return ddi + ";" + ddd + ";" + numero;
    }


   
}

