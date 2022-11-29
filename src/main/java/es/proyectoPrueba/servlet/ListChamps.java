package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/listChamps")
public class ListChamps extends BaseServlet {
	LolRepository repo = new LolRepository();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Champion> champs = repo.listChamps();
		req.setAttribute("champs", champs);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeCampeones.jsp");
		dispatcher.forward(req, resp);
	}
}
