package service;

import java.util.List;
import mapper.StudentMapper;
import model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements StudentMapper {

    @Autowired
    StudentMapper studentmapper;

    @Override
    public Student selectStudentId(long id){
        return studentmapper.selectStudentId(id);
    }

    @Override
    public Student selectStudentName(String name){
       return  studentmapper.selectStudentName(name);
    }

    @Override
    public List<Student> selectStudent(){
        return  studentmapper.selectStudent();
    }

    @Override
    public int insertStudent(Student student){
        return studentmapper.insertStudent(student);
    }

    @Override
    public boolean deleteStudentId(long id){
        return studentmapper.deleteStudentId(id);
    }

    @Override
    public boolean  updateStudent(Student student){
        return studentmapper.updateStudent(student);
    }

    @Override
    public  List<Student> studentPage(@Param("startNum") int first , @Param("pageSize") int second){
    return studentmapper.studentPage(first,second);
        }

    @Override
    public int selectCount() {
        return studentmapper.selectCount();
    }

}
