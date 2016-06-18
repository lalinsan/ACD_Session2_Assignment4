/*
 * Student: Eduardo Aguirre
 * Session 2
 * Assignment 4
 * Java program that displays the number of Days in a given month. Users enters Year and Month and the number of days are displayed
 */


//Imports the Scanner Class from Java API Library, to allows User's Input
import java.util.Scanner;
 
public class DaysOfTheMonthSwitch {
 
       public static void main(String[] args) { //Main Method to run the Program
              String monthString; //Stores the Month in a String format
              int year; //Stores the Year
              int numberOfDays = 0; //Stores the Number of Days within a Month
             
              //Initiates the Scanner Instance
              @SuppressWarnings("resource")
			Scanner sc = new Scanner (System.in);
             
              //Prompts user to enter a Year
              System.out.print("Enter Year : ");
              year=sc.nextInt(); //Stores the Year entered by the User
             
              //Prompts user to enter a Month String
              System.out.print("Enter month: ");
              monthString=sc.next(); //Stores the Month entered by the User
             
              //Based on the Month entered by the User assign the number of days
              switch (monthString)
              {
              case "January": case "March" : case "May":
              case "July"   : case "August": case "October":
              case "December":
              case "Jan": case "Mar":
              case "Jul"   : case "Aug": case "Oct":
              case "Dec":
                     numberOfDays=31; //Assigns 31 Days if the Month enters matches Case
                      break;
              case "April": case "June": case "September":
              case "November":
              case "Apr": case "Jun": case "Sep":
              case "Nov": 
                      numberOfDays=30; //Assigns 30 Days if the Month enters matches Case
              case "February": case "Feb":
                     if((year%4==0) && !(year %100==0)||(year%400==0))
                                  numberOfDays=29; //Assigns 29 Days or 28 Days based on the Year
                     else
                               numberOfDays=28;
                  break;
              default:
                     System.out.println("Invalid Month"); //Assigns a Default Message when the Case is not matched
                     break;
              }
      
              //Displays the Information to the User
              System.out.println("=============================================");
              System.out.println("You entered the Year & Month : " +year +"--" +monthString); //Displays the Year and Month entered by the user
              System.out.println ("There are : " +numberOfDays +"" + " days in the Month of " +monthString); //Displays the Days for the entered Month
              System.out.println("=============================================");
       }
 
}
