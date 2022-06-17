package com.example.libroexamples.beancreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init", destroyMethod = "destroy", name = "sampleBean")
    @Description("Demonstrate a simple bean")
    public SampleBean sampleBean(){
        return new SampleBean();
    }

    @Bean
    public BeanInterface beanInterface(){
        return new BeanInterfaceImpl();
    }


}
