package com.example.admincore;

import org.apache.catalina.security.SecurityUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Security;
import java.sql.*;

@SpringBootTest
class AdminCoreApplicationTests {

    @Test
    void contextLoads() {}

    @Test
    void testJdbc() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("connnectiong to database...");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://192.168.50.209:3306/landlord?characterEncoding=utf8&useSSL=false&rewriteBatchedStatements=true&useLegacyDatetimeCode=false&serverTimezone=Asia/Shanghai&allowMultiQueries=true",
                "root", "root0");
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("select id,name from cmf_tenant_open");
        while(rs.next()){
            System.out.println(rs.getInt("id") + "name:" + rs.getString("name"));
        }
    }

}
