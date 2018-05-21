package com.Puiu.Alex.Controller;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.primefaces.context.RequestContext;

import com.Puiu.Alex.FinalObjects.ConstructedPlanets;
import com.Puiu.Alex.Planet.Planet;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetType;
import com.Puiu.Alex.SolarSystem.SolarSystem;


@ManagedBean
@ViewScoped
public class SelectNumberOfPlanets implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer numberOfPlanets;

	
	private String planetType1;
	private String planetSize1;

	private String planetType2;
	private String planetSize2;

	private String planetType3;
	private String planetSize3;

	private String planetType4;
	private String planetSize4;

	private String planetType5;
	private String planetSize5;

	@PostConstruct
	public void init() {
		numberOfPlanets = 1;
		
	}
	
	public void testMethod() {
		
	}

	public void createSystem() throws IllegalAccessException {
		
		List<ConstructedPlanets> planetTypes = new ArrayList<>();
		List<PlanetSize> planetSizes = new ArrayList<>();
		Field[] fields = this.getClass().getDeclaredFields();
        for(Field f: fields) {
            if (f.getName().contains("planetType") && (f.get(this)!=null)) planetTypes.add(ConstructedPlanets.valueOf((String) f.get(this)));
            if (f.getName().contains("planetSize") && (f.get(this)!=null)) planetSizes.add(PlanetSize.valueOf((String) f.get(this)));
        }
        
		List<Planet> planets = Stream.iterate(0, i ->i+1)
		.limit(numberOfPlanets)
		.map(i -> new Planet(planetTypes.get(i), planetSizes.get(i)))
		.collect(Collectors.toList());
		
		
				
		// lombok
		// https://www.udemy.com/spring-framework-5-beginner-to-guru/
		
		FacesContext facesContext = FacesContext.getCurrentInstance(); 
		HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
		session.setAttribute("solarSystem", new SolarSystem(planets));
		
	}

	public String getPlanetType2() {
		return planetType2;
	}

	public void setPlanetType2(String planetType2) {
		this.planetType2 = planetType2;
	}

	public String getPlanetSize2() {
		return planetSize2;
	}

	public void setPlanetSize2(String planetSize2) {
		this.planetSize2 = planetSize2;
	}

	public String getPlanetType3() {
		return planetType3;
	}

	public void setPlanetType3(String planetType3) {
		this.planetType3 = planetType3;
	}

	public String getPlanetSize3() {
		return planetSize3;
	}

	public void setPlanetSize3(String planetSize3) {
		this.planetSize3 = planetSize3;
	}

	public String getPlanetType4() {
		return planetType4;
	}

	public void setPlanetType4(String planetType4) {
		this.planetType4 = planetType4;
	}

	public String getPlanetSize4() {
		return planetSize4;
	}

	public void setPlanetSize4(String planetSize4) {
		this.planetSize4 = planetSize4;
	}

	public String getPlanetType5() {
		return planetType5;
	}

	public void setPlanetType5(String planetType5) {
		this.planetType5 = planetType5;
	}

	public String getPlanetSize5() {
		return planetSize5;
	}

	public void setPlanetSize5(String planetSize5) {
		this.planetSize5 = planetSize5;
	}

	public String getPlanetSize1() {
		return planetSize1;
	}

	public void setPlanetSize1(String planetSize1) {
		this.planetSize1 = planetSize1;
	}

	public String getPlanetType1() {
		return planetType1;
	}

	public void setPlanetType1(String planetType1) {
		this.planetType1 = planetType1;
	}
	
	

	public Integer getNumberOfPlanets() {
		return numberOfPlanets;
	}



	public void setNumberOfPlanets(Integer numberOfPlanets) {
		this.numberOfPlanets = numberOfPlanets;
	}




	
	

}
