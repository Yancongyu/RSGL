package Dao.Imp.UserTypeImp;

import Dao.UserTypeDao;
import bean.UserType;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/1.
 */
public class UserTypeDaoImp implements UserTypeDao{
    @Override
    public List<UserType> selectUserType(Connection con) throws SQLException {
        PreparedStatement pps = null;
        ResultSet rs = null;
        pps = con.prepareStatement("select * from tab_usertype");
        List<UserType> uts = new ArrayList<UserType>();
        rs = pps.executeQuery();
        while(rs.next()){
            UserType u = new UserType();
            u.setId(rs.getInt(1));
            u.setContent(rs.getString(2));
            uts.add(u);
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return uts;
    }
}
