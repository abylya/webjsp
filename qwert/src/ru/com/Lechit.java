package ru.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.com.klinika.ClinikRobota;
import ru.com.klinika.Jivotnie;
import ru.com.klinika.Klient;

/**
 * Servlet implementation class Lechit
 */
@WebServlet("/Lechit")
public class Lechit extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nbrPasp=request.getParameter("nbrPasp");

		for(Klient k:ClinikRobota.cpicok){
			if(k.getPasport().equals(nbrPasp)){
				
				for(Jivotnie j:k.getPitomez()){
					if(j.getKlichka().equals(request.getParameter("klichka"))){
						j.setZdorovie(true);
					}
				}
			}
		}response.sendRedirect("Cpicok.jsp");
	}
	
}
