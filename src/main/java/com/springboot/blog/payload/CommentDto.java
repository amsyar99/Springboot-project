package com.springboot.blog.payload;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;
import java.util.stream.Collector;

@Data
public class CommentDto {
    private long id;
    @NotEmpty(message = "Name should not be empty")
    private String name;

    @NotEmpty(message = "Email should not be empty")
    @Email
    private String email;
    @NotEmpty
    @Size(min = 10, message = "Comment body should not less than 10 character")
    private String body;

}
