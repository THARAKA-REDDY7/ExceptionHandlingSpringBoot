package com.example.TestSpring.model;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Builder
public class ExceptionModel {
    private String noId;
    private Long id;

}
