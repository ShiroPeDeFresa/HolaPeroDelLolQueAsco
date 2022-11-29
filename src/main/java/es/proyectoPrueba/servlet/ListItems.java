package es.proyectoPrueba.servlet;

import java.io.IOException;
import java.util.List;

import es.proyectoPrueba.model.Item;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/listItems")
public class ListItems extends HttpServlet {
	LolRepository repo = new LolRepository();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Item> items = repo.listItems();
		req.setAttribute("items", items);
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/ListadoDeItems.jsp");
		dispatcher.forward(req, resp);
	}
	
}
