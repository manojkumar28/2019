package com.datetime;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeTest {

	public static void main(String[] args) {
		zoneTest();
	}

	private static void zoneTest() {
		// TODO Auto-generated method stub
		Instant now = Instant.now();
		ZoneId zoneId = ZoneId.of( "America/Los_Angeles" );
		ZonedDateTime zdt = now.atZone( zoneId );
		zdt = zdt.truncatedTo( ChronoUnit.SECONDS );
		String output = zdt.format( DateTimeFormatter.ISO_LOCAL_DATE_TIME );
		System.out.println(output);
		
		//manual datetime
		String input = output.replace('T' , ' ');
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss" );
		LocalDateTime ldt = LocalDateTime.parse( input , formatter );
		System.out.println(ldt);
	}

}
