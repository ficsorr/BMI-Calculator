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
    double height; // height of a person
    double weight; // weight of a person
    double[] BMIArray = new double[N+1]; // BMI array for the loop
    double highest = 0; // Variable for highest BMI 
    double lowest = 100; // Lowest BMI is set to 100 to help calculating backwards
    double average; // Variable for average BMI
    int low = 0; // variable for Classificaton3
    int normal = 0; // variable for Classificaton3
    int high = 0; // variable for Classificaton3
    int i = 0; // Variable for loop
    double sum = 0; // Variable for summary

    BMICalculator BMICalculator = new BMICalculator(); // Creating BMICalculator object instance
    System.out.printf("Welcome to Attila's BMI calculator\n\n"); // display welcome message  
    Scanner input = new Scanner(System.in); // New scanner object instance 

// loop to input an individual's height and weight and calculate and display BMI, calculate summary values

    while (i < N) {
   
        i++;
        System.out.printf("Enter height for person %d (m):",i); // prompt
        height = input.nextDouble();
        System.out.printf("Enter weight for person %d (kg):",i); // prompt
        weight = input.nextDouble();	
        
// Add up persons with low, normal and high BMI results

        switch (BMICalculator.classification3(BMICalculator.value(weight, height))) {
    
            case "Low":
            low++;
            break;   
        
            case "Normal(Healty weight)":
            normal++;
            break;
        
            case "High":
            high++;
            break;
         }     
/*   
 // Alternative solution for adding up persons with low, normal and high BMI results
 
        if (class3.equals("Low")) {low++;}
         if (class3.equals("Normal(Healty weight)")) {normal++;}
         if (class3.equals("High")) {high++;}  
*/
        System.out.printf("BMI value for person %d is %.2f which is %s \n\n",i, BMICalculator.value(weight, height), BMICalculator.classification8(BMICalculator.value(weight, height)));
        BMIArray[i] = BMICalculator.value(weight, height); // assigning value to BMIArray
    
    } // End while loop 
    
// Calculating lowest and highest BMI

    i = 0 ;
    do {
       i++;
        if (BMIArray[i] < lowest) {lowest = (double) BMIArray[i];}
        if (BMIArray[i] > highest) {highest = (double) BMIArray[i];}
        sum += BMIArray[i]; // Adding up BMI values for calculating average
        
			
    } while (i < N);

	average = sum / N; // Calculating average
                
// generate and display summary

        System.out.printf("Summary\n*******\nLowest BMI:%.2f\n",lowest);
        System.out.printf("Highest BMI:%.2f\n",highest);
	System.out.printf("Average BMI:%.2f\n",average);               
        System.out.printf("Number with low BMI:%d\n",low);
        System.out.printf("Number with normal BMI:%d\n",normal);
        System.out.printf("Number with high BMI:%d\n",high);

// display exit message 

System.out.printf("\nThank you for using the calculator, good bye!\n");

        }
    }
