package biz.Imp.ProvinceImp;

import Dao.Imp.ProvinceImp.ProvinceDaoImp;
import Dao.ProvinceDao;
import bean.Province;
import biz.ProvinceBiz;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
public class ProvinceBizImp implements ProvinceBiz{
    ProvinceDao pd = new ProvinceDaoImp();
    public List<Province> selectProvinceBiz() {
        Connection con = Jdbc.getConnection();
        List<Province> list = null;
        try {
            list = pd.selectProvinces(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return list;
    }
}
