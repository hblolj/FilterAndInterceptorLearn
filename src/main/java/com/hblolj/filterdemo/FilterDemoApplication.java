package com.hblolj.filterdemo;

import com.hblolj.filterdemo.filter.CustomFilter;
import com.hblolj.filterdemo.filter.LogFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.servlet.DispatcherType;

@SpringBootApplication
public class FilterDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(FilterDemoApplication.class, args);
	}

	@Bean
	public CustomFilter customFilter(){
	    return new CustomFilter();
    }

	// 第一种方式
    @Bean
    public FilterRegistrationBean filterRegistrationBean(CustomFilter filter){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(filter);
        // 拦截的范围
        filterRegistrationBean.addUrlPatterns("/demo");
        filterRegistrationBean.setDispatcherTypes(DispatcherType.REQUEST, DispatcherType.FORWARD);
        // 自定义 filter 名称
        filterRegistrationBean.setName("MyCustomFilter");
        // 设置当前 filter 是否注册到 ServletContext
        filterRegistrationBean.setEnabled(true);
        return filterRegistrationBean;
    }

    // 第二种方式
//    public DelegatingFilterProxyRegistrationBean delegatingFilterProxyRegistrationBean(){
//        DelegatingFilterProxyRegistrationBean registrationBean = new DelegatingFilterProxyRegistrationBean("logFilter");
//        return registrationBean;
//    }

    // 第三种方式 直接用 IOC 容器来管理 Filter
}
