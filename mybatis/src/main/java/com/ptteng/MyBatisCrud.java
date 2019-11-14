package com.ptteng;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import enity.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Ignore;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatisCrud {

    //指定全局配置文件
    String resource = "mybatis-config.xml";
    //读取配置文件
    InputStream inputStream;

    //需要主动try catch抛出异常
    {
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //构建sqlsession工厂
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    //创建sqlsession
    SqlSession sqlSession = sqlSessionFactory.openSession();


    @Ignore
    public void select() {
        String statement = "mapper.MyMapper.selectStudentId";
        Student s = sqlSession.selectOne(statement, 2);
        System.out.println(s);

        sqlSession.close();
    }

    @Test
    public void addAll() {
        String statement = "mapper.MyMapper.selectStudentAll";

        List<Student> list = sqlSession.selectList(statement);
        System.out.println(list);

        sqlSession.close();
    }

    @Test
    public void insert() {
        String statement = "mapper.MyMapper.insertStudent";

        Student s = new Student();
        s.setName("周某人");
        s.setqq(5555555);
        s.setType("前端");
        s.setTime("2018年8月8日");
        s.setstunum(40000);

        int a = sqlSession.insert(statement, s);
        System.out.println(a);

        sqlSession.commit();
        sqlSession.close();
         }

    public void delete() {
        String statement = "mapper.MyMapper.deleteStudentStunum";

        int a = sqlSession.delete(statement, 8145847);
        System.out.println(a);

        sqlSession.commit();
        sqlSession.close();
    }

    public void update() {
        String statement = "mapper.MyMapper.updateStudent";

        Student s = new Student();

        s.setName("王王王");
        s.setId(3);


    }

}














