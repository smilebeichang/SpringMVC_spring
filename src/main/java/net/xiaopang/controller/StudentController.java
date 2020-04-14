package net.xiaopang.controller;


import net.xiaopang.dto.Student;
import net.xiaopang.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description: 学生控制层
 * @author: Mr.songbeichang
 * @create: 2020-04-12 23:15
 **/
@Controller
@RequestMapping("/student")
public class StudentController {
    @Resource
    private IStudentService studentService;
    @RequestMapping("/query")
    @ResponseBody
    public List<Student> query(Student student){
        List<Student> list = studentService.query(student);
        //List<Student> list = null;
        System.out.println("controller");
        return list;
    }
}


