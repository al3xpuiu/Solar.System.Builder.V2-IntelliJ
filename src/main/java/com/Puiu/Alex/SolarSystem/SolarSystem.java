package com.Puiu.Alex.SolarSystem;

import java.util.ArrayList;
import java.util.List;

import com.Puiu.Alex.Planet.Planet;

public class SolarSystem {

	private List<Planet> planets;
	private List<Building> buildings;
	
	private double population;
	private double food;
	private double industry;
	private double gold;
	private double science;
	private double influence;
	
	public SolarSystem(List<Planet> planets) {
		
		this.planets = new ArrayList<Planet>();
		this.buildings = new ArrayList<Building>();
		int i = 1;
		for (Planet p : planets) {
			this.planets.add(p);
			this.population += p.getPlanetProperties().getPopulation();
			this.food += p.getPlanetProperties().getFoodTotal();
			this.industry += p.getPlanetProperties().getIndustryTotal();
			this.gold += p.getPlanetProperties().getGoldTotal();
			this.science += p.getPlanetProperties().getScienceTotal();
			this.influence += p.getPlanetProperties().getInfluenceTotal();
			p.setNumber(i++);
		}
		
	}
	
	// Methods - beginning
		
	public void actualizeSolarSystem() {
		this.population = 0; this.food = 0; this.industry = 0; 
		this.gold = 0; this.science = 0; this.influence = 0;
		for (Planet p : planets) {
			this.population += p.getPlanetProperties().getPopulation();
			this.food += p.getPlanetProperties().getFoodTotal();
			this.industry += p.getPlanetProperties().getIndustryTotal();
			this.gold += p.getPlanetProperties().getGoldTotal();
			this.science += p.getPlanetProperties().getScienceTotal();
			this.influence += p.getPlanetProperties().getInfluenceTotal();
		}
	}
		
	public boolean addBuilding(Building building) {
			// not implemented
			return true;
		}
		
		
	public boolean removeBuilding(Building building) {
			// not implemented
			return true;
		}
	
	
	// Methods - ending
	
	// getters and setters - beginning

	public double getFood() {
		return food;
	}

	public double getIndustry() {
		return industry;
	}

	public double getGold() {
		return gold;
	}

	public double getScience() {
		return science;
	}

	public double getInfluence() {
		return influence;
	}

	public List<Planet> getPlanets() {
		return planets;
	}

	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
	}
	
	
	// getters and setters - ending
	
	
	
	
}
