package com.devstudy.resume.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;

@Configuration
@ComponentScan({ "com.devstudy.resume.service.impl",
        "com.devstudy.resume.controller",
        "com.devstudy.resume.filter",
        "com.devstudy.resume.listener"})
public class ServiceConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() throws IOException {
        PropertySourcesPlaceholderConfigurer conf = new PropertySourcesPlaceholderConfigurer();
        conf.setLocations(getResources());
        return conf;
    }

    private static Resource[] getResources(){
        return new Resource[] {new ClassPathResource("application.properties")};
    }
}
