package com.calixlock.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.PublicKey;

@Controller
public class HomeController {
    // 기본 페이지 요청
    @GetMapping("/")
    public String index(){
        return "index"; // member\src\main\resources\templates\index.html 찾아감
    }

}
