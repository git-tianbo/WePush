package com.ptteng;


import enity.Student;
import org.junit.Test;


public class StudentDaoImplTest {
    Student s = new Student();
    StudentDaoImpl studentdaoimpl = new StudentDaoImpl();

@Test
public void testAdd() throws Exception {

    s.setname("��");
    s.setqq(555555);
    s.setTime("7��7��");
    s.setType("����ʦ");
    s.setwish("ѧϰ");
    s.setDaily("55/dd");
    s.setSenior("��ǧ��");
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
    s.setname("���˸���");
    studentdaoimpl.update();
}
} 
