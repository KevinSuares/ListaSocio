package Dao;

import java.sql.ResultSet;
import Model.Pessoa;

public class PDao {

   
     public void Criar(Pessoa pes){
        String sql = "INSERT INTO Pessoa (NomeP, email ,data , cpf, sex, ddd, Tele, senha) VALUES ("
                + " ' "+pes.getNome()+"  ',"
                + " ' "+pes.getCPF()+"  ',"
                + " ' "+pes.getTelefone()+"  ',"
                + " ' "+pes.getEmail()+" ',"
                + " ' "+pes.getSenha()+" ')";
              
             Conexao.executar(sql);
     }
     
     
      
}
