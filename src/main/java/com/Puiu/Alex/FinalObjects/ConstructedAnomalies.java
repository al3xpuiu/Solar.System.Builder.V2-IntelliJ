 package com.Puiu.Alex.FinalObjects;

import com.Puiu.Alex.Anomaly.Anomaly;
import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyProperties;
import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyType;
import com.Puiu.Alex.Anomaly.AnomalyBuilder;

import java.util.Arrays;
import java.util.stream.Collectors;

 public enum ConstructedAnomalies {
	
	HIGH_GRAVITY(new AnomalyBuilder().setAnomalyType(AnomalyType.HIGH_GRAVITY)
				.setAnomalyProperties(new AnomalyProperties(0, 0, 0, -2, 0, -1, 0))
				.build()),
	TOXIC(new AnomalyBuilder().setAnomalyType(AnomalyType.TOXIC)
				.setAnomalyProperties(new AnomalyProperties(0, 0 ,-1, -1, 0, 1, 0))
				.build());

	
	private final Anomaly anomaly;
	
	ConstructedAnomalies(Anomaly anomaly) {
		
		this.anomaly = new Anomaly(anomaly);
		
	}

	 public String formatString() {
		 return Arrays.asList(this.anomaly.getAnomalyType().toString().split("_")).stream()
				 .map(s -> s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase())
				 .collect(Collectors.joining(" "));
	 }

	public Anomaly getAnomaly() {
		return new Anomaly(this.anomaly);
	}

	
} 
