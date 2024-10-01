package com.sk;

import java.io.File;

import jakarta.servlet.ServletContext;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;


/**
 * Application Lifecycle Listener implementation class MyServletListner
 *
 */
public class MyServletListner implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public MyServletListner() {
        // TODO Auto-generated constructor stub
    }



	

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
    	
        Object source = sce.getSource();
        System.out.println(source);
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	
         
        
    }
	
}
