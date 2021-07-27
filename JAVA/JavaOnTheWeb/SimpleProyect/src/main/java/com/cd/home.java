package com.cd;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class home
 */
public class home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name = request.getParameter("firstName");
		String lname = request.getParameter("lastName");
		String lang = request.getParameter("favoriteLanguage");
		String city = request.getParameter("homeTown");
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
 
        if(Objects.nonNull(name)) {
        	if(Objects.nonNull(lname)) {
            	out.write("<h1>Hola " + name + " "+ lname + "!!! </h1>");
        	} else {
        		out.write("<h1>Hola " + name + " Unknown !!! </h1>");
        	}
        } else {
        	out.write("<h1>Hola Unknown !!! </h1>");
        }
        if(Objects.nonNull(lang)) {
        	out.write("<h2>Tu lenguaje Favorito es:  " + lang + "</h2>");
        } else {
        	out.write("<h2>Tu lenguaje Favorito es: Unknown</h2>");
        }
        if(Objects.nonNull(city)) {
        	out.write("<h2>Tu ciudad es:  " + city + "</h2>");
        } else {
        	out.write("<h2>Tu ciudad es: Unknown</h2>");
        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
