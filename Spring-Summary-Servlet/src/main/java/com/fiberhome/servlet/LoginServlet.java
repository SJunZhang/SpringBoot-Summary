package com.fiberhome.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Description:模拟登录的Servlet，登录主要逻辑就是新建一个session
 * @author sjZhang
 * @date 2018年2月8日上午9:33:28
 */
@WebServlet("/user/access")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 2186798392910935162L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/**创建一个session**/
		HttpSession session = req.getSession(true);
		session.setAttribute("001Access", "001");
		resp.getWriter().write("LoginServlet ADD user servlet \n");
	}

}
