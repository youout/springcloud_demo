package com.qf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
@RequestMapping("/ribbon")
public class RibbonController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
       String str = restTemplate.getForObject("http://PROVIDER/provider/test",String.class);
        return str;
    }
}
