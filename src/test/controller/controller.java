package test.controller;
import test.model.User;
import test.model.authenticate;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class controller extends HttpServlet{
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		 String country=request.getParameter("country");
		User user=new User(country);
		RequestDispatcher rd=null;
     	authenticate authenticato=new authenticate();
     	String result=authenticato.authenticator(country);
     	
     	rd=request.getRequestDispatcher("/success.jsp");
     	
     	rd.forward(request, response);
		
}
}	
	
