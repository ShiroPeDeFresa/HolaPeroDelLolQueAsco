package es.proyectoPrueba.servlet;

import java.io.IOException;

import es.proyectoPrueba.model.Item;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertItem")
public class InsertItemsServlet extends BaseServlet{
	LolRepository repository = new LolRepository();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Item item = getItemFromRequest(req);
		repository.insertItem(item);
		redirect(req, resp, "/index.jsp");
	}

}
