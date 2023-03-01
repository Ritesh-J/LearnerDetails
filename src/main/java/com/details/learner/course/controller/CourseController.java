package com.details.learner.course.controller;

import com.details.learner.course.model.Course;
import com.details.learner.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/details/save")
    public String saveDetails(@RequestBody Course payload) {
        return courseService.saveCourseDetails(payload);
    }

    @RequestMapping("/details")
    public List<Course> findDetails() {
        return courseService.findCourseDetails();
    }
}
