package com.Puiu.Alex.Planet.PlanetAttributes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;
import com.Puiu.Alex.Properties.*;
import org.primefaces.model.DualListModel;

public class PlanetProperties extends Properties {

	
	
	private DualListModel<ConstructedAnomalies> anomalies;

	
	//makes a copy of the parameter. Created for defence copy.
	public PlanetProperties(PlanetProperties planetProperties) {
		
		this(planetProperties.getPopulation(), planetProperties.getHappiness(),
				planetProperties.getFoodPer1Pop(), planetProperties.getIndustryPer1Pop(),
				planetProperties.getGoldPer1Pop(), planetProperties.getSciencePer1Pop(),
				planetProperties.getInfluencePer1Pop());
		
		
	}
	
	public PlanetProperties(double population, double happiness, 
			double foodPer1Pop, double industryPer1Pop, 
			double goldPer1Pop, double sciencePer1Pop,
			double influencePer1Pop) {
		
		this.population = population;
		this.happiness = happiness;
		this.foodPer1Pop = foodPer1Pop;
		this.industryPer1Pop = industryPer1Pop;
		this.goldPer1Pop = goldPer1Pop;
		this.sciencePer1Pop = sciencePer1Pop;
		this.influencePer1Pop = influencePer1Pop;

		List<ConstructedAnomalies> source = Arrays.asList(ConstructedAnomalies.values());
		List<ConstructedAnomalies> target = new ArrayList<>();
		this.anomalies = new DualListModel<>(source, target);
		
	}
	

	public void setPopulation(double population) {
		this.population = population;	
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.population += s.getAnomaly().getAnomalyProperties().getPopulation();

		this.population = Math.max(0, this.population);
		this.foodTotal = this.foodPer1Pop * this.population;
		this.industryTotal = this.industryPer1Pop * this.population;
		this.goldTotal = this.goldPer1Pop * this.population;
		this.scienceTotal = this.sciencePer1Pop * this.population;
		this.influenceTotal = this.influencePer1Pop * this.population;
		
	}

	public double getHappiness() {
		return happiness;
	}

	public void setHappiness(double happiness) {
		this.happiness = happiness;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.happiness += s.getAnomaly().getAnomalyProperties().getHappiness();
		this.happiness = Math.max(0, this.happiness);
		
	}

	public double getFoodPer1Pop() {
		return foodPer1Pop;
	}

	public void setFoodPer1Pop(double foodPer1Pop) {
		this.foodPer1Pop = foodPer1Pop;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.foodPer1Pop += s.getAnomaly().getAnomalyProperties().getFoodPer1Pop();
		this.foodPer1Pop = Math.max(0, this.foodPer1Pop);
		this.foodTotal = this.foodPer1Pop * this.population;
	}

	public double getIndustryPer1Pop() {
		return industryPer1Pop;
	}

	public void setIndustryPer1Pop(double industryPer1Pop) {
		this.industryPer1Pop = industryPer1Pop;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.industryPer1Pop += s.getAnomaly().getAnomalyProperties().getIndustryPer1Pop();
		this.industryPer1Pop = Math.max(0, this.industryPer1Pop);
		this.industryTotal = this.industryPer1Pop * this.population;
	}

	public double getGoldPer1Pop() {
		return goldPer1Pop;
	}


	public DualListModel<ConstructedAnomalies> getAnomalies() {
		return anomalies;
	}

	public void setGoldPer1Pop(double goldPer1Pop) {
		this.goldPer1Pop = goldPer1Pop;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.goldPer1Pop += s.getAnomaly().getAnomalyProperties().getGoldPer1Pop();
		this.goldPer1Pop = Math.max(0, this.goldPer1Pop);
		this.goldTotal = this.goldPer1Pop * this.population;
	}

	public double getSciencePer1Pop() {
		return sciencePer1Pop;
	}

	public void setSciencePer1Pop(double sciencePer1Pop) {
		this.sciencePer1Pop = sciencePer1Pop;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.sciencePer1Pop += s.getAnomaly().getAnomalyProperties().getSciencePer1Pop();
		this.sciencePer1Pop = Math.max(0, this.sciencePer1Pop);
		this.scienceTotal = this.sciencePer1Pop * this.population;
	}

	public double getInfluencePer1Pop() {
		return influencePer1Pop;
	}

	public void setInfluencePer1Pop(double influencePer1Pop) {
		this.influencePer1Pop = influencePer1Pop;
		
		for (ConstructedAnomalies s: this.anomalies.getTarget() ) this.industryPer1Pop += s.getAnomaly().getAnomalyProperties().getInfluencePer1Pop();
		this.influencePer1Pop = Math.max(0, this.influencePer1Pop);
		this.influenceTotal = this.influencePer1Pop * this.population;
	}


	public double getPopulation() {
		return population;
	}

	public double getFoodTotal() {
		return foodTotal;
	}

	public double getIndustryTotal() {
		return industryTotal;
	}

	public double getGoldTotal() {
		return goldTotal;
	}

	public double getScienceTotal() {
		return scienceTotal;
	}

	public double getInfluenceTotal() {
		return influenceTotal;
	}

	public void setAnomalies(DualListModel<ConstructedAnomalies> anomalies) {
		this.anomalies = anomalies;
	}
}
