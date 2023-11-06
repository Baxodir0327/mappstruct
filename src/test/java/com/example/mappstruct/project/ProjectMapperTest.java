package com.example.mappstruct.project;

import com.example.mappstruct.projectcolumn.ProjectColumn;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.List;

import static com.example.mappstruct.project.ProjectMapper.PROJECT_MAPPER;

class ProjectMapperTest {

    @Test
    void toDto() {
        Project project = new Project("1", "New Java Backend", Path.of("test/file.txt"),null,null);
        ProjectDTO dto = PROJECT_MAPPER.toDto(project);
        System.out.println("dto = " + dto);
    }

    @Test
    void toDtoWithProjecTcolumn() {
        List<ProjectColumn> projectColumns = List.of(
                new ProjectColumn("1", "Todo", 1, LocalDateTime.now()),
                new ProjectColumn("2", "Doing", 2, LocalDateTime.now()),
                new ProjectColumn("3", "Done", 3, LocalDateTime.now()),
                new ProjectColumn("4", "QA", 4, LocalDateTime.now())
        );
        Project project = new Project("1", "New Java Backend", Path.of("test/file.txt"),
                projectColumns,
                LocalDateTime.now());
        ProjectDTO dto = PROJECT_MAPPER.toDto(project);
        System.out.println("dto = " + dto);
    }
}