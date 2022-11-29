package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.model.Stats;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/removeStat")
public class RemoveStat extends HttpServlet {
	LolRepository repo = new LolRepository();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Stats stat = new Stats(Integer.parseInt(req.getParameter("champion")), 
								req.getParameter("name"), 
								Double.parseDouble(req.getParameter("value")), 
								Double.parseDouble(req.getParameter("mpl")));
		repo.deleteWhereChampion(stat, req.getParameter("table"));
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(req.getParameter("servlet"));
		dispatcher.forward(req, resp);
	}
}
