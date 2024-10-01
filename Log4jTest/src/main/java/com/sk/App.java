package com.sk;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
	
	static Logger logger = LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
       // Logger logger = LogManager.getLogger(App.class);
        logger.error("Hello Shahsank");
      //  logger.warn("Hello Shahsank");
        //logger.fatal("Hello Shahsank");
    }
}
