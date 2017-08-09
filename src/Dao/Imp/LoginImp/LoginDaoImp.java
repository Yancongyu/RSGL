package Dao.Imp.LoginImp;

import Dao.LoginDao;
import bean.CertType;
import bean.City;
import bean.User;
import bean.UserType;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/20.
 */
public class LoginDaoImp implements LoginDao {

    public boolean checkLogin(User u, Connection con) throws Exception {
        ResultSet rs = null;
        PreparedStatement pps = null;
        boolean b = false;
        String sql = "select * from tab_user where username = ? and password = ? and rule = ?";

        pps = con.prepareStatement(sql);
        pps.setString(1,u.getUsername());
        pps.setString(2,u.getPassword());
        pps.setString(3,u.getRule());
        rs = pps.executeQuery();
        if(rs.next()){
            b = true;
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return b;
    }

    @Override
    public User currentUser(String name, Connection con) throws SQLException {
        User u = null;
        PreparedStatement pps = null;
        ResultSet rs = null;
        String sql = "select tu.username,tu.sex,tu.image_path,tc.city,ctype.content,utype.content\n" +
                "from tab_user tu,tab_city tc,tab_certtype ctype,tab_usertype utype \n" +
                "where tu.city=tc.id and tu.cert_type=ctype.id\n" +
                "and tu.user_type=utype.id and tu.username = ?";
        pps = con.prepareStatement(sql);
        pps.setString(1,name);
        rs = pps.executeQuery();
        if(rs.next()){
            u = new User();
            u.setUsername(rs.getString(1));
            u.setSex(rs.getString(2));
            u.setImagePath(rs.getString(3));

            City c = new City();

            c.setCity(rs.getString(4));
            u.setCity(c);
            CertType ct = new CertType();
            ct.setContent(rs.getString(5));
            u.setCertType(ct);
            UserType ut=new UserType();
            ut.setContent(rs.getString(6));
            u.setUserType(ut);
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return u;
    }

    @Override
    public int getUsersNum(Connection con) throws SQLException {
        PreparedStatement pps = null;
        ResultSet rs = null;
        int num = 0;
        pps = con.prepareStatement("select count(*) from tab_user where rule='2'");
        rs = pps.executeQuery();
        if(rs.next()){
            num = rs.getInt(1);
        }
        Jdbc.Close(rs);
        Jdbc.Close(rs);
        return num;
    }

    @Override
    public List<User> pageUsers(int start, int end, Connection con) throws Exception {
        PreparedStatement pps = null;
        ResultSet rs = null;
        List<User> list = new ArrayList<User>();
        pps = con.prepareStatement("SELECT * from (select rownum as rn,tab_user.* from tab_user where rule = '2') WHERE rn>=? and rn <=?");
        pps.setInt(1,start);
        pps.setInt(2,end);
        rs = pps.executeQuery();
        while(rs.next()){
            User u = new User();
            u.setId(rs.getInt(2));
            u.setUsername(rs.getString(3));
            u.setSex(rs.getString(6));
            City c = new City();
            c.setCityId(rs.getString(7));
            u.setCity(c);
            u.setImagePath(rs.getString(16));
            list.add(u);
        }

        Jdbc.Close(rs);
        Jdbc.Close(pps);

        return list;
    }

}
