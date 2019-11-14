package mapper;

import com.ptteng.enity.Student;
import java.util.List;


public interface StudentMapper {

    public Student selectStudentId(Integer id);

    public List<Student> selectStudentName(String name);

    public List<Student> selectStudent();

    public Integer insertStudent(Student student);

    public boolean deleteStudentId(int id);

    public boolean updateStudent(Student student);

}
