package es.proyectoPrueba.servlet;

import java.io.IOException;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/modifyChampion")
public class ModifyChampion extends BaseServlet {
	
	LolRepository repo = new LolRepository();

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Champion champion = getChampionFromRequest(req);
		repo.modifyChampion(champion);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeAlumnos.jsp");
		dispatcher.forward(req, resp);
	}
	
}
