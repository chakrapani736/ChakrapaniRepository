package com.te.localdate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Collection;
import java.util.Set;

public class DateTest {
	public static void main(String[] args) {
		//LocalDate date=LocalDate.now().minusYears(1);
		//LocalDate date=LocalDate.of(2023,Month.JULY, 12);
		LocalDate date=LocalDate.now(ZoneId.of("Asia/Bangkok"));
		System.out.println(date);
		LocalTime time=LocalTime.now().minusHours(8760);
		System.out.println(time);
		Collection<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		availableZoneIds.stream().sorted().forEach(e->System.out.println(e));
		/*
		 * for(String s:availableZoneIds) { System.out.println(s); }
		 */
		
	}

}
