package pers.study.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pers.study.demo.bean.User;

@Controller
public class TestController {

    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }

    @ResponseBody
    @RequestMapping("/hello")
    public String toHello(){
        User leo = new User("leo", 21);
        return leo.toString();
    }

}
