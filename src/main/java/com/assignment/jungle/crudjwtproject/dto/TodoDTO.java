package com.assignment.jungle.crudjwtproject.dto;

import com.assignment.jungle.crudjwtproject.model.TodoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TodoDTO { // 해당 클래스를 통해 글을 생성, 수정 삭제할 예정

    // userId를 안 넣은 이유: 이후 스프링 시큐리티를 이용해 인증을 구현하기 때문 (보안상)
    private String id;
    private String nickname;
    private String title;
    private String content;
    private boolean done;
    public TodoDTO(final TodoEntity entity){
        this.id = entity.getId();
        this.nickname = entity.getNickname();
        this.title = entity.getTitle();
        this.content = entity.getContent();
        this.done = entity.isDone();
    }

    public static TodoEntity toEntity(final TodoDTO dto) {
        return TodoEntity.builder()
                .id(dto.getId())
                .nickname(dto.getNickname())
                .title(dto.getTitle())
                .content(dto.getContent())
                .done(dto.isDone())
                .build();
    }
}