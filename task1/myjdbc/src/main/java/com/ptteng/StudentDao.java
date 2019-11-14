package com.ptteng;

import java.sql.SQLException;

public interface StudentDao {

    public void add()throws SQLException;
    public void delete()throws SQLException;
    public void selectId()throws SQLException;
    public void update()throws SQLException;

}
