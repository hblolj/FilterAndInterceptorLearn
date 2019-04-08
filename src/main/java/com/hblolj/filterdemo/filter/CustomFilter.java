package com.hblolj.filterdemo.filter;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author: hblolj
 * @Date: 2019/4/8 11:17
 * @Description:
 * @Version:
 **/
public class CustomFilter extends OncePerRequestFilter {

    @Override
    protected void initFilterBean() throws ServletException {
        System.out.println("CustomFilter Init(): " + this);
        super.initFilterBean();
    }

    @Override
    protected void doFilterInternal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("CustomFilter doFilter()1!");
        filterChain.doFilter(httpServletRequest, httpServletResponse);
        System.out.println("CustomFilter doFilter()2!");
    }

    @Override
    public void destroy() {
        System.out.println("CustomFilter destroy()!");
    }
}
