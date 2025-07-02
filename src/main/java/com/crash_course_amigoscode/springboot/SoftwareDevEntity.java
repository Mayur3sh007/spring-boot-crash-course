package com.crash_course_amigoscode.springboot;

import java.util.Objects;

public class SoftwareDevEntity {

    private Integer Id;
    private String name;
    private String techStack;

    public SoftwareDevEntity(Integer id, String name, String techStack) {
        Id = id;
        this.name = name;
        this.techStack = techStack;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTechStack() {
        return techStack;
    }

    public void setTechStack(String techStack) {
        this.techStack = techStack;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SoftwareDevEntity that = (SoftwareDevEntity) o;
        return Objects.equals(Id, that.Id) && Objects.equals(name, that.name) && Objects.equals(techStack, that.techStack);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, name, techStack);
    }
}
