package com.magic.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.magic.dto.EmployeesVO;

public class EmployeesDAO {
    private static EmployeesDAO instance = new EmployeesDAO();

    private EmployeesDAO() {}

    public static EmployeesDAO getInstance() {
        return instance;
    }

    public Connection getConnection() throws Exception {
        Connection conn = null;
        String url = "jdbc:oracle:thin:@localhost:49161:xe";  // DB 연결 URL
        String uid = "system";  // DB 사용자
        String pass = "oracle"; // DB 비밀번호

        Class.forName("oracle.jdbc.driver.OracleDriver");
        return DriverManager.getConnection(url, uid, pass);
    }

   
    public int userCheck(String userid, String pass, String lev) {
        int result = -1;
        String sql = "SELECT * FROM employees WHERE userid = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        
		try {
			
			conn = getConnection();
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, userid);
			
			rs = pstmt.executeQuery();  
			
			if(rs.next()) {
				
				if(rs.getString("pass") != null && 
						rs.getString("pass").equals(pass)) {
					if(lev.equals(rs.getString("lev"))) {
						result=2;
					if(lev.equals("B")) {
						result=3;
					}
					}else {
					result = 1;
					}
				}else {
					result = 0; 
				}
			}else {
				
				result = -1;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if ( rs != null) rs.close();
				if ( pstmt != null) pstmt.close();
				if ( conn != null) conn.close();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}	

     
        return result;
    }

  
    public EmployeesVO getEmployees(String userid) {
        EmployeesVO eVo = null;
        String sql = "SELECT * FROM employees WHERE userid = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
		
        try{
			conn=getConnection();
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, userid);
			
			rs=pstmt.executeQuery();
        
        
        if(rs.next()){
			eVo = new EmployeesVO();
			eVo.setUserid(rs.getString("userid"));
			eVo.setPass(rs.getString("pass"));
			eVo.setName(rs.getString("name"));
			eVo.setLev(rs.getString("lev"));				
			eVo.setEnter(rs.getDate("enter"));
			eVo.setGender(rs.getInt("gender"));
			eVo.setPhone(rs.getString("phone"));
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(conn != null ) conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
        
        return eVo;
    }
}
