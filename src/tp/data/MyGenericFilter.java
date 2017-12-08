package tp.data;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "MyFilter", urlPatterns = {"/*"})
public class MyGenericFilter implements javax.servlet.Filter {

public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
throws java.io.IOException, javax.servlet.ServletException {
	
	if(((HttpServletRequest)request).getSession().getAttribute("USER")==null & ((HttpServletRequest)request).getRequestURI().contains("/private/")) {
		((HttpServletResponse)response).sendRedirect("../public/login.jsp");
	}else {
		chain.doFilter(request,response);
	}
}
public void init(final FilterConfig filterConfig) { }
public void destroy() { }
}