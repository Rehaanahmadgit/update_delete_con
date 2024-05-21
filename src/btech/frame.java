package btech;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class frame{
public static void main(String[] args)throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
        System.out.println(" press 1 add data");
        System.out.println("press 2 delete data");
        System.out.println("press 3 display data");
        System.out.println("press 4 to exit");
        int c = Integer.parseInt(br.readLine());
        if (c == 1) {
            System.out.println("enter user name");
            String name= br.readLine();
            System.out.println("enter user phone");
            String phone=br.readLine();
            System.out.println("enter uer city");
            String city= br.readLine();
            student st=new student(name,phone,city);
          boolean ans =studentdao.inserdata(st);
          if (ans){
              System.out.println("student data insert sucessfully...");
          }else {
              System.out.println("not data insert check error");
          }
        } else if (c == 2) {
            System.out.printf("enter student id delete from the data..");
            int userid=Integer.parseInt(br.readLine());
           boolean f= studentdao.delete_data(userid);
           if(f){
               System.out.printf("delete successfully..");
           }else{
               System.out.printf("samething is error");
           }
        } else if (c == 3) {
studentdao.display();
        } else if (c == 4) {
            break;
        } else {
 student st =new student();
            System.out.printf(st.toString());
        }
    }
    System.out.printf("thankyou for operation");
}
}
