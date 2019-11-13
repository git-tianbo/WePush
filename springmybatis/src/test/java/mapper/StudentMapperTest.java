package mapper;


import com.ptteng.enity.Student;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.PrintException;
import java.sql.SQLException;
import java.util.List;

public class StudentMapperTest {


    static Logger logger = Logger.getLogger(StudentMapperTest.class);
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentMapper studentMapper = (StudentMapper) applicationContext.getBean("mapperFactoryBean");

    @Test
    public void selectStudentId() throws Exception {
        Student s2 = studentMapper.selectStudentId(1);
        System.out.println(s2);
        logger.info(s2);
    }

    @Test
    public void selectStudentName() throws Exception {
        List<Student>  list = studentMapper.selectStudentName("王被");
        System.out.println(list);
        logger.info("查询的数据为："+ list);
    }

    @Test
    public void selectStudent() throws Exception {
        List<Student> list = studentMapper.selectStudent();
        System.out.println(list);
        logger.info(list);
    }

    @Test
    public void insertStudent() throws Exception {
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("王鑫");
        s2.setqq(125414);
        s2.setType("后端");
        s2.settime("8月1日");
        s2.setStunum(2525);
        studentMapper.insertStudent(s2);
        logger.info("添加的id为"+s2.getId());
    }


    @Test
    public void deleteStudentId() throws Exception {
        boolean a =studentMapper.deleteStudentId(2);
        logger.info("删除数据是否成功"+a);
    }


    @Test
    public void updateStudent() throws Exception {
        Student s2 = new Student();
        s2.setName("王搜索");
        s2.setId(21);
        boolean a = studentMapper.updateStudent(s2);
        logger.info("更改数据是否成功："+a);
    }


}