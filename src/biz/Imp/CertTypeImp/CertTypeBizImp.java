package biz.Imp.CertTypeImp;

import Dao.CertTypeDao;
import Dao.Imp.CertTypeImp.*;
import bean.CertType;
import biz.CertTypeBiz;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public class CertTypeBizImp implements CertTypeBiz{
    CertTypeDao ctd = new CertTypeDaoImp();
    public List<CertType> selectCertTypeBiz() {
        Connection con = Jdbc.getConnection();
        List<CertType> list = null;
        try {
            list = ctd.selectCertTypes(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            Jdbc.Close(con);
        }
        return list;
    }
}
