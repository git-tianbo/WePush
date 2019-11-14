package Impl;

import RowMapper.MyRowMapper;
import dao.StudentDao;
import enity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    Student s1 =new Student();

    //获取配置文件xml的
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
    //读取applicationcontext.xml中      id为jdbctemplate的bean文件
    JdbcTemplate jdbcTemplate = (JdbcTemplate) app.getBean("jdbcTemplate");


    //增加单个
    @Override
    public void add() {
        String sql = "insert into bj (name,qq,type,time,stunum,daily,wish,senior) values (?,?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql, s1.getName(), s1.getqq(), s1.getType(), s1.getTime(),s1.getstunum(), s1.getdaily(), s1.getWish(), s1.getsenior());
    }
    //批量增加
    @Override
    public void addmore(){

        Student s2 = new Student();
        String sql = "insert into bj (name,qq,type,time,stunum,daily,wish,senior) values (?,?,?,?,?,?,?,?)";
        List<Object[]>  batchadd  = new ArrayList<>();
        batchadd.add(new Object[]{s1.getName(), s1.getqq(), s1.getType(), s1.getTime(),s1.getstunum(),  s1.getdaily(), s1.getWish(), s1.getsenior()});
        batchadd.add(new Object[]{s2.getName(), s2.getqq(), s2.getType(), s2.getTime(),s2.getstunum(),  s2.getdaily(), s2.getWish(), s2.getsenior()});
        jdbcTemplate.batchUpdate(sql,batchadd);
    }
    //单个删除
    @Override
    public void delete() {
        String sql = "delete from bj where id=?";
        jdbcTemplate.update(sql,s1.getId());
    }

    //根据id查询
    @Override
    public void selectId() {
            String sql = "select * from bj where id =? ";
            Student s = jdbcTemplate.queryForObject(sql, new MyRowMapper(), s1.getId());
            System.out.println(s);
        }
     //查询所有
     @Override
    public void selectAll(){
        String sql = "select * from bj";
        List<Student> list = jdbcTemplate.query(sql, new MyRowMapper());
        System.out.println(list);
    }
    //单个更改
    @Override
    public void update() {
        String  sql = "update bj set type= ? where id =?";
        jdbcTemplate.update(sql,s1.getType(),s1.getId());
    }
}

