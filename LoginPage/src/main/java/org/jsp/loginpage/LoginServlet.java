package org.jsp.loginpage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class LoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long phone=Long.parseLong(req.getParameter("phone"));
		String password=req.getParameter("pswd");
		RequestDispatcher dispatcher=null;
		PrintWriter writer=resp.getWriter();
		if(phone==9430058041l && password.equals("a123"))
		{ 
			HttpSession session=req.getSession();
			session.setAttribute("user", "User2");
			dispatcher=req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, resp);
		}
		else {
			writer.write("<html><body><h2>Invalid Phone Number Or Password</h2></body></html>");
			dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.include(req, resp);
		}
	}
}
