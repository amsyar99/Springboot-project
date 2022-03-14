package com.springboot.blog.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostResponse {
    //element of post response
    private List<PostDto> content;
    private int  pageNo;
    private int pageSize;
    private long totalElement;
    private int totalPages;
    private boolean last;
}
