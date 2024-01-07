package com.assignment.jungle.crudjwtproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDTO<T> {
    // 제너릭 사용한 이유: TodoDTO뿐만 아니라 다른 모델 DTO도 ResponseDTO를 이용해 리턴할 수 있도록
    private String error;
    private List<T> data;
}
