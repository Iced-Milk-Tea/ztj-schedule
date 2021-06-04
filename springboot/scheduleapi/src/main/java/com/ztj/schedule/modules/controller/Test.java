package com.ztj.schedule.modules.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Zhangtj
 * @create 2021-06-02 16:29
 */
@RestController
@RequestMapping("/test")
public class Test {

    @GetMapping("/get")
    public String get(){
        return "ok";
    }
}
