package com.zhoujian.controller;

import com.zhoujian.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @Autowired
    private DemoService demoService;

    @RequestMapping("/demo")
    @ResponseBody
    public String demo(){
        return demoService.demo();
    }
}
