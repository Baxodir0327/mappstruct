package com.example.mappstruct.post;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class PostCreateDTO {
    private String title;
    private String body;
}
