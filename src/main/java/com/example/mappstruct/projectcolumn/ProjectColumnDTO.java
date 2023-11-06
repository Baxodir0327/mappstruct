package com.example.mappstruct.projectcolumn;

import lombok.*;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class ProjectColumnDTO {
    private String pc_name;
    private String pc_order;
    private String pc_createdAt;
}
