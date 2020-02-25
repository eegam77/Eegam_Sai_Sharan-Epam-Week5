package com.epam.vnrvjiet.week4.construction.Constructioncost;

public class Constructioncostcalculator {
	public double costcalculator(int selectedoption,double landarea)
	{
		switch (selectedoption) {
		case 1:return 1200*landarea;
		case 2:return 1500*landarea;
		case 3:return 1800*landarea;
		case 4:return 2500*landarea;
		default:
			return 0;
		}
	}
}
