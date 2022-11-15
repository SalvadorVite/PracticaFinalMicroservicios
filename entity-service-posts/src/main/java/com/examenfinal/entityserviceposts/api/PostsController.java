package com.examenfinal.entityserviceposts.api;

import com.examenfinal.entityserviceposts.entity.Posts;
import com.examenfinal.entityserviceposts.modelo.PostsDto;
import com.examenfinal.entityserviceposts.modelo.TemplateResponse;
import com.examenfinal.entityserviceposts.service.PostServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/posts/v1")
public class PostsController {
    @Autowired
    private PostServiceImpl postService;

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public TemplateResponse guardarPosts(@RequestBody PostsDto postsDto) {
        Posts posts = postService.guardarPost(postsDto);
        TemplateResponse templateResponse = new TemplateResponse("Post guardado.", "201", posts);
        return templateResponse;
    }

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Posts> obtenerPosts() {
        return postService.posts();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Posts obtenerPost(@PathVariable("id") String id) {
        return postService.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public TemplateResponse modificarPost(@PathVariable("id") String id, @RequestBody PostsDto postsDto) {
        Posts posts = postService.modificarPost(id, postsDto);
        TemplateResponse templateResponse = new TemplateResponse("Post actualizado.", "201", posts);
        return templateResponse;
    }
}
