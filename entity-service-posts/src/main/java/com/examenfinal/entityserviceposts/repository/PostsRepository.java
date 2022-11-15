package com.examenfinal.entityserviceposts.repository;

import com.examenfinal.entityserviceposts.entity.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, String> {
}
