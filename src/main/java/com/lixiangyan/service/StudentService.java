package com.lixiangyan.service;
/*
 *@program: gpms
 *@description: StudentService
 *@author: lixiangyan
 *@create: 2020-03-30 21:00
 **/

import com.lixiangyan.entity.Student;
import com.lixiangyan.util.Rejson;

public interface StudentService {
    /**
    *@Description: 学生注册
    *@Param:
    *@return:
    */
    Rejson studentRegister(Student student);
}
