package ru.com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ru.com.klinika.ClinikRobota;
import ru.com.klinika.Jivotnie;
import ru.com.klinika.Klient;

/**
 * Servlet implementation class ServAddKlient
 */
@WebServlet("/ServAddKlient")
public class ServAddKlient extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String naim=request.getParameter("naim");
//		String nbrPasp=request.getParameter("pasport");
//		String vid=request.getParameter("vid");
//		String klichka=request.getParameter("klichka");
//		List<Jivotnie>pitomez= new ArrayList<Jivotnie>();
//		Jivotnie j=new Jivotnie(vid,klichka,false);
//		pitomez.add(j);
//		ClinikRobota.cpicok.add( new Klient(naim,nbrPasp,pitomez));
//		response.sendRedirect("NewFile.jsp");
//		
//	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		String naim=request.getParameter("naim");
		String bykPasp=request.getParameter("BykPasport");
		String nbrPasp=request.getParameter("NbrPasport");
		String pasport=bykPasp+nbrPasp;
		ArrayList<Jivotnie> j=new ArrayList<>();
		for(int i=0;i<Integer.valueOf(request.getParameter("id"));i++){
			 
			String vid=request.getParameter("vid"+i);
			String klichka=request.getParameter("klichka"+i);
			
			j.add(new Jivotnie(vid,klichka,false));
			
		}
		
		ClinikRobota.cpicok.add( new Klient(naim,pasport,j));
	
		response.sendRedirect("NewFile.html");
		
	}

}
