package com.epam.vnrvjiet.week4.SimpleIntrestAndCompoundIntrest;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class MainIntrestCalculator {
	private static final Logger logger=LogManager.getLogger();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		logger.info("Welcome to simple intrest and Compound intrest Calculator");
		logger.info("1. Compound Intrest\n 2.Simple Intrest ");
		Scanner sc=new Scanner(System.in);
		int Intresttype;
		Intresttype=sc.nextInt();
			switch(Intresttype)
			{
			case 1: CompoundIntrest ci=new CompoundIntrest();
					ci.readInput();
					ci.Compound_Intrest();
					break;
			case 2: SimpleIntrest si=new SimpleIntrest();
					si.readInput();
					si.Simple_Intrest();
					break;
			default:logger.error("Enter correct option");
			}
			sc.close();
		
	}
}