package es.proyectoPrueba.servlet;

import java.io.IOException;

import es.proyectoPrueba.model.Champion;
import es.proyectoPrueba.model.Item;
import es.proyectoPrueba.model.Ability;
import es.proyectoPrueba.model.Rune;
import es.proyectoPrueba.model.Stats;
import es.proyectoPrueba.model.Tips;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public abstract class BaseServlet extends HttpServlet {

	public BaseServlet() {
		super();
	}

	protected Champion getChampionFromRequest(HttpServletRequest req) {
		Champion champion = new Champion();
		champion.setId(Integer.parseInt(req.getParameter("id")));
		champion.setName(req.getParameter("name"));
		System.out.println(champion.getName());
		champion.setTitle(req.getParameter("title"));
		System.out.println(champion.getTitle());
		champion.setLore(req.getParameter("lore"));
		System.out.println(champion.getLore());
		champion.setTags(req.getParameter("tags"));
		System.out.println(champion.getTags());;
		return champion;
	}
	
	protected Rune getRuneFromRequest(HttpServletRequest req) {
		Rune rune = new Rune();
		rune.setId(Integer.parseInt(req.getParameter("id")));
		rune.setTier(Integer.parseInt(req.getParameter("tier")));
		System.out.println("Tier" +rune.getTier());
		rune.setName(req.getParameter("name"));
		System.out.println(rune.getName());
		rune.setDescription(req.getParameter("description"));
		System.out.println(rune.getDescription());
		return rune;
	}
	
	protected Stats getStatFromRequest(HttpServletRequest req) {
		Stats item = new Stats();
		item.setChampion(Integer.parseInt(req.getParameter("champion")));
		item.setName(req.getParameter("name"));
		System.out.println(item.getName());
		item.setValue(Integer.parseInt(req.getParameter("value")));
		System.out.println(item.getValue());
		item.setValue(Integer.parseInt(req.getParameter("mpl")));
		System.out.println(item.getValue());
		return item;
	}
	
	protected Tips getTipFromRequest(HttpServletRequest req) {
		Tips tip = new Tips();
		tip.setId(Integer.parseInt(req.getParameter("id")));
		tip.setChampion(Integer.parseInt(req.getParameter("champion")));
		System.out.println(tip.getChampion());
		tip.setTip(req.getParameter("tip"));
		return tip;
	}
	
	protected Ability getAbilityFromRequest(HttpServletRequest req) {
		Ability item = new Ability();
		item.setId(Integer.parseInt(req.getParameter("id")));
		System.out.println(item.getId());
		item.setChampion(Integer.parseInt(req.getParameter("champion")));
		System.out.println(item.getChampion());
		item.setName(req.getParameter("name"));
		System.out.println(item.getName());
		item.setDescription(req.getParameter("description"));
		System.out.println(item.getDescription());
		item.setEffect(req.getParameter("effect"));
		System.out.println(item.getEffect());
		item.setCost(req.getParameter("cost"));
		System.out.println(item.getCost());
		item.setRange(Integer.parseInt(req.getParameter("range")));
		System.out.println(item.getRange());
		return item;
	}
	
	protected Item getItemFromRequest(HttpServletRequest req) {
		Item item = new Item();
		item.setId(Integer.parseInt(req.getParameter("id")));
		item.setName(req.getParameter("name"));
		System.out.println(item.getName());
		item.setEffect(req.getParameter("effect"));
		System.out.println(item.getEffect());
		return item;
	}

	protected void redirect(HttpServletRequest req, HttpServletResponse resp, String jsp) throws IOException, ServletException {
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(jsp);
		dispatcher.forward(req, resp);
	}

}