package com.springboot.blog.payload;

import lombok.Data;

import java.util.List;
import java.util.stream.Collector;

@Data
public class CommentDto {
    private long id;
    private String name;
    private String email;
    private String body;

}
