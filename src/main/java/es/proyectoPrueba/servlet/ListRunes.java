package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/listRunes")
public class ListRunes extends HttpServlet {
	LolRepository repo = new LolRepository();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Rune> runes = repo.listRunes();
		req.setAttribute("runes", runes);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeRunas.jsp");
		dispatcher.forward(req, resp);
	}
	
}
