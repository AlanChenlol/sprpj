package com.sprpj.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello world springboot!";
    }

    @PostMapping("/posthello")
    public String test2(){
        return "post world springboot!";
    }

    @DeleteMapping("/deletehello")
    public String test3(){
        return "delete world springboot!";
    }

    @GetMapping("/param/{userid}/{password}")
    public String test4(@PathVariable String userid, @PathVariable String password){
        return "hello param get!" + userid + " : " + password;
    }

    @GetMapping("/param5")
    public String test5(@RequestParam("userid") String abc, @RequestParam String password){
        return "hello param get!" + abc + " : " + password;
    }
}
