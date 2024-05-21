package btech;
import java.sql.Connection;
import java.sql.DriverManager;
public class provider { static Connection con;
    public static Connection create(){

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String user ="root";
            String passward="9336119497";
            String url="jdbc:mysql://localhost:3306/b_tech";
            con=DriverManager.getConnection(url,user,passward);
        }catch (Exception e){
            e.printStackTrace();
            System.out.printf("e");
        }
        return con;
    }
}
