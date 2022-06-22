package edu.miu.lab2.phase1.repo;

import edu.miu.lab2.phase1.entity.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CourseRepo {
    List<Course> courses=new ArrayList<>();

    public List<Course> findCourse(){
        return courses;
    }
    public void createCourse(Course c){
        courses.add(c);
    }

    public void deleteCourse(int id){
        courses.removeIf(course -> course.getId() == id);
    }

    public void updateCourse(Course course, int id){
        courses.set(id,course);
    }



}
