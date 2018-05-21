package com.Puiu.Alex.Planet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;
import com.Puiu.Alex.FinalObjects.ConstructedPlanets;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetLifeAbundance;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetProperties;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetTemperature;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;

public class Planet {
	
	private PlanetType type; // Lava, Desert, Arid, Jungle, Atoll, Savannah, Mansoon, Forest, Terran, Barren, Artic, Snow, Boreal, Ocean, Steppes
	private PlanetSize size; // tiny, small, medium, large, huge
	private PlanetTemperature temperature; // hot, cold, temperate
	private PlanetLifeAbundance lifeAbundance; //sterile, fertile, normal
	private int number;
	private List<PlanetType> terraformOptions = new ArrayList<>();
	private String initialPlanetType;
	private String initialPlanetSize;

	private PlanetProperties planetProperties;
	
	//defensive copy 
	public Planet(Planet planet) {
		this(planet.getType(), planet.getTemperature(), planet.getLifeAbundance(), planet.getPlanetProperties(), planet.getTerraformOptions().toArray(new PlanetType[0]));

	}
	
	public Planet(ConstructedPlanets constructedPlanet, PlanetSize planetSize) {
		this.type = constructedPlanet.getPlanet().getType();
		this.size = planetSize;
		this.temperature = constructedPlanet.getPlanet().getTemperature();
		this.lifeAbundance = constructedPlanet.getPlanet().getLifeAbundance();
		
		this.planetProperties = new PlanetProperties(constructedPlanet.getPlanet().getPlanetProperties());
		this.planetProperties.setPopulation(constructedPlanet.getPlanet().getPlanetProperties().getPopulation() + getSize().getPopBonus());
		this.terraformOptions = constructedPlanet.getPlanet().getTerraformOptions();

		// This fields are use to save the initial state of the planet, before any terraforming occurs.
		// So it can be reset to the initial state.
		this.initialPlanetType = constructedPlanet.getPlanet().getType().toString();
		this.initialPlanetSize = planetSize.toString();

	}
	
	Planet(PlanetType type, PlanetTemperature planetTemperature, PlanetLifeAbundance lifeAbundance, PlanetProperties planetProperties, PlanetType... terraformOptions) {
		
		this.type = type;
		this.temperature = planetTemperature;
		this.lifeAbundance = lifeAbundance;
		
		this.planetProperties =  new PlanetProperties(planetProperties);
		this.planetProperties.setPopulation(planetProperties.getPopulation());
		this.terraformOptions = Arrays.asList(terraformOptions);
		

		
	}
	
	//Methods - beginning.
	
	@Override
	public String toString() {
		return "" + this.getType();
	}
	
	public boolean addAnomaly(ConstructedAnomalies anomaly) {

		getPlanetProperties().getAnomalies().getTarget().add(anomaly);
		resetPlanetToDefaultValuesAndRecalculate();
			
		return true;
	}
	
	public boolean removeAnomaly(ConstructedAnomalies anomaly) {

		getPlanetProperties().getAnomalies().getTarget().remove(anomaly);
		resetPlanetToDefaultValuesAndRecalculate();
		
		return true;
	}

	
	public void resetPlanetToDefaultValuesAndRecalculate() {
		
		// Bonuses from anomalies are updated in setters
		
		for (ConstructedPlanets p: ConstructedPlanets.values()) {
			if (this.getType() == p.getPlanet().getType()) {
				
				getPlanetProperties().setPopulation(p.getPlanet().getPlanetProperties().getPopulation() + getSize().getPopBonus());
				getPlanetProperties().setHappiness(p.getPlanet().getPlanetProperties().getHappiness());
				getPlanetProperties().setFoodPer1Pop(p.getPlanet().getPlanetProperties().getFoodPer1Pop());
				getPlanetProperties().setIndustryPer1Pop(p.getPlanet().getPlanetProperties().getIndustryPer1Pop());
				getPlanetProperties().setGoldPer1Pop(p.getPlanet().getPlanetProperties().getGoldPer1Pop());
				getPlanetProperties().setSciencePer1Pop(p.getPlanet().getPlanetProperties().getSciencePer1Pop());
				getPlanetProperties().setInfluencePer1Pop(p.getPlanet().getPlanetProperties().getInfluencePer1Pop());
				
			}
		}
	
		
	}
	
	
	public void terraform(PlanetType type) {
		
			if (this.terraformOptions.contains(type) || this.initialPlanetType == type.toString()) {
				transformPlanetInto(type);
			} else {
				throw new IllegalArgumentException("Can't terraform into: " + type);
			}

		}
		
	
	private void transformPlanetInto(PlanetType planet) {
		
		for (ConstructedPlanets p : ConstructedPlanets.values()) {
			if (planet == p.getPlanet().getType()) {
				setType(planet);
				setLifeAbundance(p.getPlanet().getLifeAbundance());
				setTemperature(p.getPlanet().getTemperature());
				getPlanetProperties().setPopulation(p.getPlanet().getPlanetProperties().getPopulation() + getSize().getPopBonus());
				getPlanetProperties().setHappiness(p.getPlanet().getPlanetProperties().getHappiness());
				getPlanetProperties().setFoodPer1Pop(p.getPlanet().getPlanetProperties().getFoodPer1Pop());
				getPlanetProperties().setIndustryPer1Pop(p.getPlanet().getPlanetProperties().getIndustryPer1Pop());
				getPlanetProperties().setGoldPer1Pop(p.getPlanet().getPlanetProperties().getGoldPer1Pop());
				getPlanetProperties().setSciencePer1Pop(p.getPlanet().getPlanetProperties().getSciencePer1Pop());
				getPlanetProperties().setInfluencePer1Pop(p.getPlanet().getPlanetProperties().getInfluencePer1Pop());
				setTerraformOptions(p.getPlanet().getTerraformOptions());
				
				
				
				
				
			}
		}
		
	}
	
	//Methods - ending
	
	// Getters and setter - beginning
	
	public void setLifeAbundance(PlanetLifeAbundance lifeAbundance) {
		this.lifeAbundance = lifeAbundance;
	}


	public PlanetProperties getPlanetProperties() {
		return planetProperties;
	}

	public void setPlanetProperties(PlanetProperties planetProperties) {
		this.planetProperties = planetProperties;
	}

	public void setSize(PlanetSize size) {
		this.size = size;
	}

	public void setTemperature(PlanetTemperature temperature) {
		this.temperature = temperature;
	}



	public PlanetType getType() {
		return type;
	}

	public void setType(PlanetType type) {
		this.type = type;
	}

	public PlanetSize getSize() {
		return size;
	}

	public PlanetTemperature getTemperature() {
		return temperature;
	}

	public PlanetLifeAbundance getLifeAbundance() {
		return lifeAbundance;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public List<PlanetType> getTerraformOptions() {
		return terraformOptions;
	}

	public void setTerraformOptions(List<PlanetType> terraformOptions) {
		this.terraformOptions = terraformOptions;
	}

	public String getInitialPlanetType() {
		return initialPlanetType;
	}

	public void setInitialPlanetType(String initialPlanetType) {
		this.initialPlanetType = initialPlanetType;
	}

	public String getInitialPlanetSize() {
		return initialPlanetSize;
	}

	public void setInitialPlanetSize(String initialPlanetSize) {
		this.initialPlanetSize = initialPlanetSize;
	}

	//Getters and setters - ending
	
	
	

	
	
	

}
