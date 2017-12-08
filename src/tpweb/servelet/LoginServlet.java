package tpweb.servelet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.data.UserBean;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/public/login")
public class LoginServlet extends GenericTpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	@Override
	public void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String login= request.getParameter("login");
		String password= request.getParameter("pwd");
		if(("pwd").equals(password))	{
				request.getSession().setAttribute("USER", new UserBean(login, new Date()));
				response.sendRedirect("../private/home.jsp");
		}else {
			request.getSession().setAttribute("ERROR", "Erreur de connexion");
			response.sendRedirect("../public/login.jsp");
		}
		
		
	}

}
