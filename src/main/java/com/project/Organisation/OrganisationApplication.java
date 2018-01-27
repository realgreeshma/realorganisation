package com.project.Organisation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class OrganisationApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(OrganisationApplication.class, args);

        for (String name : applicationContext.getBeanDefinitionNames()) {
            System.out.println(name);
        }
    }

}