/***************************************************
*
*  Program: Tech Fair Cost Calculator
*  Author: Daniel Shen
*  Date: 8/3/24
*  Description: Students are signing up for a science fair, what will the expenses e for the students to attend the science fair
****************************************************/
package designprojectone;
import java.util.Scanner;
import java.util.*;
/**************** IPO CHART ************************
*INPUT:
* Number of students participating in Arduino, PI, Vr or none.

*PROCESSING:
*Using decisions to determine whether there should be a discount or not. 
*Arithmetic to find price and mean

*OUTPUT:
*Price each student has to pay
***************************************************/

/**************** TEST CASES ************************
*Test      Input      Desired Ouput
*                 GOOGLE DOCS
***************************************************/

  public class DesignProjectOne {
  public static void main(String[] args) {
  //Write Pseudocode FIRST as comments and THEN write the code
    /*

  Program techFairCostCalculator:
  Print "How many students do Arduino?"
  Read arduinoStudents
  Print "How many students do Raspberry Pi?"
  Read piStudents
  Print "How many students do Vr projects?"
  Read vrStudents

  requirementArduino = 15
  IF (arduinoStudents > requirementArduino) 
  THEN priceArduino = arduinoStudents * 9
  ELSE priceArduino = arduinoStudents * 10
  ENDIF

  requirementPI = 20
  IF (piStudents > requirementPI)
  THEN pricePi = piStudents * 12
  ELSE pricePI = piStudents * 15
  ENDIF

  numOfStudents = arduinoStudents + piStudents + vrStudents
  IF (numOfStudents <= 0)
  THEN END.

  requirementForFixedDiscount = 100
  IF (numOfStudents > requirementForFixedDiscount)
  THEN totalPrice = numOfStudents * 50 * 0.95 + pricePI + priceArduino   + vrStudents * 20
  ELSE totalPrice = numOfStudents * 50 + pricePI + priceArduino +  
  vrStudents*20 
  ENDIF

  price = totalPrice / numOfStudents
  Print "Each student must pay $" + price

  END.

    CONSTANTS

    final int requirementArduino = 15;
    final int priceForArduino1 = 10;
    final int priceForArduino2 = 9;
    final int requirementPI = 20;
    final int priceForPI1 = 15;
    final int priceForPI2 = 12;
    final int numOfStudents = arduinoStudents + piStudents + vrStudents;
    final int requirementForFixedDiscount = 100;
    final int priceForFixedCost = 50;
    final double discountForFixedCost = 0.95;
    final int priceVR = vrStudents * 20;
    final int priceForStudents = 50;
    final int priceStudents = numOfStudents * priceForStudents;
    final double pricePerStudent = (double) totalPrice / numOfStudents;

    VARIABLES

    int arduinoStudents;
    int piStudents;
    int vrStudents;
    int priceArduino;
    int pricePI;
    double totalPrice;

  */

  //CODE
    Scanner scanner = new Scanner(System.in);
    System.out.println("How many students do Arduino?");
    int arduinoStudents = scanner.nextInt();
    // Asks user how many students will do arduino.

    System.out.println("How many students do Raspberry PI?");
    int piStudents = scanner.nextInt();
    // Asks user how many students will do raspberry pi.

    System.out.println("How many students do Vr projects?");
    int vrStudents = scanner.nextInt();
    // Asks user how many students will do vr projects.


    final int requirementArduino = 15;
    final int priceForArduino1 = 10;
    final int priceForArduino2 = 9;
    int priceArduino;
    if (arduinoStudents > requirementArduino) {
        priceArduino = arduinoStudents * priceForArduino2;
    } else {
      priceArduino = arduinoStudents * priceForArduino1;
    }
    // Check if # of people should be discounted. Arduino.


    final int requirementPI = 20;
    final int priceForPI1 = 15;
    final int priceForPI2 = 12;
    int pricePI;
    if (piStudents > requirementPI) {
        pricePI = piStudents * priceForPI2;
    } else {
      pricePI = piStudents * priceForPI1;
    }
    // Checks # of people and if they should be discounted. PI.


    final int numOfStudents = arduinoStudents + piStudents + vrStudents;
    if (numOfStudents <= 0) {
      System.out.println("0 Students are participating in this years Science Fair. (womp womp)");
      System.exit(0);
    }
    // If there aren't any students, the program stops.


      final int requirementForFixedDiscount = 100;
      final int priceForFixedCost = 50;
      final double discountForFixedCost = 0.95;
      final int priceVR = vrStudents * 20;
      final int priceForStudents = 50;
      final int priceStudents = numOfStudents * priceForStudents;
      double totalPrice;
      if (numOfStudents > requirementForFixedDiscount) {
        totalPrice = priceStudents * priceForFixedCost * discountForFixedCost + pricePI + priceArduino + priceVR;
      } else {
          totalPrice = priceStudents + pricePI + priceArduino + priceVR;
      }
    // Calculates total price from all 3 activities.


      final double pricePerStudent = (double) totalPrice / numOfStudents;
      System.out.println("Each student must pay $" + pricePerStudent);
      scanner.close();
    // Tells user how much money each person needs to spend (individually).


  }
}
