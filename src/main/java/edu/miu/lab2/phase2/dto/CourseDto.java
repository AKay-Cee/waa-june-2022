package edu.miu.lab2.phase2.dto;

import edu.miu.lab2.phase2.entity.Course;
import lombok.Data;

@Data
public class CourseDto {
    private int id;
    private String name;
    private String code;

    public CourseDto toDto(Course course){
        CourseDto dto=new CourseDto();
        dto.setId(course.getId());
        dto.setName(course.getName());
        dto.setCode(course.getCode());
        return dto;
    }

    public Course toEntity(){
        Course course=new Course();
        course.setId(this.id);
        course.setName(this.name);
        course.setCode(this.code);
        return course;
    }
}
