package btech;

import java.sql.Connection;
import java.sql.*;
public class studentdao {
    public static boolean inserdata(student st){
        boolean f=false;
        try {
            Connection con=provider.create();
            String q="insert into student(name,phone,city) value (?,?,?)";
            PreparedStatement pr=con.prepareStatement(q);
            pr.setString(1,st.getName());
            pr.setString(2,st.getPhone());
            pr.setString(3,st.getCity());
            pr.executeUpdate();
            f=true;
        }catch (Exception e){
            e.printStackTrace();

        }return f;
    }
    public static boolean delete_data(int userid){
        boolean f=false;
        try {
            Connection con=provider.create();
            String q="delete from student where id=?";
            PreparedStatement pr=con.prepareStatement(q);
           pr.setInt(1,userid);
            pr.executeUpdate();
            System.out.println("your dadta is delete");
            f=true;
        }catch (Exception e){
            e.printStackTrace();

        }return f;
    }
    public static boolean display(){
        boolean f=false;
        try {
            Connection con=provider.create();
            String q="select*from student";
          Statement statement=con.createStatement();
          ResultSet set =statement.executeQuery(q);
          while (set.next()){
              String id=set.getString(1);
              String name =set.getString(2);
              String phone=set.getString(3);
              String city = set.getString("city");
              System.out.println(id);
              System.out.println(name);
              System.out.println(phone);
              System.out.println(city);
          }


        }catch (Exception e){
            e.printStackTrace();

        }return f;

    }
}
