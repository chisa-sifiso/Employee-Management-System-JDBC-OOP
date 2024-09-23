
package tut111;



import java.sql.Timestamp;
import java.sql.Date;

public class Employee {
    private String id,name,surname;
    private char gender;
    private int age;
    private Date DOB;
    private Timestamp timestamp;

    public Employee() {
    }
    public Employee(String id, String name, String surname, char gender, int age, Date DOB, Timestamp timestamp) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
        this.DOB = DOB;
        this.timestamp = timestamp;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", gender=" + gender + ", age=" + age + ", DOB=" + DOB + ", timestamp=" + timestamp + '}';
    }
   
    
    
}
