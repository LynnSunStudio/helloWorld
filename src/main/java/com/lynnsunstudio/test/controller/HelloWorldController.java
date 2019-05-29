package com.lynnsunstudio.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: HelloWorldController
 * @description: <一句话功能简述>
 * <功能详细描述>
 * @author: LynnSun
 * @date: 2019/5/28 17:35
 * @version: 1.0
 */
@RestController
public class HelloWorldController {

    @GetMapping("/sayHello")
    public String say(){
        return "Hello World ！！！";
    }
}
