package net.xiaopang.service;

import net.xiaopang.dao.IStudentDao;
import net.xiaopang.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 学生服务层
 * @author: Mr.songbeichang
 * @create: 2020-04-12 23:24
 **/

@Service
public class StudentService  implements IStudentService {
    @Resource
    private IStudentDao studentDao;
    @Override
    public List<Student> query(Student student) {
        //return null;
        return studentDao.query(student);
    }
}

