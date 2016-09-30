/*Introduction to computer science
 * Course: CSC171 FALL 2014
 * Assignment: Lab 07
 * Author: Yuh-Yeu Shih
 * Lab Session: Tuesday 6:15-7:30
 * Lab TA: Yuntao Zhou
 * Last Revisited: September 30th 2014
 */


import java.util.Scanner;

public class lab07 {

	public static void main(String[] args) {
		
		//PART I, please uncomment to run
		/*
		Scanner scan = new Scanner(System.in);
		
		int value;
		double temp, sum=0;
		
		System.out.println("Please enter an integer (0 to quit)");
		value = scan.nextInt();
		
		if (value == 0)
			System.out.println("No values entered");
		
		while (value != 0) {
			temp = Math.pow(value, 2);
			sum += temp;
			
			System.out.println("The sum of the squared input values is " + sum);
			System.out.println("Please next integer (0 to quit)");
			value = scan.nextInt();
		}
		*/
		
		//////////////////////////////////////////////////
		
		//PART 2
		/*
		Scanner scan = new Scanner(System.in);
				
		String name;
				
		System.out.println("Please enter an name (Press Q to quit)");
		name = scan.next();
				
		while (!name.equals("Q")) {
			System.out.println(name + ", you rock!");
			System.out.println("Please enter an name (Press Q to quit)");
			name = scan.next();
		}
		*/
		
		////////////////////////////////////////////////////
		
		//PART 3
		
		/*
		double precision=0.00001, sum = 4;
		double n=1;
				
				
		while (Math.abs(Math.PI - sum) > precision) {
			n++;
			if ((n % 2)==0)
				sum -= 4/(2*n-1);
			else {
				sum += 4/(2*n-1);
			}
		}
		
		System.out.println("The number of iteration it takes to"
				+ "obtain the precision of 0.00001 is " + n);
		System.out.println(sum);
		*/
		
		////////////////////////////////////////////////////////
		
		
		//PART 4
		
		/*
		String lyrics1 = "On the First day of Christmas my true love sent to me";
		String lyrics2 = "a Partridge in a Pear Tree.";
		int line = 2;
		
		System.out.println(lyrics1);
		System.out.println(lyrics2);
		
		while (line <=12) {
			switch (line) {
				case 2: lyrics2 = "2 Turtle Doves\n"+ lyrics2; break;
				case 3: lyrics2 = "3 French Hens\n"+ lyrics2; break;
				case 4: lyrics2 = "4 Calling Birds\n"+ lyrics2; break;
				case 5: lyrics2 = "5 Gold Rings\n"+ lyrics2; break;
				case 6: lyrics2 = "6 Geese-a-Laying\n"+ lyrics2; break;
				case 7: lyrics2 = "7 Swans-a-Swimming\n"+ lyrics2; break;
				case 8: lyrics2 = "8 Maids-a-Milking\n"+ lyrics2; break;
				case 9: lyrics2 = "9 Ladies Dancing\n"+ lyrics2;break;
				case 10: lyrics2 = "10 Lords-a-Leaping\n"+ lyrics2;break;
				case 11: lyrics2 = "11 Pipers Piping\n"+ lyrics2;break;
				case 12: lyrics2 = "12 Drummers Drumming\n"+ lyrics2;break;
			}
			line +=1;
			System.out.println(lyrics1);
			System.out.println(lyrics2);
		}
		*/
		
	}
}