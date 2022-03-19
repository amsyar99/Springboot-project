package com.springboot.blog.service;

import com.springboot.blog.payload.CommentDto;

public interface CommentService {
    CommentDto creatComment(long postId, CommentDto commentDto);
}
