package com.artarkatesoft.artsfgjokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotesBean(){
        return new ChuckNorrisQuotes();
    }

}
