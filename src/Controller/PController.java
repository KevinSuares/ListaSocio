
package Controller;

import Model.Pessoa;


public class PController {
    
    private String Nome;
    private String DataN;
    private String Email;
    private String Senha;
    private String sexo;
    private String DDD;
    private String Telefone;
    private String CPF;
    
    public PController(){
    }

    public PController(String Nome, String Email, String DataN, String CPF,String sexo,String DDD, String Telefone, String Senha ) {
        this.Nome = Nome;
        this.Email = Email;
        this.DataN = DataN;
        this.CPF = CPF;
        this.sexo = sexo;
        this.DDD = DDD;
        this.Telefone = Telefone;
        this.Senha = Senha;
    }

    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDate() {
        return DataN;
    }

    public void setDate(String DataN) {
        this.DataN = DataN;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDDD() {
        return DDD;
    }

    public void setDDD(String DDD) {
        this.DDD = DDD;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    
    public Pessoa cadastraPessoa(String Nome,String Email,String DataN,String CPF,String sexo, String DDD,String Telefone,String Senha){
    
    if(Email!=null && Email.contains("@") && Email.contains(".") && Senha.length()<=10){
        Pessoa pess = new Pessoa( Nome , Email ,DataN, CPF , sexo, DDD, Telefone, Senha);
        
        pess.cadus();
}
    Pessoa p = new Pessoa();
    return p.cadastraPessoa(Nome,Email,DataN,CPF,sexo,DDD,Telefone,Senha); 
    }
}
