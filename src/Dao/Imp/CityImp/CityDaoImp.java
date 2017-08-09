package Dao.Imp.CityImp;

import Dao.CityDao;
import bean.City;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public class CityDaoImp implements CityDao{

    public List<City> selectCitys(Connection con, String pid) throws SQLException {
        PreparedStatement pps = null;
        ResultSet rs = null;
        pps = con.prepareStatement("select * from tab_city where father = ?");
        pps.setString(1,pid);
        List<City> cs = new ArrayList<City>();
        rs = pps.executeQuery();
        while (rs.next()){
            City c = new City();
            c.setId(rs.getInt(1));
            c.setCityId(rs.getString(2));
            c.setCity(rs.getString(3));
            c.setFather(rs.getString(4));
            cs.add(c);
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return cs;
    }
}
