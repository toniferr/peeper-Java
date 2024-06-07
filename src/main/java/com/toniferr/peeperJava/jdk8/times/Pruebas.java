package com.toniferr.peeperJava.jdk8.times;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Pruebas {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("SimpleDateFormat no es Thread Safe");
		String fechaStr = "15/11/2017";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date f1 = null;
		try {
			f1 = sdf.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}


		System.out.println("==================Instant=======================");
		System.out.println("Los constructores de instant (y del resto de clases de java time) son privados");
		Instant i1 = Instant.now();
		Thread.sleep(1);
		Instant i2 = Instant.now();
		System.out.println(i1);
		System.out.println(i2);

		System.out.println("==================instant.toEpochMilli()=======================");
		System.out.println("Milisegundos desde el 1/1/1970");
		System.out.println(i1.toEpochMilli());
		System.out.println(i2.toEpochMilli());

		System.out.println("==================instant.isAfter(instant2)=======================");
		System.out.println("Los objetos de java.time son inmutables");
		System.out.println(i2.isAfter(i1));

		System.out.println("==================instant.plus(amountToAdd, ChronoUnits.HOURS)=======================");
		System.out.println("Plus para añadir");
		i1 = i1.plus(1, ChronoUnit.HOURS);
		System.out.println(i1);
		System.out.println(i2.isAfter(i1));
		System.out.println("Minus para restar");
		i1 = i1.minus(1, ChronoUnit.HOURS);
		System.out.println(i1);
		System.out.println(i2.isAfter(i1));

		System.out.println("==================LocalDate.now()=======================");
		LocalDate ld = LocalDate.now();
		System.out.println("LocalDate:" + ld);

		System.out.println("==================localDate.getDayOfMonth=======================");
		System.out.println("Dia del mes:" + ld.getDayOfMonth());
		System.out.println("==================localDate.getDayOfWeek=======================");
		System.out.println("Dia de la semana:" + ld.getDayOfWeek());
		System.out.println("==================localDate.getDayOfYear=======================");
		System.out.println("Dia del año:" + ld.getDayOfYear());
		System.out.println("==================localDate.getMonthValue=======================");
		System.out.println("Mes:" + ld.getMonthValue());
		System.out.println("==================localDate.getMonth=======================");
		System.out.println("Mes:" + ld.getMonth());
		System.out.println("==================localDate.getYear=======================");
		System.out.println("Año:" + ld.getYear());

		System.out.println("==================localDate.getLong(ChronoField.EPOCH_DAY)=======================");
		System.out.println("Dias desde el 1/1/1970:" + ld.getLong(ChronoField.EPOCH_DAY));
		// System.out.println("ZAS:"+ld.getLong(ChronoField.SECOND_OF_DAY));

		System.out.println("==================localDate.of(year,month,dayOfMont)=======================");
		System.out.println("Patron factoría");
		LocalDate ld2 = LocalDate.of(2030, 1, 1);
		System.out.println(ld2);

		// ld.plus(amountToAdd);
		// ld.minus(amountToSubtract);

		System.out.println("==================LocalTime.now();=======================");
		LocalTime lt = LocalTime.now();
		System.out.println("LocalTime:" + lt);
		System.out.println("==================localTime.getHour();=======================");
		System.out.println("Hora:" + lt.getHour());
		System.out.println("==================localTime.getMinute();=======================");
		System.out.println("Minutos:" + lt.getMinute());
		System.out.println("==================localTime.getSecond();=======================");
		System.out.println("Segundos:" + lt.getSecond());
		System.out.println("==================localTime.getNano();=======================");
		System.out.println("Nanosegundos:" + lt.getNano()); // La precision depende del hardware
		System.out.println("==================localTime.toSecondOfDay();=======================");
		System.out.println("Segundo del dia:" + lt.toSecondOfDay());
		System.out.println("==================localTime.plusMinutes();=======================");
		System.out.println("+ 50 minutos:" + lt.plusMinutes(50));
		System.out.println("Inmutable:" + lt);
		// System.out.println("ZAS:"+lt.getLong(ChronoField.DAY_OF_MONTH));


		System.out.println("==================LocalDateTime.now()=======================");
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("LocalDateTime:" + ldt);


		System.out.println("==================Formatters: son thread safe!=======================");
		LocalDateTime.now();
		System.out.println("==================DateTimeFormatter.ofPattern(\"dd/MM/yyyy\")=======================");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("==================LocalDate.parse(\"10/10/2025\", dtf)=======================");
		LocalDate ld3 = LocalDate.parse("10/10/2025", dtf);
		System.out.println(ld3);
		System.out.println("==================ld3.format(dtf)=======================");
		String fecha = ld3.format(dtf);
		System.out.println(fecha);

		System.out.println("==================ZonedDateTime.now()=======================");
		ZonedDateTime zdt = ZonedDateTime.now();
		System.out.println(zdt);
		System.out.println("==================ZonedId.of(\"zoneId\")=======================");
		ZoneId madrid = ZoneId.of("Europe/Madrid");
		ZoneId canarias = ZoneId.of("Atlantic/Canary");
		System.out.println("==================zonedDateTime.of(\"LocalDateTime.now(), zoneid\")=======================");
		ZonedDateTime zdt2 = ZonedDateTime.of(LocalDateTime.now(), madrid);
		System.out.println("Madrid  :" + zdt2.toLocalTime());
		System.out.println("==================zonedDateTime.withZoneSameInstant(\"zoneid\")=======================");
		ZonedDateTime zdt4 = zdt2.withZoneSameInstant(canarias); //coge misma fecha para canarias
		System.out.println("Canarias:" + zdt4.toLocalTime());
	}

}