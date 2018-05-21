package com.Puiu.Alex.Anomaly;

import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyProperties;
import com.Puiu.Alex.Anomaly.AnomalyAttributes.AnomalyType;

public class AnomalyBuilder {

    private AnomalyType anomalyType ;
    private AnomalyProperties anomalyProperties;

    public AnomalyBuilder() {}

    public AnomalyBuilder setAnomalyType(AnomalyType anomalyType) {
        this.anomalyType = anomalyType;
        return this;
    }

    public AnomalyBuilder setAnomalyProperties(AnomalyProperties anomalyProperties) {
        this.anomalyProperties = anomalyProperties;
        return this;
    }

    public Anomaly build() {
        return new Anomaly(this.anomalyType, this.anomalyProperties);
    }
}
