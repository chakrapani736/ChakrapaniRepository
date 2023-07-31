package com.te.patterndesign;

public class FactoryForest {
	public static Animal getFood(String s)
	{
		if(s.equals("tiger")) {
			return new Tiger();
		}else if(s.equals("snake")){
			return new Snake();
		}else if(s.equals("deer")) {
			return new Deer();
		}else {
			return null;
		}
	}

}
