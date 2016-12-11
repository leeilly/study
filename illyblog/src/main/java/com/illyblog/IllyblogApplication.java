package com.illyblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication 
//@Configuration + @ComponentScan + @EnableAutoConfiguration
public class IllyblogApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {
		SpringApplication.run(IllyblogApplication.class, args);
	}
	
	@Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
    }
	
}
