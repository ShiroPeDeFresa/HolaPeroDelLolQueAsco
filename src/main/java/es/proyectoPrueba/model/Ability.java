package es.proyectoPrueba.model;

public class Ability {

	private int id;
	private int champion;
	private String Name;
	private String Description;
	private String effect;
	private String cost;
	private int range;
	
	public Ability(int id, int champion, String name, String description, String effect, String cost,
			int range) {
		super();
		this.id = id;
		this.champion = champion;
		this.Name = name;
		this.Description = description;
		this.effect = effect;
		this.cost = cost;
		this.range = range;
	}

	public Ability() {
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

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description = Description;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}

	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	
	
	
	

}
