package com.lei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableConfigServer
public class App 
{
    public static void main( String[] args )
    {	
    	SpringApplication.run(App.class, args);
        System.out.println( "hi my name is config-service,Hello World!" );
    }
}
