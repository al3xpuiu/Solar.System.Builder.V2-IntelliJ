package com.Puiu.Alex.Planet;

import com.Puiu.Alex.FinalObjects.ConstructedAnomalies;
import com.Puiu.Alex.FinalObjects.ConstructedPlanets;
import com.Puiu.Alex.Planet.PlanetAttributes.PlanetSize;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Loky on 01/04/2018.
 */
public class PlanetTest {

    private Planet steppes;
    @Before
    public void setUp() {
        this.steppes = new Planet(ConstructedPlanets.STEPPES_PLANET, PlanetSize.MEDIUM);
    }

    @Test
    public void addAnomaly() throws Exception {

        assertEquals(7, steppes.getPlanetProperties().getPopulation(), 0);
        assertEquals(-5, steppes.getPlanetProperties().getHappiness(), 0);
        assertEquals(4, steppes.getPlanetProperties().getFoodPer1Pop(), 0);
        assertEquals(2, steppes.getPlanetProperties().getIndustryPer1Pop(), 0);
        assertEquals(5, steppes.getPlanetProperties().getGoldPer1Pop(), 0);
        assertEquals(3, steppes.getPlanetProperties().getSciencePer1Pop(), 0);
        assertEquals(0, steppes.getPlanetProperties().getInfluencePer1Pop(), 0);

        steppes.addAnomaly(ConstructedAnomalies.HIGH_GRAVITY);
        assertEquals(7, steppes.getPlanetProperties().getPopulation(), 0);
        assertEquals(-5, steppes.getPlanetProperties().getHappiness(), 0);
        assertEquals(4, steppes.getPlanetProperties().getFoodPer1Pop(), 0);
        assertEquals(0, steppes.getPlanetProperties().getIndustryPer1Pop(), 0);
        assertEquals(5, steppes.getPlanetProperties().getGoldPer1Pop(), 0);
        assertEquals(2, steppes.getPlanetProperties().getSciencePer1Pop(), 0);
        assertEquals(0, steppes.getPlanetProperties().getInfluencePer1Pop(), 0);


    }

    @Test
    public void removeAnomaly() throws Exception {
        assertEquals(7, steppes.getPlanetProperties().getPopulation(), 0);
        assertEquals(-5, steppes.getPlanetProperties().getHappiness(), 0);
        assertEquals(4, steppes.getPlanetProperties().getFoodPer1Pop(), 0);
        assertEquals(2, steppes.getPlanetProperties().getIndustryPer1Pop(), 0);
        assertEquals(5, steppes.getPlanetProperties().getGoldPer1Pop(), 0);
        assertEquals(3, steppes.getPlanetProperties().getSciencePer1Pop(), 0);
        assertEquals(0, steppes.getPlanetProperties().getInfluencePer1Pop(), 0);

        steppes.addAnomaly(ConstructedAnomalies.HIGH_GRAVITY);
        steppes.removeAnomaly(ConstructedAnomalies.HIGH_GRAVITY);
        assertEquals(7, steppes.getPlanetProperties().getPopulation(), 0);
        assertEquals(-5, steppes.getPlanetProperties().getHappiness(), 0);
        assertEquals(4, steppes.getPlanetProperties().getFoodPer1Pop(), 0);
        assertEquals(2, steppes.getPlanetProperties().getIndustryPer1Pop(), 0);
        assertEquals(5, steppes.getPlanetProperties().getGoldPer1Pop(), 0);
        assertEquals(3, steppes.getPlanetProperties().getSciencePer1Pop(), 0);
        assertEquals(0, steppes.getPlanetProperties().getInfluencePer1Pop(), 0);

    }

    @Test
    public void terraform() throws Exception {

    }

}