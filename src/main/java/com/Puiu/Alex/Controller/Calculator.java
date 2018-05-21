package com.Puiu.Alex.Controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import com.Puiu.Alex.Anomaly.Anomaly;
import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;
import com.Puiu.Alex.FinalObjects.ConstructedPlanets;
import com.Puiu.Alex.Planet.Planet;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;
import com.Puiu.Alex.SolarSystem.SolarSystem;
import org.primefaces.model.DualListModel;

@ManagedBean
@ViewScoped
public class Calculator implements Serializable {
     
	private static final long serialVersionUID = 1L;
	
	
	private SolarSystem solarSystem;
	private List<Planet> planets;
	
	private Planet planet1;
	private Planet planet2;
	private Planet planet3;
	private Planet planet4;
	private Planet planet5;
	
	private String terraformPlanet1;
	private String terraformPlanet2;
	private String terraformPlanet3;
	private String terraformPlanet4;
	private String terraformPlanet5;

	private int numberOfPlanets;
 
    @PostConstruct
    public void init() {
    	FacesContext facesContext = FacesContext.getCurrentInstance(); 
    	HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
    	solarSystem = (SolarSystem) session.getAttribute("solarSystem");

    	planets = solarSystem.getPlanets();
    	planet1 = planets.get(0);
    	int i = planets.size();
    	this.numberOfPlanets = i;
    	if(i>1) planet2= planets.get(1);
    	if(i>2) planet3= planets.get(2);
    	if(i>3) planet4= planets.get(3);
    	if(i>4) planet5= planets.get(4);



	}

    public void terraform() {
    	if (terraformPlanet1 != null && !terraformPlanet1.isEmpty() && !terraformPlanet1.contains("reset")) {
    		planet1.terraform(PlanetType.valueOf(terraformPlanet1));
    		this.terraformPlanet1 = "";
    	}
    	if (terraformPlanet2 != null && !terraformPlanet2.isEmpty() && !terraformPlanet2.contains("reset")) {
    		planet2.terraform(PlanetType.valueOf(terraformPlanet2));
    		this.terraformPlanet2 = "";
    	}
    	if (terraformPlanet3 != null && !terraformPlanet3.isEmpty() && !terraformPlanet3.contains("reset")) {
    		planet3.terraform(PlanetType.valueOf(terraformPlanet3));
    		this.terraformPlanet3 = "";
    	}
    	if (terraformPlanet4 != null && !terraformPlanet4.isEmpty() && !terraformPlanet4.contains("reset")) {
    		planet4.terraform(PlanetType.valueOf(terraformPlanet4));
    		this.terraformPlanet4 = "";
    	}
    	if (terraformPlanet5 != null && !terraformPlanet5.isEmpty() && !terraformPlanet5.contains("reset")) {
    		planet5.terraform(PlanetType.valueOf(terraformPlanet5));
    		this.terraformPlanet5 = "";
    	}

    	if (terraformPlanet1 != null && terraformPlanet1.contains("reset")) {
			planet1.terraform(PlanetType.valueOf(planet1.getInitialPlanetType()));
			this.terraformPlanet1 = "";
		}

		if (terraformPlanet2 != null && terraformPlanet2.contains("reset")) {
			planet2.terraform(PlanetType.valueOf(planet2.getInitialPlanetType()));
			this.terraformPlanet2 = "";
		}

		if (terraformPlanet3 != null && terraformPlanet3.contains("reset")) {
			planet3.terraform(PlanetType.valueOf(planet3.getInitialPlanetType()));
			this.terraformPlanet3 = "";
		}

		if (terraformPlanet4 != null && terraformPlanet4.contains("reset")) {
			planet4.terraform(PlanetType.valueOf(planet4.getInitialPlanetType()));
			this.terraformPlanet4 = "";
		}

		if (terraformPlanet5 != null && terraformPlanet5.contains("reset")) {
			planet5.terraform(PlanetType.valueOf(planet5.getInitialPlanetType()));
			this.terraformPlanet5 = "";
		}

		solarSystem.actualizeSolarSystem();

    }

    public void actualizeSolarSystem() {
    	planets.forEach(Planet::resetPlanetToDefaultValuesAndRecalculate);
		solarSystem.actualizeSolarSystem();
	}


	public SolarSystem getSolarSystem() {
		return solarSystem;
	}


	public void setSolarSystem(SolarSystem solarSystem) {
		this.solarSystem = solarSystem;
	}


	public List<Planet> getPlanets() {
		return planets;
	}


	public void setPlanets(List<Planet> planets) {
		this.planets = planets;
	}


	public Planet getPlanet1() {
		return planet1;
	}


	public void setPlanet1(Planet planet1) {
		this.planet1 = planet1;
	}


	public Planet getPlanet2() {
		return planet2;
	}


	public void setPlanet2(Planet planet2) {
		this.planet2 = planet2;
	}


	public Planet getPlanet3() {
		return planet3;
	}


	public void setPlanet3(Planet planet3) {
		this.planet3 = planet3;
	}


	public Planet getPlanet4() {
		return planet4;
	}


	public void setPlanet4(Planet planet4) {
		this.planet4 = planet4;
	}


	public Planet getPlanet5() {
		return planet5;
	}


	public void setPlanet5(Planet planet5) {
		this.planet5 = planet5;
	}

	public String getTerraformPlanet1() {
		return terraformPlanet1;
	}

	public void setTerraformPlanet1(String terraformPlanet1) {
		this.terraformPlanet1 = terraformPlanet1;
	}

	public String getTerraformPlanet2() {
		return terraformPlanet2;
	}

	public void setTerraformPlanet2(String terraformPlanet2) {
		this.terraformPlanet2 = terraformPlanet2;
	}

	public String getTerraformPlanet3() {
		return terraformPlanet3;
	}

	public void setTerraformPlanet3(String terraformPlanet3) {
		this.terraformPlanet3 = terraformPlanet3;
	}

	public String getTerraformPlanet4() {
		return terraformPlanet4;
	}

	public void setTerraformPlanet4(String terraformPlanet4) {
		this.terraformPlanet4 = terraformPlanet4;
	}

	public String getTerraformPlanet5() {
		return terraformPlanet5;
	}

	public void setTerraformPlanet5(String terraformPlanet5) {
		this.terraformPlanet5 = terraformPlanet5;
	}

	public int getNumberOfPlanets() {
		return numberOfPlanets;
	}

	public void setNumberOfPlanets(int numberOfPlanets) {
		this.numberOfPlanets = numberOfPlanets;
	}
}
