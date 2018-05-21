package com.Puiu.Alex;

import com.Puiu.Alex.Planet.*;
import com.Puiu.Alex.Anomaly.*;
import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;
import com.Puiu.Alex.FinalObjects.ConstructedPlanets;
import com.Puiu.Alex.Planet.Planet;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetLifeAbundance;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	static ConstructedAnomalies anomaly = ConstructedAnomalies.TOXIC;

	public static void main(String[] args) {

		String a = Arrays.asList(anomaly.getAnomaly().getAnomalyType().toString().split("_")).stream()
				.map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
				.collect(Collectors.joining(" "));

		System.out.println(a);
	}

}
