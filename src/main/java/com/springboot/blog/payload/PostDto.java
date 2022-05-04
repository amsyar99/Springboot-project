package com.springboot.blog.payload;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Set;

@Data
public class PostDto {
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Title should not less than 2 character")
    private String title;
    @NotEmpty
    @Size(min = 2, message = "Title should not less than 2 character")
    private String description;
    @NotEmpty
    @Size(min = 2, message = "Title should not less than 2 character")
    private String content;
    @NotEmpty
    @Size(min = 2, message = "Title should not less than 2 character")
    private Set<CommentDto> comments;
}
