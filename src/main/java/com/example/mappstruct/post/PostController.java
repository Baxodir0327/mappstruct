package com.example.mappstruct.post;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    private final PostMapper postMapper;

    public PostController(PostMapper postMapper) {
        this.postMapper = postMapper;
    }


    @PostMapping
    public Post create(@RequestBody PostCreateDTO dto) {
        Post post = postMapper.fromDTO(dto);
        return post;
    }

}