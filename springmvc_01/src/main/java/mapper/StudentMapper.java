package mapper;

import model.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentMapper {

    Student selectStudentId(long id);

    Student selectStudentName(String name);

    List<Student> selectStudent();

    int insertStudent(Student student);

    boolean deleteStudentId(long id);

    boolean  updateStudent(Student student);

    //获取我想要的得到的数据，在接口中方法如果有两个参数，每个参数前需要加@Param

//    startNum(初始页码)    （每页显示的条数）pageSize

    List<Student> studentPage(@Param("startNum") int first , @Param("pageSize") int second);

    //数据库里总共有多少条数据
    int selectCount();

}