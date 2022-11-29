package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Ability;
import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.model.Tips;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertAbility")
public class InsertAbility extends BaseServlet{
	LolRepository repository = new LolRepository();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Champion> champions = repository.listChamps();
		req.setAttribute("champions", champions);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/InsertarHabilidades.jsp");
		dispatcher.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Ability ability = getAbilityFromRequest(req);
		repository.insertAbilities(ability);
		redirect(req, resp, "/index.jsp");
	}

}
