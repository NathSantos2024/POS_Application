package pos;

import java.sql.*;
import javax.swing.JOptionPane;

public class testarLigacao {

    public static void main(String[] args) {
        ligacaoMySql bd=new ligacaoMySql();
        Connection cn=bd.criarLigacao();
        
        JOptionPane.showMessageDialog(null, bd.estadoLigacao(), 
                "Liga��o ao MySql", 
                JOptionPane.INFORMATION_MESSAGE);
    }
    
}
