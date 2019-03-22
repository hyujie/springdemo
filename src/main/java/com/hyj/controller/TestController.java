package com.hyj.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @Authord yujie huang  email: 190158792@qq.com
 * @Description
 * @Date Create by in 17:32 2019/3/22
 */
@RestController
public class TestController {

    @GetMapping("/hello")
    public String test(){
        return "HELLO WORLD";
    }
}
