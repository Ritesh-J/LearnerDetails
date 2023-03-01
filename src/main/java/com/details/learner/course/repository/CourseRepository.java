package com.details.learner.course.repository;

import com.details.learner.course.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
    public Course save(Course course);
    public List<Course> findAll();
    public Optional<Course> findById(Integer id);
    public void deleteById(Integer id);
    public boolean existsById(Integer id);
    public long count();
    public void deleteAll();




}
