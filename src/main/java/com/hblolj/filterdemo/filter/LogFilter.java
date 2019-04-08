package com.hblolj.filterdemo.filter;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: hblolj
 * @Date: 2019/4/8 13:33
 * @Description:
 * @Version:
 **/
@Configuration
@WebFilter(urlPatterns = "/log")
public class LogFilter extends OncePerRequestFilter{

    @Override
    protected void initFilterBean() throws ServletException {
        System.out.println("LogFilter Init!");
        super.initFilterBean();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {

        System.out.println("LogFilter before!");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        System.out.println("LogFilter after!");
    }
}
