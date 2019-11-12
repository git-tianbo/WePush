package com.ptteng;


import enity.Student;
import org.junit.Test;


public class StudentDaoImplTest {
    Student s = new Student();
    StudentDaoImpl studentdaoimpl = new StudentDaoImpl();

@Test
public void testAdd() throws Exception {

    s.setname("我");
    s.setqq(555555);
    s.setTime("7月7日");
    s.setType("工程师");
    s.setwish("学习");
    s.setDaily("55/dd");
    s.setSenior("裘千尺");
    s.setStunum(54754);

    studentdaoimpl.add();
} 

@Test
public void testDelete() throws Exception {
    s.setId(10);
    studentdaoimpl.delete();
} 

@Test
public void testSelectId() throws Exception {
    s.setId(5);
    studentdaoimpl.selectId();
} 

@Test
public void testUpdate() throws Exception {
    s.setId(3);
    s.setname("改了改了");
    studentdaoimpl.update();
}
} 
