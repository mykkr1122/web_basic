package web_basic;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class UseForwardServlet2 extends HttpServlet{
	
	public void doGet(HttpServletRequest request, HttpServletResponse response)

		    throws ServletException, IOException {	  
		RequestDispatcher dispatcher = request.getRequestDispatcher("/UseForward.jsp");
    	
    	dispatcher.forward(request, response);
    	System.out.println("サーブレットの終了");
	}
}
