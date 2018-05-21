package com.Puiu.Alex.Anomaly;

import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyProperties;
import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyType;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Anomaly {

    private AnomalyType anomalyType ;
    private AnomalyProperties anomalyProperties;

    Anomaly(AnomalyType anomalyType, AnomalyProperties anomalyProperties) {

        this.anomalyType = anomalyType;
        this.anomalyProperties = anomalyProperties;

    }

    //for defensive copy
    public Anomaly(Anomaly anomaly) {
        this(anomaly.getAnomalyType(), anomaly.getAnomalyProperties());
    }

    public AnomalyType getAnomalyType() {
        return anomalyType;
    }

    public AnomalyProperties getAnomalyProperties() {
        return anomalyProperties;
    }
}
