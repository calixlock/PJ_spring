package com.calixlock.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MemberController {

    @GetMapping("/member/save")
    public String SaveForm() {
        return "save";
    }

}
