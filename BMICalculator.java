/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1;

/**
 *
 * @author attilameszaros
 */
public class BMICalculator {
 
    // local variable declarations go here
		
                String result3;
                String result8;
                String classification3;
		String message;
                double BMI;
        
    public BMICalculator() {
   
    }
    
    public double value( double weight, double height ) {
    
        BMI = weight/(height*height);   
        return BMI; 
    }

    // return the 8 category (Wikipedia) classification for this BMI
    public String classification8( double BMI ) {

        if  (BMI <= 15) {result8 = "Very severely underweight";}
        if  (BMI >= 15 && BMI <= 16) {result8 = "Severely underweight";}
        if  (BMI >= 16 && BMI <= 18.5) {result8 = "Underweight";}
        if  (BMI >= 18.5 && BMI <= 25) {result8 = "Normal (healthy weight)";}
        if  (BMI >= 25 && BMI <= 30) {result8 = "Overweight";}
        if  (BMI >= 30 && BMI <= 35) {result8 = "Obese Class I (Moderately obese)";}
        if  (BMI >= 35 && BMI <= 40) {result8 = "Obese Class II (Severely obese)";}
        if  (BMI > 40) {result8 = "Obese Class III (Very severely obese)";}

        return result8;
    
    }
    
// return the 3 category (high, normal, low) classification for this BMI     
    public String classification3( double BMI ) {

        if  (BMI <= 18.5) {result3 = "Low";}
        if  (BMI >= 18.5 && BMI <= 25) {result3 = "Normal(Healty weight)";}
        if  (BMI > 25) {result3 = "High";}

        return result3;  
        
    
    }
    
    
}
