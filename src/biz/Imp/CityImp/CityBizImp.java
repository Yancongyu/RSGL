package biz.Imp.CityImp;

import Dao.CityDao;
import Dao.Imp.CityImp.CityDaoImp;
import bean.City;
import biz.CityBiz;
import jdbc.Jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public class CityBizImp implements CityBiz{
    CityDao cd = new CityDaoImp();
    public List<City> selectCityBiz(String pid) {
        Connection con = Jdbc.getConnection();
        List<City> list = null;
        try {
            list = cd.selectCitys(con,pid);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            Jdbc.Close(con);
        }
        return list;
    }
}
