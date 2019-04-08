package com.hblolj.filterdemo.config;

import com.hblolj.filterdemo.interceptor.CustomInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author: hblolj
 * @Date: 2019/4/8 15:13
 * @Description:
 * @Version:
 **/
@Configuration
public class Config extends WebMvcConfigurerAdapter{

    @Bean
    public CustomInterceptor customInterceptor(){
        return new CustomInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customInterceptor()).addPathPatterns("/**");
    }
}
