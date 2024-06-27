package src;
import java.sql.*;
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String  username = "root";
        String password = "1234";
        String Query = "Select * from employee";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers Loaded Succesfully");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
try {
//    These are mandatory step for jdbc connection
Connection con = DriverManager.getConnection(url,username,password);
System.out.println("connection Established Succesfully");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(Query);
while (rs.next()){
    int id = rs.getInt("id");
    String name = rs.getString("name");
    String job_title = rs.getString("job_title");

    double salary = rs.getDouble("salary");

    System.out.println("ID : " + id);
    System.out.println("Name : " + name);
    System.out.println("Job id : " + job_title);
    System.out.println("salary : " + salary);
    System.out.println("******************");
}

}catch (SQLException e){
    System.out.println(e.getMessage());
}

    }
}
