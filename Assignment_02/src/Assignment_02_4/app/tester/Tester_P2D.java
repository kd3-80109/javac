package com.app.tester;

import com.app.geometry.Point2D;

public class Tester_P2D {

	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.acceptdata();
		p1.displaydata();
		Point2D p2 =new Point2D();
		p2.acceptdata();
		p2.displaydata();
		
		if(p1.isEqual(p2))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
			System.out.println(p1.calculateDistance(p2));
		
		}

	}

}
