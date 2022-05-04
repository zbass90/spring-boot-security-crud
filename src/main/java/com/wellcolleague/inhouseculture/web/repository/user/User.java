package com.wellcolleague.inhouseculture.web.repository.user;

import com.wellcolleague.inhouseculture.web.repository.common.BaseEntity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Getter
@Table(name ="user") // 매핑할 TABLE 명시
@NoArgsConstructor(access = AccessLevel.PROTECTED) // Entity Proxy가 Getter/Stter 내부 메소드로 접근하기에 Public or Protected로 선언해야 함.
public class User extends BaseEntity {

    @Id // javax.persistence.Id: 관계형 DB에서 사용.
        // org.springframework.data.annotation.Id : JPA에 의해 지원되지 않는 Nosql이나 프레임워크에서 사용됨.
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, length = 20)
    @Size(min = 1, max=20)
    private String name;



}
