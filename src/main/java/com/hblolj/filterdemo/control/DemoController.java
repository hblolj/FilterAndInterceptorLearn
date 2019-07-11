package com.hblolj.filterdemo.control;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: hblolj
 * @Date: 2019/4/8 11:18
 * @Description:
 * @Version:
 **/
@RestController
@RequestMapping("/controller")
public class DemoController {

    @GetMapping("/demo/{sex}")
    public String demo(@RequestParam String name,  @PathVariable Integer sex, HttpServletRequest request){
        System.out.println("进入方法");
        System.out.println("方法返回前");
        System.out.println("name: " + name + " Sex: " + sex);
        System.out.println("contextPath: " + request.getContextPath());
        System.out.println("requestURI: " + request.getRequestURI());
        System.out.println("requestURL: " + request.getRequestURL());
        return "Filter!";
    }
}
