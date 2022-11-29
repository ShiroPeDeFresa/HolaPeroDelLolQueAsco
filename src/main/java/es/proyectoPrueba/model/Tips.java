package es.proyectoPrueba.model;

public class Tips {
	private int id;
	private int champion;
	private String tip;
	
	public Tips(int id, int champion, String tip) {
		super();
		this.id = id;
		this.champion = champion;
		this.tip = tip;
	}
	
	public Tips() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getChampion() {
		return champion;
	}
	public void setChampion(int champion) {
		this.champion = champion;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	
	
	
}
