package com.dede.first;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class ServletLogOut
 */
public class ServletLogOut extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogOut() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     
     HttpSession httpSession = request.getSession();
     SessionFactory factory = new Configuration().configure("/com/dede/first/hibernate.cfg.xml").buildSessionFactory();
     httpSession.setAttribute("username", null);
     getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
