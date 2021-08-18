package org.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.service.UserService;

@WebServlet("/user")
public class UserServlet extends HttpServlet{
	 protected void service(HttpServletRequest req, HttpServletResponse resp)
		        throws ServletException, IOException { 
		 System.out.println("UserServlet test...");
		 UserService.testService();
	 }
}
