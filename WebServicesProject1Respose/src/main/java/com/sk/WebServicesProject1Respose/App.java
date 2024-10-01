package com.sk.WebServicesProject1Respose;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        EmployeeService emp =new EmployeeService();
        Employee port = emp.getEmployeePort();
        int i = port.add(3, 5);
        System.out.println(i);
    }
}
