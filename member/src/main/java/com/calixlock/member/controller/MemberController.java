package com.calixlock.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {

    @GetMapping("/member/save")
    public String SaveForm() {
        return "save";
    }
    @PostMapping("/member/save")
    public String save(@RequestParam("memberEmail") String memberEmail,
    @RequestParam("memberPassword") String memberPassword,
    @RequestParam("memberName") String memberName){
        System.out.println("MemberController.save");
        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
        return "index";
    }
}
