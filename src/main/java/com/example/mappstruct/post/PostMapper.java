package com.example.mappstruct.post;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PostMapper {
    Post fromDTO(PostCreateDTO dto);
}
