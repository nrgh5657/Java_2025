package com.magic.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.magic.dao.EmployeesDAO;
import com.magic.dto.EmployeesVO;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = "login.jsp";
        HttpSession session = request.getSession();
        if (session.getAttribute("loginUser") != null) {
            EmployeesVO eVo = (EmployeesVO) session.getAttribute("loginUser");
            EmployeesDAO eDao = EmployeesDAO.getInstance();
            eVo = eDao.getEmployees(eVo.getUserid());

            session.setAttribute("loginUser", eVo);
            url = "main.jsp";
        }
        request.getRequestDispatcher(url).forward(request, response);
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String userid = request.getParameter("userid");
	String pass = request.getParameter("pass");
	String lev = request.getParameter("lev");
	String url = "login.jsp";
	
	EmployeesDAO eDao = EmployeesDAO.getInstance();
	int result = eDao.userCheck(userid, pass, lev);
	if(result==2|| result ==3) {
		EmployeesVO eVo = eDao.getEmployees(userid);
		HttpSession session =request.getSession();
		session.setAttribute("loginUser", eVo);
		request.setAttribute("message", "로그인에 성공했습니다");
		url ="main.jsp";
	}else if (result ==1){
		request.setAttribute("message", "권한이 일치하지 않습니다");
	}else if (result ==0) {
		request.setAttribute("message", "비밀번호가 일치하지 않습니다");
	}else if (result ==-1) {
		request.setAttribute("message", "존재하지 않는 id입니다");
	}
	request.getRequestDispatcher(url).forward(request, response);
	}
	

}
