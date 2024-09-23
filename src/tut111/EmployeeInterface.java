
package tut111;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeInterface {
 public void addEmp(Employee e)  throws SQLException;
 public void updateage(String name,int age) throws SQLException;
 public void remove(String id) throws SQLException;
 public Employee search(String id) throws SQLException;
 public List<Employee> listofE(Employee e) throws SQLException;
    
}
