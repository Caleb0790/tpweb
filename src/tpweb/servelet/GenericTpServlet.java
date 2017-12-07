package tpweb.servelet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tp.util.HttpUtil;

public abstract class GenericTpServlet extends HttpServlet{

	private static final long serialVersionUID = 3987541362297886511L;

	public abstract String process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException  ;
	
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append(process(request,response));
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpUtil.logParameters(request);
		response.getWriter().append(process(request,response));
	}
}
