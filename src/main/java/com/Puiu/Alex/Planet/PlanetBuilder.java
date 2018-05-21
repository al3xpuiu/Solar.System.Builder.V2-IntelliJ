package com.Puiu.Alex.Planet;

import java.util.List;

import com.Puiu.Alex.Planet.PlanetAttributes.PlanetLifeAbundance;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetProperties;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetTemperature;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;

public class PlanetBuilder {
	
	private PlanetType type; // Lava, Desert, Arid, Jungle, Atoll, Savannah, Mansoon, Forest, Terran, Barren, Artic, Snow, Boreal, Ocean, Steppes
	private PlanetTemperature planetTemperature;
	private PlanetLifeAbundance lifeAbundance; //sterile, fertile, normal
	private PlanetProperties planetProperties;
	private PlanetType[] terraformOptions;
	
	public PlanetBuilder() {}
	
	public PlanetBuilder setType(PlanetType planetType) {
		this.type = planetType;
		return this;
	}
	
	public PlanetBuilder setTemperature(PlanetTemperature planetTemperature) {
		this.planetTemperature = planetTemperature;
		return this;
	}
	
	public PlanetBuilder setLifeAbundance(PlanetLifeAbundance planetLifeAbundance) {
		this.lifeAbundance = planetLifeAbundance;
		return this;
	}
	
	public PlanetBuilder setPlanetProperties(PlanetProperties planetProperties) {
		this.planetProperties = planetProperties;
		return this;
	}
	
	public PlanetBuilder setTerraformOptions(PlanetType... terraformOptions) {
		this.terraformOptions = terraformOptions;
		return this;
	}
	
	public Planet build() {
		return new Planet(type, planetTemperature, lifeAbundance, planetProperties, terraformOptions);
	}
	
}
