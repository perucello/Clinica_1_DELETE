
package controller;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.PacienteDelete;


public class PacienteDAODeletar {
    
//Abrindo nossa conexão com Banco de Dados
    private final Connection con;
    private PreparedStatement cmd;
       
    public PacienteDAODeletar(){
        this.con = ConexaoBD.Conectar();
    }
//Criando método Deletar
      public int deletar(PacienteDelete p){
        try{
            String sql = "delete from paciente where id = ?";
            cmd = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId());
            cmd.execute();
//            System.out.println("Ecluido com sucesso !");
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
        }
//        catch (HeadlessException | SQLException e){
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        }
        finally{
            ConexaoBD.Desconectar(con);
        }
        return 0;
    }
      
           
//Criando método Listar => trazemos ja do Projeto Listar já criado anteriormente
      //Listar
    public List<PacienteDelete> listar(){
        try{
            String sql = "select * from paciente order by id";
            cmd = con.prepareStatement(sql);
            ResultSet rs = cmd.executeQuery();
            
            List<PacienteDelete> lista = new ArrayList<>();
            while(rs.next()){
                
                PacienteDelete p = new PacienteDelete();
                p.setId(rs.getInt("id"));
                p.setNome(rs.getString("nome"));
                p.setPeso(rs.getFloat("peso"));
                p.setAltura(rs.getFloat("altura"));
                
                lista.add(p);
            }
            return lista;
        }
        catch (SQLException e){
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }   
        finally{
            ConexaoBD.Desconectar(con);
        }
            
    }

    
}

    















////Não necessário
//    //Listar por Nome
//    public List<PacienteDelete> pesquisarPorNome(String nome){
//        try{
//            String sql = "select * from paciente where nome like ? order by nome;";
//            cmd = con.prepareStatement(sql);
//            cmd.setString(1, "%" + nome + "%");
//            
//            ResultSet rs = cmd.executeQuery();
//            List<PacienteDelete> lista = new ArrayList<>();
//            
//            while(rs.next()){
//                PacienteDelete p = new PacienteDelete();
//                p.setId(rs.getInt("id"));
//                p.setNome(rs.getString("nome"));
//                p.setPeso(rs.getFloat("peso")); 
//                p.setAltura(rs.getFloat("altura"));
//                
//                lista.add(p);
//            }
//            return lista;
//        }
//        catch (SQLException e){
//            System.out.println("ERRO: " + e.getMessage());
//            return null;
//        }
//        finally{
//            ConexaoBD.Desconectar(con);
//        }
//    }
    