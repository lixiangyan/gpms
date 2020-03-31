package com.lixiangyan.controller;/*
 *@program: gpms
 *@description: StudentController
 *@author: lixiangyan
 *@create: 2020-03-30 20:57
 **/

import com.lixiangyan.entity.Student;
import com.lixiangyan.service.impl.StudentServiceImpl;
import com.lixiangyan.util.Rejson;
import com.lixiangyan.util.ValidatorMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentService;

    private Rejson rejson;

    //数据校验结果集
    Map validator_msg;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Rejson userRegister(@Valid Student student, BindingResult result) {
        rejson = new Rejson();
        validator_msg = new ValidatorMsg().validator(result);
        if (null == validator_msg) {
            rejson = studentService.studentRegister(student);
            rejson.setMap(validator_msg);
        } else {
            rejson.setMap(validator_msg);
            System.out.println("注册失败" + rejson.toString());
        }
        System.out.println("注册成功" + rejson.toString());
        return rejson;
    }
}
