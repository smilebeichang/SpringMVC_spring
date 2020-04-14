package net.xiaopang.service;

import net.xiaopang.dto.Student;

import java.util.List;

public interface IStudentService {
    List<Student> query(Student student);
}
