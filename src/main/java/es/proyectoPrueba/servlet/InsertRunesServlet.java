package es.proyectoPrueba.servlet;

import java.io.IOException;

import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.repository.LolRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/insertRune")
public class InsertRunesServlet extends BaseServlet{
	LolRepository repository = new LolRepository();
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Rune rune = getRuneFromRequest(req);
		repository.insertRunes(rune);
		redirect(req, resp, "/index.jsp");
	}

}
