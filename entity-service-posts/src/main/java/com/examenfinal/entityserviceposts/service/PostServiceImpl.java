package com.examenfinal.entityserviceposts.service;

import com.examenfinal.entityserviceposts.entity.Posts;
import com.examenfinal.entityserviceposts.modelo.PostsDto;
import com.examenfinal.entityserviceposts.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostsRepository postsRepository;

    @Override
    public Posts obtenerPorId(String id) {
        return postsRepository.findOne(id);
    }

    @Override
    public Posts guardarPost(PostsDto postsDto) {
        Posts posts = Posts.from(postsDto);
        return postsRepository.save(posts);
    }

    @Override
    public List<Posts> posts() {
        return postsRepository.findAll();
    }

    @Override
    public Posts modificarPost(String id, PostsDto postsDto) {
        Posts posts1 = postsRepository.findOne(id);
        posts1.setId(id);
        posts1.setTitulo(postsDto.getTitulo());
        posts1.setDescripcion(postsDto.getDescripcion());
        posts1.setStatus(postsDto.getStatus());
        posts1.setPostPublico(postsDto.getPostPublico());
        posts1.setFotoUrl(postsDto.getFotoUrl());
        posts1.setFechaActualizacion(postsDto.getFechaActualizacion());
        return postsRepository.save(posts1);
    }

    @Override
    public void eliminarPost(String id) {
        postsRepository.delete(id);
    }
}
