package com.calixlock.member.service;

import com.calixlock.member.controller.MemberController;
import com.calixlock.member.dto.MemberDTO;
import com.calixlock.member.entity.MemberEntity;
import com.calixlock.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // repository의 save 메서드 호출 / 조건. entity 객체를 넘겨줘야함
        // 1. dto -> entity 객체 변환 >> memberEntity.java에서 호출
        // 2. respository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntitiy(memberDTO);
        memberRepository.save(memberEntity); // java 제공 method 'save'

    }
}
