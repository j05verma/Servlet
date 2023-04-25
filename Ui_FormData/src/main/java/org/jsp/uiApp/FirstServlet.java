package org.jsp.uiApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("nm");
		String place=req.getParameter("pl");
		
		PrintWriter writer=resp.getWriter();
		writer.write("<html><body bgcolor='yellow'>"
				+ " <h1>User Details: "+name+" form "+place+" </h1>"
				+"</body></html>"); //PERSENTATION LOGIC
		writer.close();
		
	}
	
}
