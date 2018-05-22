package com.cnttctu.mywebmvc.cotroller;

import java.io.IOException;
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
 * Servlet implementation class GetallEmp
 */
@WebServlet("/GetallEmp")
public class GetallEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetallEmp() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<employee> ds = employeeDAO.getAllEmployee();
		request.setAttribute("DS", ds);
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/View/DanhSachNhanVien.jsp");
		
		if(request.getParameter("err")!=null) {
			String kq= request.getParameter("err");
			request.setAttribute("kq", kq);
		}
		if(request.getParameter("err1")!=null) {
			String kq1= request.getParameter("err1");
			request.setAttribute("kq1", kq1);
		}
		
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
