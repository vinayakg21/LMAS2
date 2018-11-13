package com.cg.lams.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LAMSController
 */
@WebServlet("/LAMSController")
public class LAMSController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LAMSController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		RequestDispatcher view = null;
		
		System.out.println(action);
		
		if (action != null && action.equalsIgnoreCase("OpenCustomerHome")) {
			
				view = request.getRequestDispatcher("CustomerHome.jsp");
				view.forward(request, response);
			
		}
		
		if (action != null && action.equalsIgnoreCase("OpenLADLogin")) {
			
			view = request.getRequestDispatcher("LADLogin.jsp");
			view.forward(request, response);
		
		}
		
		if (action != null && action.equalsIgnoreCase("OpenAdminLogin")) {
			
			view = request.getRequestDispatcher("AdminLogin.jsp");
			view.forward(request, response);
		
		}
	}

}
