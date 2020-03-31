package com.lixiangyan.service.impl;/*
 *@program: gpms
 *@description: StudentServiceImpl
 *@author: lixiangyan
 *@create: 2020-03-30 21:04
 **/

import com.lixiangyan.dao.StudentMapper;
import com.lixiangyan.entity.Student;
import com.lixiangyan.exception.RegistException;
import com.lixiangyan.service.StudentService;
import com.lixiangyan.util.Rejson;
import com.lixiangyan.util.ValidatorMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    /**
    *@Description: 学生注册
    *@Param:
    *@return:
    */
    @Override
    public Rejson studentRegister(Student student) {
        Rejson rejson = new Rejson();
        System.out.println("注册数据为" + student.toString());
        try {
            if (studentMapper.selectStudentDynamic(student).size() > 0) {
                throw new RegistException("该学号已被注册");
            }
            if (null == student.getsDate() || "".equals(student.getsDate())) {
                student.setsDate(new Date());
            }
            int i = studentMapper.insert(student);
            rejson = new ValidatorMsg().cudVerification(i, "注册成功，即将跳转到登录", "注册失败");
        } catch (RegistException e) {
            e.printStackTrace();
            rejson.setBool(false);
            rejson.setList(null);
            rejson.setStatus(500);
            rejson.setMessage(e.getMessage());
        }
        return rejson;
    }
}
