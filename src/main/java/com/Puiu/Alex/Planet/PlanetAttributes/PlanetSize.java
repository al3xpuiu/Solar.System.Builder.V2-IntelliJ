package com.Puiu.Alex.Planet.PlanetAttributes;

public enum PlanetSize {

	
		
		TINY("tiny", 1),
		SMALL("small", 2),
		MEDIUM("medium", 3),
		LARGE("large", 4),
		HUGE("huge", 5);
		
		private String name;
		private double popBonus;
		
		PlanetSize(String name, double popBonus) {
			this.name = name;
			this.popBonus = popBonus;
		}

		public double getPopBonus() {
			return popBonus;
		}
		
		public String toString() {
			return this.name;
		}
}
