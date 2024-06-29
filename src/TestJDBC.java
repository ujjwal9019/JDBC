package src;
import java.sql.*;
public class TestJDBC {
    public static void main(String[] args) throws ClassNotFoundException{

        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String  username = "root";
        String password = "1234";
//        String Query = "insert into employee(id , name , job_title , salary ) VALUES (4 , 'vbvh' , 'backend'  , 25000 ) ";
//        String Query = "DELETE FROM employee where id = 4 ;";
        String Query = "UPDATE employee\n" +
                "SET job_title  = 'Fullstack devloper ' , salary = 70000 \n"
                + "WHERE id = 2 ;"
                ;
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





//To insert

//   int roweffercted =  stmt.executeUpdate(Query);
//   if(roweffercted > 0){
//       System.out.println("inserted succesfull" + roweffercted + "rows effected");
//   }
//   else{
//       System.out.println("insertion failed");
//   }


//  ****************************************


    //to delete
//    int roweffercted = stmt.executeUpdate(Query);
//    if(roweffercted > 0){
//        System.out.println("Delete succesfull" + roweffercted + "rows effected");
//    }
//    else{
//        System.out.println("Delete failed");
//    }


//*********************

// To Update

    int roweffercted = stmt.executeUpdate(Query);
    if(roweffercted > 0){
        System.out.println("UPDATE succesfull" + roweffercted + "rows effected");
    }
    else{
        System.out.println("UPDATE failed");
   }


//***********************************
    //to retrived data from db


//ResultSet rs = stmt.executeQuery(Query);
//while (rs.next()){
//    int id = rs.getInt("id");
//    String name = rs.getString("name");
//    String job_title = rs.getString("job_title");
//
//    double salary = rs.getDouble("salary");
//
//    System.out.println("ID : " + id);
//    System.out.println("Name : " + name);
//    System.out.println("Job id : " + job_title);
//    System.out.println("salary : " + salary);
//    System.out.println("******************");
//}

}catch (SQLException e){
    System.out.println(e.getMessage());
}

    }
}
