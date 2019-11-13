package mapper;

import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskOneTest {

    static Logger logger = Logger.getLogger(TaskOneTest.class);

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student?serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8", "root", "451976");

            String sql = "insert into sh (name,qq)values(?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "测试");
            preparedStatement.setInt(2, 56666);
//           当前时间戳
            long a = System.currentTimeMillis();
//            自动提交
            connection.setAutoCommit(false);
            for (int i = 1; i <= 200000000; i++) {
                if (i % 100000 != 0) {
                    preparedStatement.addBatch();
                } else {
                    logger.info(i);
                    preparedStatement.executeBatch();
                    connection.commit();
                    preparedStatement.clearBatch();
                }
            }
            long b = System.currentTimeMillis();
            logger.info("消耗时间为" + "=" + (b - a));
            preparedStatement.close();
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
