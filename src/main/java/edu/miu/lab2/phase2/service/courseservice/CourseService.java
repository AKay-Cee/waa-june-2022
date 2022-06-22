package edu.miu.lab2.phase2.service.courseservice;

import edu.miu.lab2.phase2.entity.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourse();

    public void createCourse(Course course);

    public void deleteCourse(int id);

    public void updateCourse(Course c, int id);
}
