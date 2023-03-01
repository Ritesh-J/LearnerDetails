package com.details.learner.course.repository;

import com.details.learner.course.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
    public Course save(Course course);
    public List<Course> findAll();




}
