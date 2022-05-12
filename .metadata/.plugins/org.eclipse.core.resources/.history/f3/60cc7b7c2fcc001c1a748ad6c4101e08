package JDPC;
import java.sql.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InsertDataBase 
{
    public static void main (String args[]) throws NumberFormatException, IOException
    {
        String url="jdbc:oracle:thin:@localhost:1521:xe";
           String username ="system";
           String password="oracle";
           try {
               Connection con =DriverManager.getConnection(url,username,password);
               BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
            
            System.out.println("Enter Jersy no");
            int jersy_no =Integer.parseInt(br.readLine());
           System.out.println("Enter Player Name");
            String players_name =br.readLine();
            System.out.println("Enter Score");
            int score =Integer.parseInt(br.readLine());
            System.out.println("Enter Salary");
            int salary =Integer.parseInt(br.readLine());
            System.out.println("Enter Team ID");
            int team_id =Integer.parseInt(br.readLine());
            System.out.println("Enter AGE");
          int age =Integer.parseInt(br.readLine());
               String sql ="insert into bcci_cricket values('"+jersy_no+"','"+players_name+"','"+score+"','"+salary+"','"+team_id+"','"+age+"')";
               Statement stmt =con.createStatement();
               int x =stmt.executeUpdate(sql);
               if(x >0) 
               {
                   System.out.println("Inserted Successfully");
               }
               con.close();
           }
           catch(SQLException e) {
               System.out.println("INSert Failed");
               e.printStackTrace();
           }
        }
}
