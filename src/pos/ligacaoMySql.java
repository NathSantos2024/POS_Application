package pos;

import java.sql.*;
import javax.swing.JOptionPane;

public class ligacaoMySql {
    public String estado="Não ligado";
    
    public Connection criarLigacao(){
        Connection cn=null;
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            Class.forName(driver);
            String caminho="jdbc:mysql://127.0.0.1:3306/bd_pastelaria?useTimezone=true&serverTimezone=UTC";
            String utilizador="root";
            String password="";
            cn=DriverManager.getConnection(caminho,utilizador,password);
            if(cn!=null){
                estado="Ligação ao servidor ok!";
            }
            return cn;
        }
        catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, 
                    "Driver não encontrado!", "POS", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, 
                    "Erro na ligação à base de dados!", "POS", JOptionPane.ERROR_MESSAGE);
            return null;            
        }
    }
    public String estadoLigacao(){
        return(estado);
    }    
}
