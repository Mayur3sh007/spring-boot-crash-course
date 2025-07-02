package com.crash_course_amigoscode.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class SoftwareDevEntity {

    // This simple annotation makes the below fields into our DB columns and this is facilitated by hibernate-JPA
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;
    private String name;
    private String techStack;

//    🧠 Why JPA Needs a No-Args Constructor
//    JPA/Hibernate uses reflection to create objects.
//    When it loads data from the DB, it doesn’t know what values to pass, so it:
//    Creates an empty object with new SoftwareDevEntity()
//    Then sets the fields using reflection or setters.
    public SoftwareDevEntity() {
    }

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
