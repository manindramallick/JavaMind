/**
 * 
 */
package com.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springboot.data.MvcAppContext;

/**
 * @author shivey.upadhyay
 *
 */
@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("** This is just before application startup           **");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
	public MvcAppContext mvcAppContext() {
		return MvcAppContext.getContext();
	}
	
}
