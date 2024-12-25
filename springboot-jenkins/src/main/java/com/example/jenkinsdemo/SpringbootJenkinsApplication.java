package com.example.jenkinsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootJenkinsApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringbootJenkinsApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootJenkinsApplication.class, args);
    }
}
