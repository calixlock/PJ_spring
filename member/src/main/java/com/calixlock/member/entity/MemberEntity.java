package com.calixlock.member.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// db의 table 생성 역할
@Entity
@Setter
@Getter
@Table(name = "member_table") //db에 생성될 tableName 지정
public class MemberEntity {
    @Id //mySQL's table의 primaryKey(PK)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // mySQL's auto increment
    private Long id;
    @Column(unique = true) // unique 제약 조건 추가
    private String memberEmail;
    @Column(unique = true) // unique 제약 조건 추가
    private String memberPassword;
    @Column(unique = true) // unique 제약 조건 추가
    private String memberName;
}
