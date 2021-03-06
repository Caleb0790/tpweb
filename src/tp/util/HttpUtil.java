package tp.util;

import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;


public class HttpUtil {

	public static void logParameters(HttpServletRequest req) {
		
		//System.out.println(req.getParameter("idProduit")+": "+req.getParameterValues(req.getParameter("idProduit")));
		
		Map<String,String[]> parameters=req.getParameterMap();
		
		for (Entry<String, String[]> parameter : parameters.entrySet()) {
			System.out.println(parameter.getKey() +": "+toString(parameter.getValue()));
		}
	}

	private static String toString(String[] value) {
		StringBuffer result= new StringBuffer();
		result.append(" [ ");
		String comma="";
		for (String string : value) {
			result.append(comma);
			result.append(string);
			comma=", ";
		}
		result.append(" ]");
		
		return result.toString();
	}
}
