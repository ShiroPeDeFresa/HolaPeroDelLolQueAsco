package es.proyectoPrueba.model;

public class Stats {
	private	int champion;
	private String name;
	private double value;
	private double modifierPerLevel;
	
	public Stats(int champion, String name, double value, double modifierPerLevel) {
		super();
		this.champion = champion;
		this.name = name;
		this.value = value;
		this.modifierPerLevel = modifierPerLevel;
	}
	
	public Stats() {
		// TODO Auto-generated constructor stub
	}

	public int getChampion() {
		return champion;
	}
	public void setChampion(int champion) {
		this.champion = champion;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public double getModifierPerLevel() {
		return modifierPerLevel;
	}
	public void setModifierPerLevel(double modifierPerLevel) {
		this.modifierPerLevel = modifierPerLevel;
	}
	
	
	
	
}
