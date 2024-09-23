
package tut111;


import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.*;

public class EmployeesManage implements EmployeeInterface{
  private Connection conn;
    public EmployeesManage(String url, String user, String password) throws SQLException {
       conn=DriverManager.getConnection(url, user, password);
        
    }

   
    @Override
    public void addEmp(Employee e) throws SQLException {
        
     String insert = "Insert into EMPLOYEE_TBL values(?,?,?,?,?,?,?)";
      PreparedStatement  ps=  conn.prepareStatement(insert);
      ps.setString(1, e.getId());
      ps.setString(2, e.getName());
      ps.setString(3, e.getSurname());
      ps.setString(4, Character.toString(e.getGender()));
      ps.setInt(5, e.getAge());
      ps.setDate(6, (Date) e.getDOB());
      ps.setTimestamp(7, e.getTimestamp());
      
    System.out.println(ps.executeUpdate()+" number of rows have been inserted");
    }

   

    @Override
    public void remove(String id) throws SQLException {
        String remove = "Delete FROM EMPLOYEE_TBL where ID_NUMBER=?";
        PreparedStatement  ps=  conn.prepareStatement(remove);
        ps.setString(1, id);
        System.out.println(ps.executeUpdate()+" number of rows have been delected");
    }

    @Override
    public Employee search(String id) throws SQLException {
       String record= "Select * from EMPLOYEE_TBL where ID_NUMBER=?";
        PreparedStatement  ps=  conn.prepareStatement(record);
        ps.setString(1, id);
        ResultSet rs=ps.executeQuery();
        if(rs.next()){
          Employee e = new Employee(); 
          
          e.setId(rs.getString(1));
          e.setName(rs.getString(2));
          e.setSurname(rs.getString(3));
          e.setGender(rs.getString(4).charAt(0));
          e.setAge(rs.getInt(5));
          e.setDOB(rs.getDate(6));
          e.setTimestamp(rs.getTimestamp(7));
          return e;
        }
        else return null;
    }

    @Override
    public List<Employee> listofE(Employee e) throws SQLException {
        List<Employee> list = new ArrayList<>();
        
         String record= "Select * from EMPLOYEE_TBL";
        PreparedStatement  ps=  conn.prepareStatement(record);
     
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
          e= new Employee();
          e.setId(rs.getString(1));
          e.setName(rs.getString(2));
          e.setSurname(rs.getString(3));
          e.setGender(rs.getString(4).charAt(0));
          e.setAge(rs.getInt(5));
          e.setDOB(rs.getDate(6));
          e.setTimestamp(rs.getTimestamp(7));
          list.add(e);
          
        }
       return list;
    }

    @Override
    public void updateage(String name,int age) throws SQLException {
         String update = "Update EMPLOYEE_TBL  set age = ? where name = ?";
        PreparedStatement  ps=  conn.prepareStatement(update);
        ps.setString(2, name);//replaces the question mark its not seting
        ps.setInt(1, age);//replaces the question mark its not seting
        System.out.println(ps.executeUpdate()+" num of rows updated");
    }
    
}
