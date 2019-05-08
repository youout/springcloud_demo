package com.qf.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/provider")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/test")
    @ResponseBody
    public String test(){
        String str = "提供者的test方法被调用，提供者的端口为："+port;
        System.out.println(str);
        return str;
    }
}
