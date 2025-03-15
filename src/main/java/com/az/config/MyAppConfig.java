package com.az.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Annotation @Configuration, used to replace the previous configuration files.
 * <p>
 * Annotation @Value and @Bean are both equivalent replacements for the <bean> tag attribute.
 */
@Configuration
public class MyAppConfig {

    /**
     * Add the return value of the method to the container, and the default ID of this component in
     * the container is the method name.
     *
     * @return HelloService Instance
     */
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }

    public static class HelloService {
    }
}
