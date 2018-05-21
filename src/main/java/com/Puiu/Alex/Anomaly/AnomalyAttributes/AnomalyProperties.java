package com.Puiu.Alex.Anomaly.AnomalyAttributes;

import com.Puiu.Alex.Properties.Properties;


public class AnomalyProperties extends Properties {

	public AnomalyProperties(double population, double happiness, 
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
	}

	// used for defensive copy
	public AnomalyProperties(AnomalyProperties anomalyProperties) {

		this(anomalyProperties.getPopulation(), anomalyProperties.getHappiness(), anomalyProperties.getFoodPer1Pop(),
				anomalyProperties.getIndustryPer1Pop(), anomalyProperties.getGoldPer1Pop(),
				anomalyProperties.getSciencePer1Pop(), anomalyProperties.getInfluencePer1Pop());

	}
}
