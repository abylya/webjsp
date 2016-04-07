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
 * Servlet implementation class Redaktor
 */
@WebServlet("/Redaktor")
public class Redaktor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nbrPasp=request.getParameter("nbrPasp");

		for(Klient k:ClinikRobota.cpicok){
			if(k.getPasport().equals(nbrPasp)){
				k.setImya((String)request.getParameter("name"));
				k.setPasport((String)request.getParameter("nbrPasp"));
				for(Jivotnie j:k.getPitomez()){
					int i=k.getPitomez().indexOf(j);
					j.setVid((String)request.getParameter("vid"+i));
					j.setKlichka((String)request.getParameter("klichka"+i));
				
				}
			}
		}

		response.sendRedirect("Cpicok.jsp");
		
		}
	
		
	}


