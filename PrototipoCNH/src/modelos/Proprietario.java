/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Aluno
 */
public class Proprietario {
    private String cpf = "";
    private String nomecompleto = "";
    private String email = "";
    private String cnh = "";
    private String categoria = "";
    private Telefone fone = null;
    private String imagem = "";

    public Proprietario() {
        cpf = "";
        nomecompleto = "";
        email = "";
        cnh = "";
        categoria = "";
        fone = null;
        imagem = "";
    }

    public Proprietario(String cpf, String nomecompleto, String email,Telefone fone,String cnh,String categoria,String imagem)throws Exception {
        if (cpf.equals("") ) throw new Exception("CAMPO DO CPF ESTÁ VAZIO");
        this.cpf = cpf;
        if ( nomecompleto.equals("") ) throw new Exception("CAMPO DO NOME ESTÁ VAZIO");
        this.nomecompleto = nomecompleto;
        if ( email.equals("") ) throw new Exception("CAMPO DO EMAIL ESTA VAZIO");
        this.email = email;
        this.fone = fone;
        if ( cnh.equals("") ) throw new Exception("CAMPO DA CNH ESTÁ VAZIO");
        this.cnh = cnh;
        this.categoria = categoria;
        this.fone = fone;
        if ( imagem.equals("") ) throw new Exception("SELECIONE UMA IMAGEM");
        this.imagem = imagem;
        
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf)throws Exception {
        if ( cpf.equals("") ) throw new Exception("CAMPO DO CPF ESTÁ VAZIO");
        this.cpf = cpf;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }
     
    
    public String getCategoria() {
        return categoria;
    }
     public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Telefone getFone() {
        
      return fone;
   }
      public void setFone(Telefone fone) {
        this.fone = fone;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
      
   

    @Override
    public String toString() {
        return cpf + ";"+ nomecompleto +";" + email +";"+fone.toString()+";"+cnh+";"+categoria+";"+imagem;
    }
    
    
}
