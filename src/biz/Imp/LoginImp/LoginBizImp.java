package biz.Imp.LoginImp;

import Dao.LoginDao;
import Dao.Imp.LoginImp.LoginDaoImp;
import bean.User;
import biz.LoginBiz;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/30.
 */
public class LoginBizImp implements LoginBiz {
    LoginDao ld = new LoginDaoImp();
    public boolean checkLogin(User u){
        Connection con = Jdbc.getConnection();
        boolean b = false;
        try {
            b = ld.checkLogin(u,con);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return b;
    }

    @Override
    public User currentUser(String name) {
        Connection con=Jdbc.getConnection();
        User u=null;
        try {
            u = ld.currentUser(name, con);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            Jdbc.Close(con);
        }
        return u;
    }

    @Override
    public int userNumBiz() {
        int num = 0;
        Connection con = Jdbc.getConnection();
        try {
            num = ld.getUsersNum(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return num;
    }

    @Override
    public List<User> pageUsers(int start, int end) {
        Connection con = Jdbc.getConnection();
        List<User> list = null;

        try {
            list = ld.pageUsers(start,end,con);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return list;
    }
}
