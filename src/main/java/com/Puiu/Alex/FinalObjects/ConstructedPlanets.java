package com.Puiu.Alex.FinalObjects;

import com.Puiu.Alex.Planet.Planet;
import com.Puiu.Alex.Planet.PlanetBuilder;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetLifeAbundance;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetProperties;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetTemperature;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;

import static com.Puiu.Alex.Planet.PlanetAttributes.PlanetConstants.*;
import java.util.*;

public enum ConstructedPlanets {

	LAVA_PLANET(new PlanetBuilder().setType(PlanetType.LAVA)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusLava, -20, 0, 16, 2, 0, 0))
			.setTerraformOptions(PlanetType.DESERT)
			.build()),
			
	ASH_PLANET(new PlanetBuilder().setType(PlanetType.ASH)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusAsh, -15, 0, 12, 4, 0, 0))
			.setTerraformOptions(PlanetType.DESERT)
			.build()),
			
	DESERT_PLANET(new PlanetBuilder().setType(PlanetType.DESERT)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusDesert, -10, 1, 8, 6, 0, 0) )
			.setTerraformOptions(PlanetType.ARID, PlanetType.SAVANNAH)
			.build()),
			
	ARID_PLANET(new PlanetBuilder().setType(PlanetType.ARID)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusArid, -10, 2, 8, 4, 0, 0) )
			.setTerraformOptions(PlanetType.SAVANNAH, PlanetType.JUNGLE)
			.build()),
			
	MEDITERRANEAN_PLANET(new PlanetBuilder().setType(PlanetType.MEDITERRANEAN)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusMediterranean, -5, 6, 6, 3, 0, 0) )
			.setTerraformOptions(PlanetType.JUNGLE, PlanetType.TERRAN)
			.build()),
			
	JUNGLE_PLANET(new PlanetBuilder().setType(PlanetType.JUNGLE)
			.setTemperature(PlanetTemperature.HOT)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusJungle, 0, 6, 5, 3, 0, 0) )
			.setTerraformOptions(PlanetType.ATOLL, PlanetType.TERRAN)
			.build()),
			
	ATOLL_PLANET(new PlanetBuilder().setType(PlanetType.ATOLL)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusAtoll, 0, 8, 6, 4, 2, 0) )
			.setTerraformOptions()
			.build()),
			
	TOXIC_PLANET(new PlanetBuilder().setType(PlanetType.TOXIC)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusToxic, -20, 3, 2, 8, 2, 0) )
			.setTerraformOptions(PlanetType.SAVANNAH, PlanetType.STEPPES)
			.build()),
			
	SAVANNAH_PLANET(new PlanetBuilder().setType(PlanetType.SAVANNAH)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusSavannah, -5, 4, 3, 5, 2, 0) )
			.setTerraformOptions(PlanetType.MONSOON)
			.build()),
			
	MONSOON_PLANET(new PlanetBuilder().setType(PlanetType.MONSOON)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusMonsoon, -5, 6, 2, 4, 2, 0) )
			.setTerraformOptions(PlanetType.TERRAN, PlanetType.FOREST)
			.build()),
			
	TERRAN_PLANET(new PlanetBuilder().setType(PlanetType.TERRAN)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusTerran, 5, 8, 3, 4, 4, 0) )
			.setTerraformOptions()
			.build()),
			
	FOREST_PLANET(new PlanetBuilder().setType(PlanetType.FOREST)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusForest, 5, 8, 4, 4, 3, 0) )
			.setTerraformOptions()
			.build()),
			
	STEPPES_PLANET(new PlanetBuilder().setType(PlanetType.STEPPES)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusSteppes, -5, 4, 2, 5, 3, 0) )
			.setTerraformOptions(PlanetType.MONSOON)
			.build()),
			
	TUNDRA_PLANET(new PlanetBuilder().setType(PlanetType.TUNDRA)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusTundra, -5, 6, 0, 3, 6, 0) )
			.setTerraformOptions(PlanetType.BOREAL, PlanetType.FOREST)
			.build()),
			
	BARREN_PLANET(new PlanetBuilder().setType(PlanetType.BARREN)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusBarren, -20, 0, 0, 2, 16, 0) )
			.setTerraformOptions(PlanetType.ARTIC)
			.build()),
			
	ICE_PLANET(new PlanetBuilder().setType(PlanetType.ICE)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusIce, -15, 0, 0, 4, 16, 0) )
			.setTerraformOptions(PlanetType.ARTIC)
			.build()),
			
	ARTIC_PLANET(new PlanetBuilder().setType(PlanetType.ARTIC)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.STERILE)
			.setPlanetProperties(new PlanetProperties(popBonusArtic, -10, 1, 0, 6, 8, 0) )
			.setTerraformOptions(PlanetType.SNOW, PlanetType.STEPPES)
			.build()),
			
	SNOW_PLANET(new PlanetBuilder().setType(PlanetType.SNOW)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.NORMAL)
			.setPlanetProperties(new PlanetProperties(popBonusSnow, -10, 2, 0, 4, 8, 0) )
			.setTerraformOptions(PlanetType.BOREAL, PlanetType.STEPPES)
			.build()),
			
	BOREAL_PLANET(new PlanetBuilder().setType(PlanetType.BOREAL)
			.setTemperature(PlanetTemperature.COLD)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusBoreal, 0, 6, 0, 3, 5, 0) )
			.setTerraformOptions(PlanetType.OCEAN)
			.build()),
			
	OCEAN_PLANET(new PlanetBuilder().setType(PlanetType.OCEAN)
			.setTemperature(PlanetTemperature.TEMPERATE)
			.setLifeAbundance(PlanetLifeAbundance.FERTILE)
			.setPlanetProperties(new PlanetProperties(popBonusBoreal, 0, 8, 2, 4, 6, 0) )
			.setTerraformOptions()
			.build());
	
	private final Planet planet;
	
	ConstructedPlanets(Planet planet) {
		this.planet = new Planet(planet);
	}

	public Planet getPlanet() {
		return new Planet(planet);
	}

	
	
}
