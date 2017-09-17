package com.dede.first;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.dede.first.User;


/**
 * Servlet implementation class ServletNC
 */
public class ServletNC extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNC() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SessionFactory factory = new Configuration()
			    .configure("/com/dede/first/hibernate.cfg.xml").buildSessionFactory();
		
		Session session = factory.openSession();
		session.beginTransaction();
		User u = new User(request.getParameter("username"), request.getParameter("nome"), request.getParameter("cognome"), request.getParameter("email"), request.getParameter("pwd"));
		session.save(u);
		session.getTransaction().commit();
		session.close();
		
		u.setUsername("username cambiato");
		request.setAttribute("user", u);	// inseriamo l'oggetto User nella richiesta..
		
		RequestDispatcher view = request.getRequestDispatcher("recData.jsp");
		view.forward(request, response);
	}

}
