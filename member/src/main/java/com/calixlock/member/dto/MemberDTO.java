package com.calixlock.member.dto;

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
}
