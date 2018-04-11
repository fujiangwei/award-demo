package com.kinson.banana.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * descripiton:
 *
 * @author: www.iknowba.cn
 * @date: 2018/4/10
 * @time: 9:07
 * @modifier:
 * @since:
 */
@Controller
@RequestMapping(value = "/banana")
public class BananaController {

    @RequestMapping(value = "/award")
    public String award() {
        return "/award";
    }

    @RequestMapping(value = "/test")
    @ResponseBody
    public String test(String num) {
        System.out.println("num -> " + num);
        return "0";
    }
}
