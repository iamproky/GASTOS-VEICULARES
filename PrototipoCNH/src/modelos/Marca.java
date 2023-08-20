/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Marca {
    private String id = "";
    private String marca = "";
    private String logo = "";
    
    public Marca() {
        id = "";
        marca = "";
        logo = "";
    }
    public Marca(String id,String marca, String logo)throws Exception {
        
        this.id = id;
        this.marca = marca;
        this.logo = logo;
        if ( logo.equals("") ) throw new Exception("SELECIONE A LOGO");
    
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id)throws Exception {
        if ( id.equals(" ") ) throw new Exception("CAMPO ID ESTÁ VAZIO");
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    

    @Override
    public String toString() {
        return id+";"+marca+";"+logo;
    }
    
    
    
    
    
}
