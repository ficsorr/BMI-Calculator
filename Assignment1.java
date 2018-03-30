/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;
import java.util.Scanner;

/**
 *
 * @author attilameszaros
 */
public class Assignment1 {

// no attributes required
public static void main(String[] args) {

// local variable declarations go here

    final int N = 3;
    double height;
    double weight;
    double[] BMIArray = new double[N+1];
    double highest = 0;
    double lowest = 100;
    double average;
    int low = 0;
    int normal = 0;
    int high = 0;
    int i = 0;
    String class3;

// Creting BMICalculator object

    BMICalculator BMICalculator = new BMICalculator(); 

// display welcome message

    System.out.printf("Welcome to Attila's BMI calculator\n\n");

// loop to input an individual’s height and weight and calculate and display BMI, calculatesummary values

// New scanner object

    Scanner input = new Scanner(System.in);

    while (i < N) {
   
        i++;
        
        System.out.printf("Enter height for person %d (m):",i); // prompt
       	height = input.nextDouble();
		
       	System.out.printf("Enter weight for person %d (kg):",i); // prompt
	weight = input.nextDouble();	
                
        class3 = BMICalculator.classification3(BMICalculator.value(weight, height));
                
        if (class3.equals("Low")) {low++;}
        if (class3.equals("Normal(Healty weight)")) {normal++;}
        if (class3.equals("High")) {high++;}
                
        System.out.printf("BMI value for person %d is %.2f which is %s \n\n",i, BMICalculator.value(weight, height), BMICalculator.classification8(BMICalculator.value(weight, height)));
        BMIArray[i] = BMICalculator.value(weight, height);
                              
}

// Calculating lowest and highest BMI

         i = 1;
         double sum = 0;
                do {
        	    i++;
			if (BMIArray[i] < lowest) {lowest = (double) BMIArray[i];}
			if (BMIArray[i] > highest) {highest = (double) BMIArray[i];}
			
                        sum += BMIArray[i];
			
			} while ( i < N);
		
		average = sum / N;


// generate and display summary

		System.out.printf("\n\nSummary\n*******\nLowest BMI:%.2f\n",lowest);
		System.out.printf("Highest BMI:%.2f\n",highest);
		System.out.printf("Average BMI:%.2f\n",average);
               
                System.out.printf("Number with low BMI:%d\n",low);
                System.out.printf("Number with normal BMI:%d\n",normal);
                System.out.printf("Number with high BMI:%d\n",high);

// display exit message 

System.out.printf("\nThank you for using the calculator, good bye!");
}
}