package com.te.optionalclass;

import java.util.Optional;

public class OptionalClassTest {
	public static void main(String[] args) {
		String name="pani";
		Optional<String> ofNullable = Optional.ofNullable(name);
		System.out.println(ofNullable.equals(name));
		System.out.println(ofNullable.of("pani").equals("pani"));
		//String string = ofNullable.get();
		//System.out.println(string);
		ofNullable.ifPresent(e->System.out.println( "hi is present"));
		String string = ofNullable.filter(e->e=="pani").get();
		System.out.println(string);
		//System.out.println(ofNullable);
//		boolean present = Optional.of("pani").isPresent();
//		System.out.println(present);
		
		
		
		
		
		
	}

}
