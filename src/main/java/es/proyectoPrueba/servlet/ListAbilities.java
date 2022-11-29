package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Ability;
import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/listAbilities")
public class ListAbilities extends HttpServlet {
	LolRepository repo = new LolRepository();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Ability> abilities = repo.listAbilities();
		req.setAttribute("abilities", abilities);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeHabilidades.jsp");
		dispatcher.forward(req, resp);
	}
}
