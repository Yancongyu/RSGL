package Dao.Imp.ProvinceImp;

import Dao.ProvinceDao;
import bean.Province;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
public class ProvinceDaoImp implements ProvinceDao{
    @Override
    public List<Province> selectProvinces(Connection con) throws SQLException {
        PreparedStatement pps = null;
        ResultSet rs = null;
        pps = con.prepareStatement("select * from tab_province");
        List<Province> ps = new ArrayList<Province>();
        rs = pps.executeQuery();
        while(rs.next()){
            Province p = new Province();
            p.setId(rs.getInt(1));
            p.setProvinceId(rs.getString(2));
            p.setProvince(rs.getString(3));
            ps.add(p);
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return ps;
    }
}
