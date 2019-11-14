package Util;

import com.mysql.cj.x.protobuf.MysqlxExpect;

import java.sql.*;
//定义一个 只加载驱动 且连接数据库的工具类
public class StudentUtil {

    //定义4个静态成员变量
    public static final String url = "jdbc:mysql://localhost:3306/student?serverTimezone=UTC";
    public static final String user = "root";
    public static final String Password = "451976";
    private static Connection conn = null;

    //创建一个静态方法  返回conn结果   方便其他类调用 连接数据库
    public static Connection getConnection() {
        try {
            //注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            //连接数据库
            conn = DriverManager.getConnection(url, user, Password);
            //抛出加载驱动错误
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            //抛出数据库连接错误
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    //创建一个静态方法  用来关闭链接，  方便其他类调用 关闭数据库连接
    // （静态方法使用类名.方法名即可调用     StudentUtil.closest)
    public static void closest3(Connection conn, PreparedStatement ps, ResultSet rs) {
    try {
        if (rs != null) {
            rs.close();
        }
        if (ps != null) {
            ps.close();
        }
        if (conn != null) {
            conn.close();
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

    public static void closest2(Connection conn, PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}




