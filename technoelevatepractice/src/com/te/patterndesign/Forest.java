package com.te.patterndesign;

public class Forest {
	public static void main(String[] args) {
		Animal animal=FactoryForest.getFood("tiger");
		animal.food();
	}

}
 