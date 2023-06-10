package com.calixlock.member.controller;

import com.calixlock.member.dto.MemberDTO;
import com.calixlock.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor // 객체 주입 방식
public class MemberController {
    // 생성자 주입 방식
    private final MemberService memberService;

    // 회원가입 페이지 출력
    @GetMapping("/member/save")
    public String SaveForm() {
        return "save";
    } // resources/templates/save.html 반환
    @PostMapping("/member/save")
    // method 1
//    public String save(@RequestParam("memberEmail") String memberEmail,
//                        @RequestParam("memberPassword") String memberPassword,
//                        @RequestParam("memberName") String memberName){
//        System.out.println("MemberController.save");
//        System.out.println("memberEmail = " + memberEmail + ", memberPassword = " + memberPassword + ", memberName = " + memberName);
//        return "index";
//    }
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "index";
    }
}
