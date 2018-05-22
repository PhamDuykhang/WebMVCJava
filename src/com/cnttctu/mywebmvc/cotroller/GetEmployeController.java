package com.cnttctu.mywebmvc.cotroller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnttctu.mywebmvc.DAO.employeeDAO;
import com.cnttctu.mywebmvc.Entity.employee;

/**
 * Servlet implementation class GetEmployeController
 */
@WebServlet("/nhanvien")
public class GetEmployeController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetEmployeController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		employee nhanvien= employeeDAO.getEmployeeByID(Integer.parseInt(id));
		request.setAttribute("nhanvien", nhanvien);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/View/nhanvienchitiet.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
