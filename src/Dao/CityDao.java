package Dao;

import bean.City;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/3.
 */
public interface CityDao {
    public List<City> selectCitys(Connection con, String pid) throws SQLException;
}
