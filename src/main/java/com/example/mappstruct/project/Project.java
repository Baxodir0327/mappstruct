package com.example.mappstruct.project;

import com.example.mappstruct.projectcolumn.ProjectColumn;
import lombok.*;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

@ToString
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Builder
public class Project {
    private String id;
    private String name;
    private Path documentPath;
    private List<ProjectColumn> projectColumns;
    private LocalDateTime createdAt;
}
