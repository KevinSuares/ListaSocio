package Model;

import Dao.PDao;


public class Pessoa {
    
    private String Nome;
    private String Email;
    private String DataN;
    private String CPF;
    private String sexo;
    private String DDD;
    private String Telefone; 
    private String Senha;
    
    public Pessoa(){
    }

    public Pessoa(String Nome, String Email, String DataN, String CPF,String sexo,String DDD, String Telefone, String Senha ) {
        this.Nome = Nome;
        this.Email = Email;
        this.DataN = DataN;
        this.CPF = CPF;
        this.sexo = sexo;
        this.DDD = DDD;
        this.Telefone = Telefone;
        this.Senha = Senha;
    }


    public Pessoa(String Nome, String Email, String CPF, String DDD, String Telefone, String Senha) {
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getDataN() {
        return DataN;
    }

    public void setDate(String Date) {
        this.DataN = DataN;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
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

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public void cadus(){
        PDao pdao =  new PDao();
        pdao.Criar(this);
    }

    public Pessoa cadastraPessoa(String Nome, String Email, String DataN, String CPF, String sexo, String DDD, String Telefone, String Senha) {
       
        Pessoa p = new Pessoa( Nome , Email ,DataN, CPF , sexo, DDD, Telefone, Senha);
        return this;
    }
 
    
}
