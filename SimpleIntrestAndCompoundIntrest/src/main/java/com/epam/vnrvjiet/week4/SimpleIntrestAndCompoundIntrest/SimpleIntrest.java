package com.epam.vnrvjiet.week4.SimpleIntrestAndCompoundIntrest;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class SimpleIntrest {
	private static final Logger logger=LogManager.getLogger();
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double simpleIntrest=0;
	Scanner sc=new Scanner(System.in);
	void readInput()
	{
		logger.info("Enter number of months:(Time period)");
		timeperiod=sc.nextDouble();
		logger.info("Enter principle amount:");
		principleAmount=sc.nextDouble();
		logger.info("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextDouble();		
	}
	public void Simple_Intrest()
	{
		timeperiod=timeperiod/12;
		simpleIntrest=(principleAmount*timeperiod*rateOfIntrest)/100;
		logger.info("Simple Intrest:"+simpleIntrest);
	}
}
