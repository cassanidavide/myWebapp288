package com.dede.first;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class ServletUsers
 */
public class ServletUsers extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletUsers() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		SessionFactory factory = new Configuration()
			    .configure("/com/dede/first/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		List<User> list = session.createQuery("SELECT u FROM User u").list();
		
		request.setAttribute("users", list);
		

		
		RequestDispatcher view = request.getRequestDispatcher("visUsers.jsp");
		view.forward(request, response);
	}

}
