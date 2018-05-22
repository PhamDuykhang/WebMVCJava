package com.cnttctu.mywebmvc.cotroller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cnttctu.mywebmvc.DAO.employeeDAO;
import com.cnttctu.mywebmvc.Entity.employee;

/**
 * Servlet implementation class EditController
 */
@WebServlet(name = "Edit", urlPatterns = { "/Edit" })
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id= request.getParameter("id");
		employee nhanvien= employeeDAO.getEmployeeByID(Integer.parseInt(id));
		request.setAttribute("nhanvien", nhanvien);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/View/editform.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String id=request.getParameter("id");
		String name= request.getParameter("name");
		String birth = request.getParameter("ngaysinh");
		String job = request.getParameter("job");
		employee ee= new employee(Integer.parseInt(id), name, birth, job);
		try {
			if(employeeDAO.editEmployee(ee)) {
				request.setAttribute("kq",true);
				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/View/editform.jsp");
				dispatcher.forward(request, response);	
				
			}
			else {
				request.setAttribute("kq",false);
				RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/View/editform.jsp");
				dispatcher.forward(request, response);	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
