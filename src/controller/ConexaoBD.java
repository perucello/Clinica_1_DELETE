package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Classe Conexão
public class ConexaoBD {
//Detalhes da Conexão    
    private static final String DATABASE="clinica";
    private static final String HOST="jdbc:mysql://localhost:3306/clinica";
    private static final String DRIVER="com.mysql.jdbc.Driver";
    //Para tirar erro de SSL em alguns casos em que tem varios Bancos e Certificados
    private static final String URL="jdbc:mysql://localhost:3306/clinica?useTimezone=true&serverTimezone=UTC&useSSL=false";
    private static final String USR="root";
    private static final String PWD="";
//Metodo conectar    
    public static Connection Conectar(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USR, PWD);
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.out.println("Ocorreu falha na conexão com Banco de Dados, acione equipe de suporte ! ");
            System.out.println("Falha ao Conectar com Banco de Dados: " + "ERRO RETORNADO: " + e.getMessage());
                    JOptionPane.showMessageDialog(null,"Falha de Comunicação com Banco de Dados", "WARNING: Conexão com Banco", JOptionPane.WARNING_MESSAGE);
            return null;
        }
    }
//Método Desconectar    
    public static void Desconectar (Connection con){
        try{
            if (con != null){
                con.close();
            }
        }
        catch (SQLException e){
                System.out.println("ERRO: " + e.getMessage());
               }
        }  
//Metodo Main 
    public static void main(String[] args){
        if (Conectar() != null){
            System.out.println("Conexão realizada com sucesso!");
            System.out.println("Conectado ao Banco de Dados clinica1 - Mysql");
            JOptionPane.showMessageDialog(null,"Operação realizada com sucesso !", "CONEXÃO COM SUCESSO", JOptionPane.INFORMATION_MESSAGE);
        }
    }      
}




