package com.lixiangyan.dao;

import com.lixiangyan.entity.Student;

import java.util.List;

public interface StudentMapper {

    /**
    *@Description: 动态条件查询学生
    *@Param: * @param null
    *@return:
    */
    List<Student> selectStudentDynamic(Student student);

    int deleteByPrimaryKey(Integer id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}
