package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.model.Stats;
import es.proyectoPrueba.model.Tips;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertStat")
public class InsertStat extends BaseServlet{
	LolRepository repository = new LolRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Champion> champions = repository.listChamps();
		req.setAttribute("champions", champions);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/InsertarStat.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Stats stat = getStatFromRequest(req);
		repository.insertStats(stat);
		redirect(req, resp, "/index.jsp");
	}

}
