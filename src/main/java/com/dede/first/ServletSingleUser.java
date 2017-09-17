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
 * Servlet implementation class ServletSingleUser
 */
public class ServletSingleUser extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletSingleUser() {
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
		List<User> user = session.createQuery("FROM User u WHERE username='"+request.getParameter("usernameSearched")+"'").list();
			
		request.setAttribute("us", user);
		
		RequestDispatcher view = request.getRequestDispatcher("userSearched.jsp");
		view.forward(request, response);
	}


}
