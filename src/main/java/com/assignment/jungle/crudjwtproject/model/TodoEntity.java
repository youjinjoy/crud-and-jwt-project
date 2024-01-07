package com.assignment.jungle.crudjwtproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Todo")
public class TodoEntity {
    @Id // id를 기본 키로 쓸 것이므로 id 필드 위에 @Id를 추가해야 한다.
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;      // 시스템 아이디
    private String userId;  // 유저 아이디
    private String nickname; // 닉네임
    private String title;   // 글 제목
    private String content; // 글 내용
    private boolean done;   // TODO checked
    // private 작성 시간
}

