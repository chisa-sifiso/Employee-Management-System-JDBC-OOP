<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <h1>Employee Management System - JDBC</h1>
</head>
<body>

<h1>Employee Management System - JDBC</h1>

<h2>Project Overview</h2>
<p>
    The <strong>Employee Management System</strong> is a Java-based application that demonstrates CRUD (Create, Read, Update, Delete) operations using JDBC (Java Database Connectivity). This system allows the user to manage employee records, including adding new employees, updating employee details, removing employees, and retrieving lists of employees from the database.
</p>

<h2>Technologies Used</h2>
<ul>
    <li>Java</li>
    <li>JDBC (Java Database Connectivity)</li>
    <li>Apache Derby (as the database)</li>
    <li>NetBeans IDE</li>
</ul>

<h2>Features</h2>
<ul>
    <li>Add a new employee to the database</li>
    <li>Update an employee's age based on their name</li>
    <li>Delete an employee record using their ID</li>
    <li>Search for an employee by their ID</li>
    <li>Retrieve a list of all employees</li>
</ul>

<h2>Project Structure</h2>
<ul>
    <li><strong>Employee</strong>: A class representing an employee, containing fields like ID, name, surname, gender, age, date of birth, and a timestamp.</li>
    <li><strong>EmployeeInterface</strong>: Defines the methods for adding, updating, deleting, searching, and listing employees.</li>
    <li><strong>EmployeesManage</strong>: Implements the <strong>EmployeeInterface</strong> and provides the logic to interact with the database using JDBC.</li>
</ul>

<h2>Database</h2>
<p>The system uses Apache Derby as the database. Below is the structure of the <code>EMPLOYEE_TBL</code>:</p>
<ul>
    <li><strong>ID_NUMBER</strong> (VARCHAR): Employee ID</li>
    <li><strong>NAME</strong> (VARCHAR): Employee's first name</li>
    <li><strong>SURNAME</strong> (VARCHAR): Employee's surname</li>
    <li><strong>GENDER</strong> (CHAR): Employee's gender</li>
    <li><strong>AGE</strong> (INTEGER): Employee's age</li>
    <li><strong>DOB</strong> (DATE): Employee's date of birth</li>
    <li><strong>TIMESTAMP</strong> (TIMESTAMP): Record creation timestamp</li>
</ul>

<h2>How to Run</h2>
<ol>
    <li>Clone this repository.</li>
    <li>Open the project in NetBeans IDE.</li>
    <li>Ensure that Apache Derby is running and the database connection details in <code>EmployeesManage</code> are correct.</li>
    <li>Run the project and test the various CRUD operations.</li>
</ol>

<h2>Example Usage</h2>
<p>To add an employee:</p>
<pre>
<code>
Employee emp = new Employee("014331","Sso","Zwane",'M',24,Date.valueOf("2021-09-23"), new Timestamp(System.currentTimeMillis()));
employeesManage.addEmp(emp);
</code>
</pre>

<h2>Contributors</h2>
<p>Developed by: Sifiso</p>

</body>
</html>
