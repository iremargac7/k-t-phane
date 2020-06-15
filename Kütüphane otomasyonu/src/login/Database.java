
package login;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    public static Connection baglan() throws ClassNotFoundException, SQLException{
        String url= "jdbc:mysql://localhost/mydatabase?useUnicode=true&characterEncoding=UTF-8";
        String kullaniciAdi = "root";
        String sifre="";
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection(url,kullaniciAdi,sifre);
        return con;
    }
    
}
