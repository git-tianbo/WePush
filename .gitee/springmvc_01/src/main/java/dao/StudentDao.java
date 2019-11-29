package dao;

import model.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public  interface StudentDao {

    //根据ID查询学生   返回学生实体
    Student searchById(Long id);

    //根据ID更改学生信息
    boolean updateById(String name,int id);

    //根据ID删除学生信息
    boolean deleteById(int id);

    //添加单个学生信息   返回插入学员id
    int insertStudent(Student student);

}



