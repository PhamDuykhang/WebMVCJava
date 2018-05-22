package com.cnttctu.mywebmvc.cotroller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnttctu.mywebmvc.DAO.employeeDAO;
import com.cnttctu.mywebmvc.Entity.employee;

/**
 * Servlet implementation class Addcontroller
 */
@WebServlet(name = "Add", urlPatterns = { "/Add" })
public class Addcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher=  request.getServletContext().getRequestDispatcher("/View/add.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		employee emp= new employee();
		request.setCharacterEncoding("UTF-8");
		String name= request.getParameter("name");
		String birth= request.getParameter("ngaysinh");
		String job= request.getParameter("job");
		emp.setName(name);
		emp.setBirth(birth);;
		emp.setJob(job);
		try {
			if(employeeDAO.addEmployee(emp)) {
				response.sendRedirect("GetallEmp?err=0");
				
			}
			else {
				response.sendRedirect("GetallEmp?err=1");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
