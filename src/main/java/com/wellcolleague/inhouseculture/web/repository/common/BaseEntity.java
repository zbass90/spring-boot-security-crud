package com.wellcolleague.inhouseculture.web.repository.common;

import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Getter
@MappedSuperclass //상속 관계 매팅, 공통 매핑 정보가 필요할 때 사용
@EntityListeners(AuditingEntityListener.class) //EntityListeners는 JPA Entity에 Persist, Remove, Update, Load에 대한 event 전과 후에 대한 콜백 메서드를 제공함.
public abstract class BaseEntity extends BaseTimeEntity{

    @CreatedBy
    @Column(updatable = false)
    private String createdBy;

    @LastModifiedBy
    private String modifiedBy;
}
