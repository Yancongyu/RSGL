package Dao;

import bean.UserType;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/1.
 */
public interface UserTypeDao {
    public List<UserType> selectUserType(Connection con) throws SQLException;
}
