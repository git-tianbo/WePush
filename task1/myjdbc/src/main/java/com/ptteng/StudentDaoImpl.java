package com.ptteng;

import Util.StudentUtil;
import enity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDaoImpl implements StudentDao {


    Student s= new Student();

    public void add() throws SQLException {

        //设置一个conn变量    等于StudentUtil的结果conn        (静态方法，          可以通过类名.静态方法名  直接调用
        Connection conn = StudentUtil.getConnection();

        //sql语句
        String sql = "insert into bj (name,qq,type,time,stunum,daily,wish,senior) values(?,?,?,?,?,?,?,?)";

        //使用preparedStatement读取sql语句     （预编译，减少sql执行
        PreparedStatement ps = conn.prepareStatement(sql);

        //preparedStatement调用自身set方法   向sql传入参数
        // s.getxx 为调用实体类student中的get方法

        ps.setString(1, s.getname());
        ps.setInt(2, s.getqq());
        ps.setString(3, s.getType());
        ps.setString(4, s.getTime());
        ps.setInt(5, s.getstunum());
        ps.setString(6, s.getdaily());
        ps.setString(7, s.getWish());
        ps.setString(8, s.getSenior());

        //执行语句
        ps.execute();
        StudentUtil.closest2(conn, ps);

    }

    public void delete() throws SQLException {

        Connection conn = StudentUtil.getConnection();

        String sql = "delete from bj where id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, s.getid());

        ps.execute();

        StudentUtil.closest2(conn, ps);

    }
    public void selectId() throws SQLException {

        Connection conn = StudentUtil.getConnection();

        String sql = "select * from bj where id = ?";

        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setInt(1, s.getid());

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            System.out.print(rs.getInt("id"));
            System.out.print(rs.getString("name"));
            System.out.println(rs.getInt("qq"));
            System.out.println(rs.getString("type"));
            System.out.println(rs.getString("time"));
            System.out.println(rs.getInt("stunum"));
            System.out.println(rs.getString("daily"));
            System.out.println(rs.getString("wish"));
            System.out.println(rs.getString("senior"));

            StudentUtil.closest3(conn, ps,rs);
        }
    }


    public void update()throws SQLException{
        //获取连接
        Connection conn= StudentUtil.getConnection();
        //sql语句
        String sql ="update bj  set name= ? where id=?";
        //执行并查询语句
        PreparedStatement ps = conn.prepareStatement(sql);

        ps.setString(1,s.getname());
        ps.setInt(2,s.getid());

        ps.executeUpdate();

        StudentUtil.closest2(conn, ps);
    }
}
















