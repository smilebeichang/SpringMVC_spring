package net.xiaopang.dao;

import net.xiaopang.dto.Student;
import net.xiaopang.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 学生dao层
 * @author: Mr.songbeichang
 * @create: 2020-04-12 23:26
 **/
@Repository
public class StudentDaoImpl extends BaseService implements IStudentDao {

    @Autowired
    private JdbcTemplate jt;
    @Override
    public List<Student> query(Student student) {

        RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
        List<Student> list = jt.query("select * from students", rowMapper);
        return list;
    }
}


