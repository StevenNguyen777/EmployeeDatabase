package com.techsolutions.employeedatabase;

import java.sql.Timestamp;
import java.util.*;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        Employee emp = new Employee(); //created new employee objects type Employee
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        //Create a new list of employees that is empty
        List<Employee> employees = new ArrayList<>();


        //Word banana = new Word("A banana is a fruit that grows in the tropics");
        //Word computer = new Word("A computer is a electronic device used to perform binary operations");
        //...
        //banana.getDefinition() = "A banana is a fruit that grows in the tropics");
        emp.setBadgeNumber(252426);
        emp.setDepartment("Finance");
        emp.setName("Steven Nguyen");
        emp.setSalary(100000);


        //Create the second employee
        emp2.setBadgeNumber(77777);
        emp2.setDepartment("Maintenance");
        emp2.setName("Phil Wells");
        emp2.setSalary(60000);

        emp3.setBadgeNumber(11111);
        emp3.setDepartment("Developement");
        emp3.setName("Jacob Jewie");
        emp3.setSalary(800000);

        //Add 3 employees to our employees list.
        employees.add(emp);
        employees.add(emp2);
        employees.add(emp3);

        Map<Integer, String> empDirectory = new HashMap<>(); //specify what data types the key and value are with angle brackets <>


        for (Employee employee : employees) { //for each employee in the employees list, go ahead and add their badge number as the key and their name as the value into our hashmap
            empDirectory.put(employee.getBadgeNumber(), employee.getName());
        }

        Date date = new Date();    //time stamp function
        long time = date.getTime();
        Timestamp ts = new Timestamp(time);

        //Ask for the badge number and store the input as an integer called "inputBadge Number"
        System.out.println("Please enter badge #");
        int inputBadgeNumber = Scanner.nextInt();
        String empName = empDirectory.get(inputBadgeNumber); //When you call the get method on a hashmap, it will retrieve the value associated with that key or null if it couldnt' find the key.
        //Print the name retrieved from the hashmap.
        if (empName == null) {
            System.out.println("Your entry does not match our records! Attempted login Date/Time: " + ts); // wow! instead of making the badge # = to name to print we can make it equal to null and print name if else
        } else {
            System.out.println("Hello " + empName + ",  welcome to work!");
            System.out.println("Clock in Date/time: " + ts);
        }
    }
}
