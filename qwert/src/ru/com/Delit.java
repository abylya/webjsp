package ru.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import ru.com.klinika.ClinikRobota;
import ru.com.klinika.Klient;

/**
 * Servlet implementation class Delit
 */
@WebServlet("/Delit")
public class Delit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String naim=request.getParameter("naim");
		String nbrPasp=request.getParameter("nbrPasp");
		
		for(Klient k:ClinikRobota.cpicok){
			if(k.getImya().equals(naim)&&k.getPasport().equals(nbrPasp)){
				ClinikRobota.cpicok.remove(k);	
			}
		}response.sendRedirect("Cpicok.jsp");
		}
	}


