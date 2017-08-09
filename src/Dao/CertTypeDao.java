package Dao;

import bean.CertType;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Administrator on 2017/7/31.
 */
public interface CertTypeDao {
    public List<CertType> selectCertTypes(Connection con) throws SQLException;
}
