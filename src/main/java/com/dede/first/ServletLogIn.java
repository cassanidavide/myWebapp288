package com.dede.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.dede.first.User;
import java.util.List;


/**
 * Servlet implementation class ServletLogIn
 */
public class ServletLogIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletLogIn() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
     
     String un = request.getParameter("uname");
     String p = request.getParameter("pswrd");
     HttpSession httpSession = request.getSession();
     SessionFactory factory = new Configuration().configure("/com/dede/first/hibernate.cfg.xml").buildSessionFactory();
     Session session = factory.openSession();
     List<User> records = session.createQuery("FROM User u WHERE username='"+un+"' and pwd='"+p+"'").list();
     if(!(records.isEmpty())){
      request.setAttribute("loginstatus", "Login Successful.");
      httpSession.setAttribute("username", un);
      getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
     }else{
      request.setAttribute("loginstatus", "Username/Password do not match.");
      getServletContext().getRequestDispatcher("/logIn.html").forward(request, response);
     }
    }

}
