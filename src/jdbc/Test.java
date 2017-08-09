package jdbc;

import java.sql.Connection;

/**
 * Created by Administrator on 2017/7/19.
 */
public class Test {
    public static void main(String[] args) {
        Connection con = Jdbc.getConnection();
        if(con != null){
            System.out.println("连接成功");
        }
        else{
            System.out.println("连接失败，嘻嘻");
        }
    }
}
