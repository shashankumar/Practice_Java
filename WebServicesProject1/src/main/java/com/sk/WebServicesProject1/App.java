package com.sk.WebServicesProject1;

import java.rmi.ServerRuntimeException;

import jakarta.xml.ws.Endpoint;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ServerRuntimeException
    {
        System.out.println( "Hello World!" );
        String str = "http://localhost:9998/WebServicess/test1";
        
        Employee emp = new Employee();
        
        Endpoint.publish(str, emp);
    }
}
