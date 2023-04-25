package org.jsp.calciApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CalciServlet extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
	double num1 =Double.parseDouble(req.getParameter("t1"));
	double num2 =Double.parseDouble(req.getParameter("t2"));
	String st=req.getParameter("opt");
	double result=0;
	if(st.equals("+"))
		result=num1 + num2;
	else if(st.equals("-"))
		result=num1 - num2;
	else if(st.equals("*"))
		result=num1 * num2;
	else
		result =num1 / num2;
	PrintWriter out=resp.getWriter();
	out.println(" Result is: "+result);
	out.close();
	}
}
