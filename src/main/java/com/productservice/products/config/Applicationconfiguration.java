package com.productservice.products.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Applicationconfiguration {
@Bean
    public RestTemplate createresttemplete()
    {
        RestTemplate restTemplate=new RestTemplate();
                return restTemplate;
    }

}
