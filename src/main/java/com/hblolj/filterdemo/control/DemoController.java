package com.hblolj.filterdemo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hblolj
 * @Date: 2019/4/8 11:18
 * @Description:
 * @Version:
 **/
@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo(){
        System.out.println("进入方法");
        System.out.println("方法返回前");
        return "Filter!";
    }
}
