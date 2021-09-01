package com.oy.testjenskins.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author outengfei
 * @email t15294977908@163.com
 * @date 2021-09-01 15:05
 */
@RestController
@CrossOrigin
public class TestController {

    @GetMapping("/test")
    public String test(){
        return "chenggong";
    }

}
