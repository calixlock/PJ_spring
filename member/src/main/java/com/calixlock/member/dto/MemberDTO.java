package com.calixlock.member.dto;

import com.calixlock.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본 생성자
//@AllArgsConstructor // 필드 내 모든 생성자
@ToString // 필드 값 출력
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    // entity > dto 객체 변환 및 데이터 전환
    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
