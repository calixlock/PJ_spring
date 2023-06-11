package com.calixlock.member.service;

import com.calixlock.member.controller.MemberController;
import com.calixlock.member.dto.MemberDTO;
import com.calixlock.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {

    }
}
