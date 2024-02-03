package com.phenol.blogapp.service;

import com.phenol.blogapp.payload.CommentDto;
import com.phenol.blogapp.payload.PostDto;
import com.phenol.blogapp.payload.PostResponse;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CommentService {
    void deleteComment(Long postId, Long commentId);

    CommentDto createComment(long postId, CommentDto commentDto);

    List<CommentDto> getCommentsByPost(long postId);

    CommentDto getCommentById(Long postId, Long commentId);

    CommentDto updateComment(Long postId, Long commentId, CommentDto commentDto);
}
