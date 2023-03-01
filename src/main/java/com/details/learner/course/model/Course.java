package com.details.learner.course.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int course_id;
    private String course_name;
    private String course_description;

    public Course(int course_id, String course_name, String course_description) {
        this.course_id = course_id;
        this.course_name = course_name;
        this.course_description = course_description;
    }

    public Course() {
        this.course_id=0;
        this.course_name="";
        this.course_description="";
    }

    @Override
    public String toString() {
        return "Course{" +
                "course_id=" + course_id +
                ", course_name='" + course_name + '\'' +
                ", course_description='" + course_description + '\'' +
                '}';
    }

    public int getCourse_id() {
        return course_id;
    }

    public void setCourse_id(int course_id) {
        this.course_id = course_id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_description() {
        return course_description;
    }

    public void setCourse_description(String course_description) {
        this.course_description = course_description;
    }
}
