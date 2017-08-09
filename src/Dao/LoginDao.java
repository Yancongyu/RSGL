package Dao;

import bean.User;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/20.
 */
public interface LoginDao {
    //查询判断select
    public boolean checkLogin(User u,Connection con) throws Exception;
    public User currentUser(String name,Connection con)throws SQLException;

    //查询数据库中一共有多少普通用户
    public int getUsersNum(Connection con) throws SQLException;
    //分页查询用户的信息
    public List<User> pageUsers(int start,int end,Connection con) throws Exception;

}
