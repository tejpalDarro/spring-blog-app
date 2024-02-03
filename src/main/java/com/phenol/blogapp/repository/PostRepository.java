package com.phenol.blogapp.repository;

import com.phenol.blogapp.entity.Post;
import com.phenol.blogapp.payload.PostDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
