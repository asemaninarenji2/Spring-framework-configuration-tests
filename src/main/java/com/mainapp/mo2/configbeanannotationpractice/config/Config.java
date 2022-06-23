package com.mainapp.mo2.configbeanannotationpractice.config;

import com.mainapp.mo2.configbeanannotationpractice.beans.FirstBean;
import com.mainapp.mo2.configbeanannotationpractice.beans.SecondBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    FirstBean firstBean(){
        return new FirstBean();
    }

    @Bean
    SecondBean secondBean(){
        return new SecondBean();
    }
}
