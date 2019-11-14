        package RowMapper;

        import enity.Student;
        import org.springframework.jdbc.core.RowMapper;
        import java.sql.ResultSet;
        import java.sql.SQLException;

        public class MyRowMapper implements RowMapper<Student> {


        public Student mapRow(ResultSet resultSet, int i) throws SQLException {
            //获取结果集中的数据
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int qq = resultSet.getInt("qq");
            String type = resultSet.getString("type");
            String time = resultSet.getString("time");
            int stunum = resultSet.getInt("stunum");
            String daily = resultSet.getString("daily");
            String wish = resultSet.getString("wish");
            String senior = resultSet.getString("senior");
            //把数据封装成 s 对象
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setqq(qq);
            s.setType(type);
            s.settime(time);
            s.setStunum(stunum);
            s.setdaily(daily);
            s.setWish(wish);
            s.setsenior(senior);
            return s;
        }
    }


