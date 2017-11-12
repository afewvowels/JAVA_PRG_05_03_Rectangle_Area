/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_05_03_rectangle_area;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 * If you have downloaded the book's source code from www.pearsonhighered.com/gaddis,
 * you will find a partially written program named AreaRectangle.java in the
 * chapter's source code folder. Your job is to complete the program. When it is
 * complete, the program will ask the user to enter the width and length of a
 * rectangle, and then display the rectangle's area. The program calls the
 * following methods, which have not been written:
 * 
 *      getLength - This method should ask the user to enter the rectangle's
 *      length, and then return that value as a double.
 *      getWidth - This method should ask the user to enter the rectangle's
 *      width, and then return that value as a double.
 *      getArea - This method should accept the rectangle's length and width
 *      as arguments, and return the rectangle's area. The area is calculated
 *      by multiplying the length by the width.
 *      displayData - This method should accept the rectangle's length, width,
 *      and area as arguments, and display theml in an appropriate message
 *      on the screen.
 */
public class JAVA_PRG_05_03_Rectangle_Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        displayData(getArea(getLength(), getWidth()));
    }
    
    public static double getLength()
    {
        double dblLength;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.print("Please enter the rectangle's length: ");
        
        dblLength = scrKeyboard.nextDouble();
        
        return dblLength;
    }
    
    public static double getWidth()
    {
        double dblWidth;
        
        Scanner scrKeyboard = new Scanner(System.in);
        
        System.out.print("Please enter the rectangle's width: ");
        
        dblWidth = scrKeyboard.nextDouble();
        
        return dblWidth;
    }
    
    public static double getArea(double dblHeight, double dblWidth)
    {
        double dblArea;
        
        dblArea = dblHeight * dblWidth;
        
        return dblArea;
    }
    
    public static void displayData(double dblArea)
    {
        System.out.println("That rectangle\'s area is " + dblArea + " units squared.");
    }
    
}
