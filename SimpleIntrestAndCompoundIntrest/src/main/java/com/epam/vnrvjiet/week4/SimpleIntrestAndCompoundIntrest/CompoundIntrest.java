package com.epam.vnrvjiet.week4.SimpleIntrestAndCompoundIntrest;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class CompoundIntrest {
	private static final Logger logger=LogManager.getLogger();
	double principleAmount;
	double timeperiod;
	double rateOfIntrest;
	double compoundIntrest=0;
	int selectCompoundtype;
	Scanner sc=new Scanner(System.in);
	void readInput()
	{
		logger.info("Enter number of months:(Time period)");
		timeperiod=sc.nextDouble();
		logger.info("Enter principle amount:");
		principleAmount=sc.nextDouble();
		logger.info("Enter Rate of Intrest:");
		rateOfIntrest=sc.nextDouble();	
		logger.info("Select an option:1) Annually\n 2)halfyearly \n 3)Quarterly ");
		selectCompoundtype=sc.nextInt();
	}
	public void Compound_Intrest()
	{	
			switch(selectCompoundtype)
			{
			case 1: timeperiod=timeperiod/((timeperiod/12));break;
			case 2: timeperiod=timeperiod/((timeperiod/6));break;
			case 3: timeperiod=timeperiod/((timeperiod/3));break;
			}
			compoundIntrest=(principleAmount*Math.pow(1+((rateOfIntrest)/100),timeperiod))-(principleAmount);
			logger.info("Compound Intrest:"+compoundIntrest);
	}
}
