package Dao.Imp.CertTypeImp;

import Dao.CertTypeDao;
import bean.CertType;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class CertTypeDaoImp implements CertTypeDao{

    public List<CertType> selectCertTypes(Connection con) throws SQLException {
        PreparedStatement pps = null;
        ResultSet rs = null;
        pps = con.prepareStatement("select * from tab_certtype");
        List<CertType> cts = new ArrayList<CertType>();
        rs = pps.executeQuery();
        while (rs.next()){
            CertType c = new CertType();
            c.setId(rs.getInt(1));
            c.setContent(rs.getString(2));
            cts.add(c);
        }
        Jdbc.Close(rs);
        Jdbc.Close(pps);
        return cts;
    }
}
