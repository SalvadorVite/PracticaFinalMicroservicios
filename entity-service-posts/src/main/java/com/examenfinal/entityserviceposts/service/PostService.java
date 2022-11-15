package com.examenfinal.entityserviceposts.service;

import com.examenfinal.entityserviceposts.entity.Posts;
import com.examenfinal.entityserviceposts.modelo.PostsDto;

import java.util.List;

public interface PostService {
    Posts obtenerPorId(String id);
    Posts guardarPost(PostsDto postsDto);
    List<Posts> posts();
    Posts modificarPost(String id, PostsDto postsDto);
    void eliminarPost(String id);
}