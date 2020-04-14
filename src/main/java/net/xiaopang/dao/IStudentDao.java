package net.xiaopang.dao;

import net.xiaopang.dto.Student;

import java.util.List;

public interface IStudentDao {
    List<Student> query(Student student);
}
