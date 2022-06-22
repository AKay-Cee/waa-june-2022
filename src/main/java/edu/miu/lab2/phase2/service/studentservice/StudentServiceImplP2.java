package edu.miu.lab2.phase2.service.studentservice;

import edu.miu.lab2.phase2.entity.Student;
import edu.miu.lab2.phase2.repo.StudentRepoP2;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class StudentServiceImplP2 implements StudentService {

    private final StudentRepoP2 studentrepo;
    @Override
    public List<Student> getStudent() {
        return studentrepo.findAll();
    }

    @Override
    public void deleteStudent( int id) {
        studentrepo.deleteStudent(id);
    }

    @Override
    public void createStudent(Student student) {
    studentrepo.createStudent(student);
    }

    @Override
    public void updateStudent(Student s, int id) {
        studentrepo.updateStudent(s,id);
    }

}
