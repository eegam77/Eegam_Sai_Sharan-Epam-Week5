package com.epam.vnrvjiet.week4.construction.Constructioncost;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Mainconstruction {
	private static final Logger loggerobj=LogManager.getLogger();
	
	public static void main(String[] args) {
		
		loggerobj.info("Enter land size(area sq meters):");
		Scanner sc=new Scanner(System.in);
		double landsize;
		landsize=sc.nextDouble();
		loggerobj.info("Enter the material you want to use:");
		System.out.println("1)Standard Material\n2)Above standard material\n3)High Standard material\n4)High standard and Fully automated house");
		int selectoption;
		selectoption=sc.nextInt();
		Constructioncostcalculator c=new Constructioncostcalculator();
		loggerobj.info("The total construction cost is:"+c.costcalculator(selectoption, landsize));
		sc.close();
	}
}
