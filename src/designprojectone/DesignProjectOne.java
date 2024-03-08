/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designprojectone;
import java.util.Scanner;
import java.util.*;
/***************************************************
*
*  Program:
*  Author:
*  Date: 
*  Description:
****************************************************/

/**************** IPO CHART ************************
*INPUT:
*
*
*PROCESSING:
*
*
*
*OUTPUT:
*
*
***************************************************/
  
/**************** TEST CASES ************************
*Test      Input      Desired Output
*
*
*
*
*
*
*
***************************************************/
public class DesignProjectOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //Write Pseudocode FIRST as comments and THEN write the code
    
  //CONSTANTS

  //VARIABLES

  //CODE
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many students do arduino?");
        int arduinoStudents = scanner.nextInt();
        System.out.println("How many students do raspberry PI?");
        int piStudents = scanner.nextInt();
        System.out.println("How many students do Vr projects?");
        int vrStudents = scanner.nextInt();
        System.out.println("How many students don't need anything?");
        int addStudents = scanner.nextInt();
        if (arduinoStudents > 15) {
            int priceArduino = arduinoStudents*9;
        }
        
    }
    
}
