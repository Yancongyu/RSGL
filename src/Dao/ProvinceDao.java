package Dao;

import bean.Province;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/8/2.
 */
public interface ProvinceDao {
    public List<Province> selectProvinces(Connection con) throws SQLException;
}
