package com.unbosque.edu.co;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clase_servlet_83
 */
@WebServlet("/clase_servlet_83")
public class Clase_Servlet_83 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Clase_Servlet_83() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String clave = request.getParameter("clave");
		if (nombre != "" && clave !="") {
			out.println("Bienvenido: " + nombre + " a mi JSP");
		}else {
			out.println("Error: falta Nombre o Clave");
		}
		
		try {
			out.println("<html>");
			out.println("<head> <tittle> Bienvenidos Servlet1 </title> </head>");
			out.println("<body>");
			out.println("<h1> Conexion desde un JSP </h1>");
			out.println("</body>");
			out.println("</html>");
			
		}finally {
			out.close();
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
