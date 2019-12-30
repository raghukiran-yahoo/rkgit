package com.raghu.JavaBasics;

import java.awt.Color;

public class Car {
	
	
	double averageMilesPerGallon;
	String licensePlate;
	Color paintColor;
	boolean areTailingWorking;
	
	public Car(double averageMilesPerGallon,String licensePlate,Color paintColor,	boolean areTailingWorking) {
		
		this.averageMilesPerGallon = averageMilesPerGallon;
		this.licensePlate = licensePlate;
		this.paintColor = paintColor;
		this.areTailingWorking = areTailingWorking;
		
	}

	public void changePaintColor(Color newPaintColor) {
		
		this.paintColor = newPaintColor;
		
	}
}
