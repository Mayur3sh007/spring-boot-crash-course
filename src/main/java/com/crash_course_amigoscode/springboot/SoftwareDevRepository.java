package com.crash_course_amigoscode.springboot;

import org.springframework.data.jpa.repository.JpaRepository;

//                                                           T,data type for key i.e ours was Integer
public interface SoftwareDevRepository extends JpaRepository<SoftwareDevEntity,Integer> {
}
