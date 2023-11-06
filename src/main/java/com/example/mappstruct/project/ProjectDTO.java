package com.example.mappstruct.project;

import com.example.mappstruct.projectcolumn.ProjectColumn;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class ProjectDTO {
    private String id;
    private String name;
    private String documentPath;
    private List<ProjectColumn> projectColumns;
    private LocalDateTime createdAt;
}
