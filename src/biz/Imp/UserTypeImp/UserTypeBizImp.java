package biz.Imp.UserTypeImp;

import Dao.Imp.UserTypeImp.UserTypeDaoImp;
import Dao.UserTypeDao;
import bean.UserType;
import biz.UserTypeBiz;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/1.
 */
public class UserTypeBizImp implements UserTypeBiz{
    UserTypeDao utd = new UserTypeDaoImp();
    public List<UserType> selectUserTypeBiz() {
        Connection con = Jdbc.getConnection();
        List<UserType> list = null;
        try {
            list = utd.selectUserType(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return list;
    }
}
