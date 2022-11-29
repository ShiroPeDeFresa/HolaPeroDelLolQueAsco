package es.proyectoPrueba.model;

public class Item {
	private int id;
	private String name;
	private String effect;
	
	public Item(int id, String name, String effect) {
		super();
		this.id = id;
		this.name = name;
		this.effect = effect;
	}
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	
	
}
