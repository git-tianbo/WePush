import Impl.StudentDaoImpl;
import enity.Student;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.Assert.*;

public class StudentDaoTest {

    StudentDaoImpl sd = new StudentDaoImpl();
    Student s1 = new Student();

    //获取配置文件xml的
    ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    //读取applicationcontext.xml中   id为jdbctemplate的bean文件
    JdbcTemplate jdbcTemplate = (JdbcTemplate) app.getBean("jdbcTemplate");

    @Test
    public void add() {
        s1.setName("王一");
        s1.setqq(111);
        s1.setType("前端");
        s1.settime("1月1日");
        s1.setStunum(1111);
        s1.setdaily("11/daily");
        s1.setWish("胖1斤");
        s1.setsenior("王一一");
        sd.add();
    }

    @Test
    public void addmore() {

        s1.setName("王二");
        s1.setqq(222);
        s1.setType("前端");
        s1.settime("2月2日");
        s1.setStunum(2222);
        s1.setdaily("2/daily");
        s1.setWish("胖2斤");
        s1.setsenior("王二二");
        Student s2 =new Student();
        s2.setName("王二");
        s2.setqq(222);
        s2.setType("前端");
        s2.settime("2月2日");
        s2.setStunum(2222);
        s2.setdaily("2/daily");
        s2.setWish("胖2斤");
        s2.setsenior("王二二");
        sd.addmore();
    }

    @Test
    public void delete() {
        s1.setId(1);
        sd.delete();
    }
    @Test
    public void selectId() {
        s1.setId(3);
        sd.selectId();
    }

    @Test
    public void selectAll() {
        sd.selectAll();
    }

    @Test
    public void update() {
        s1.setType("后端");
        s1.setId(4);
        sd.update();
    }
}