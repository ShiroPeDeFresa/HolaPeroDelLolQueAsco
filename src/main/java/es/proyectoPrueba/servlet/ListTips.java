package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Ability;
import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Tips;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/listTips")
public class ListTips extends HttpServlet {
	LolRepository repo = new LolRepository();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Tips> tips = repo.listTips();
		req.setAttribute("tips", tips);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeTips.jsp");
		dispatcher.forward(req, resp);
	}
}
