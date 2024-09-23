
package tut111;

import java.sql.Timestamp;
import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;

public class Tut111 {

    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        
        Date dob = Date.valueOf("2021-09-23");
        Timestamp currenttime = new Timestamp(System.currentTimeMillis());
        Employee emp = new Employee("014331","Sso","Zwane",'M',24,dob,currenttime);
        String url ="jdbc:derby://localhost:1527/employeesDB";
        EmployeesManage EM= new EmployeesManage( url,"Baloyi","12345");
        
       EM.addEmp(emp);
        
        for(Employee e:EM.listofE(emp)){
            System.out.println(e.getName()+"  "+e.getId());
        }
        System.out.println(EM.listofE(emp));
    }
    
}
