package main;

import controller.Calculo;

public class Principal {

		public static void main (String[] args) {
			Calculo cal = new Calculo(); 
			int[] v = {74, 20, 74, 87, 81, 16, 25, 99, 44, 58};
			System.out.println(" Bubble Sort ");
			cal.opBubble(v);
			 	for(int num : v) {
			      System.out.print(num + " ");
			 	}
			 	System.out.println(" "); 
			 	System.out.println("---------------------------------------"); 
			 	System.out.println(" Merge Sort ");
			cal.opMerge(10,v);      
				for(int num : v) {
			      System.out.print(num + " ");
			    }
			System.out.println("                        ");
			System.out.println("                        ");
			System.out.println("                        ");
			Calculo cal2 = new Calculo(); 
				int[] v2 = {44,43,42,41,40,39,38};
				System.out.println(" Bubble Sort ");
				cal2.opBubble(v2);
				 	for(int num : v2) {
				      System.out.print(num + " ");
				 	}
				 	System.out.println(" "); 
				 	System.out.println("---------------------------------------"); 
				 	System.out.println(" Merge Sort ");
				cal2.opMerge(7,v2);      
					for(int num : v2) {
				      System.out.print(num + " ");
				    }	
		}
}
