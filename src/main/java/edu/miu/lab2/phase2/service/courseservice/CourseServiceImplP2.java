package edu.miu.lab2.phase2.service.courseservice;

import edu.miu.lab2.phase2.entity.Course;
import edu.miu.lab2.phase2.repo.CourseRepoP2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CourseServiceImplP2 implements CourseService {

    private final CourseRepoP2 courseRepo;

    @Override
    public List<Course> getCourse() {
        return courseRepo.findCourse();
    }

    @Override
    public void createCourse(Course course) {
        courseRepo.createCourse(course);
    }

    @Override
    public void deleteCourse(int id) {
        courseRepo.deleteCourse(id);
    }

    @Override
    public void updateCourse(Course c, int id) {
        courseRepo.updateCourse(c,id);
    }
}
