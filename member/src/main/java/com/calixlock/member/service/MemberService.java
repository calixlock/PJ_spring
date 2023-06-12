package com.calixlock.member.service;

import com.calixlock.member.controller.MemberController;
import com.calixlock.member.dto.MemberDTO;
import com.calixlock.member.entity.MemberEntity;
import com.calixlock.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public void save(MemberDTO memberDTO) {
        // repository의 save 메서드 호출 / 조건. entity 객체를 넘겨줘야함
        // 1. dto -> entity 객체 변환 >> memberEntity.java에서 호출
        // 2. respository의 save 메서드 호출
        MemberEntity memberEntity = MemberEntity.toMemberEntitiy(memberDTO);
        memberRepository.save(memberEntity); // java 제공 method 'save' > insert Query를 만들어서 넣어준다

    }

    public MemberDTO login(MemberDTO memberDTO) {
        // 1. 회원이 입력한 이메일 DB 조회
        // 2. DB에 저장된 비밀번호와 사용자가 입력한 비밀번호가 일치여부 판단
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberDTO.getMemberEmail());
        if (byMemberEmail.isPresent()){
            // 조회 결과 있다 (정보 있음)
            MemberEntity memberEntity = byMemberEmail.get();
            if(memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())) {
                // 비밀번호 일치
                // entity는 service 객체 까지만 사용 / entity > dto 변환 DTO객체에서 변환 데이터 가져오기
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            } else {
                // 비밀번호 불일치
                return null;
            }
        }else{
            // 조회 결과 없다 (정보 없음)
            return null;
        }


    }
    //entityList 객체의 데이터를 dtoList 객체로 변환해 controller로 전달
    public List<MemberDTO> findAll() {
        List<MemberEntity> memberEntityList = memberRepository.findAll();
        List<MemberDTO> memberDTOList = new ArrayList<>();
        for (MemberEntity memberEntity : memberEntityList) {
//            MemberDTO memberDTO = MemberDTO.toMemberDTO(memberEntity);
//            memberDTOList.add(memberDTO)
            memberDTOList.add(MemberDTO.toMemberDTO(memberEntity));
        }
        return memberDTOList;
    }
}
