package es.proyectoPrueba.servlet;

import java.io.IOException;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertChamp")
public class InsertChampsServlet extends BaseServlet{
	LolRepository repository = new LolRepository();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Champion champion = getChampionFromRequest(req);
		repository.insertChampion(champion);
		redirect(req, resp, "/InsertarCampeon.jsp");
	}

}
