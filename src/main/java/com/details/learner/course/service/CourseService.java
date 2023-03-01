package com.details.learner.course.service;

import com.details.learner.course.model.Course;
import com.details.learner.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    //Autowiring CourseRepository
    @Autowired
    private CourseRepository courseRepository;

    public String saveCourseDetails(Course course) {
        Course save=courseRepository.save(course);
        return "Course Created"+save;
    }

    public List<Course> findCourseDetails() {
        return courseRepository.findAll();
    }

    public Optional<Course> findCourseById(Integer id) {
        return courseRepository.findById(id);
    }

    public String deleteCourseById(Integer id) {
        courseRepository.deleteById(id);
        return "Deleted";
    }

    public long countDetails() {
        return courseRepository.count();
    }

    public boolean existsDetails(Integer id) {
        return courseRepository.existsById(id);
    }
    public String deleteAllDetails() {
        courseRepository.deleteAll();
        return "Deleted All";
    }


}
