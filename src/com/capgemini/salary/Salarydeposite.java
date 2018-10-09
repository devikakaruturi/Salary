package com.capgemini.salary;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Salarydeposite {
	public static void main(String args[])
	{
		/*Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		int month = scanner.nextInt();*/
		LocalDate lastDayofCurrentMonth = LocalDate.of(2018,9,1).with(TemporalAdjusters.lastDayOfMonth());

		 /* System.out.println("1A. Last day of the current month: "+
		      lastDayofCurrentMonth.getDayOfWeek() + "," + lastDayofCurrentMonth);
		  LocalDate lastDayofCurrentMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
			 DayOfWeek lastDay= lastDayofCurrentMonth.getDayOfWeek(); 
			 LocalDate month1 = lastDayofCurrentMonth;
		 LocalDate day = Day(#lastDayofCurrentMonth#)*/
		DayOfWeek dayOfWeek=lastDayofCurrentMonth.getDayOfWeek();
		System.out.println(dayOfWeek.toString());
		System.out.println(lastDayofCurrentMonth.toString());
		if(dayOfWeek.toString().equals("SUNDAY"))
		{
			lastDayofCurrentMonth=lastDayofCurrentMonth.minusDays(2);
		}
		else if(dayOfWeek.toString().equals("SATURDAY"))
		{
			lastDayofCurrentMonth=lastDayofCurrentMonth.minusDays(1);
		}
		 dayOfWeek=lastDayofCurrentMonth.getDayOfWeek();
		System.out.println(lastDayofCurrentMonth.toString());
	}
}
