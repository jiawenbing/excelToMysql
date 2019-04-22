package utils;

import java.sql.*;

/**
 * @Author: 贾文兵
 * @Date:
 * @Description:
 * @Version:
 */

public class JavaConnectionMysql {
    private static final String DBDRIVER = "com.mysql.jdbc.Driver";
    private static final String DBURL = "jdbc:mysql://localhost:3306/grade_2016";
    private static final String DBUSER = "root";
    private static final String DBPASS = "jia123456";

    static Connection conn = null;

    public static Connection getConn() {
        try{
            Class.forName(DBDRIVER);
            conn = DriverManager.getConnection(DBURL, DBUSER, DBPASS);
        }catch (Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}
