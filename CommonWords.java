/** GEEN163 LAb 10: Common Words 
 *  This program reads a text file and counts the number of times each English word 
    appears then displays the 25 most frequently used words.
 *  11/14/16
 *  By: OYARE VICTOR OKO
 */
 import java.util.*;
 
 //The main program needs to sort an array of UseCount objects.
public class CommonWords{
   public static void main(String [] args){ 
   
   UseCount [] tenK = new UseCount [10000]; //an array that can hold 10,000 UseCount objects.
   
      
   File catfile = new File("CatInTheHat.txt");
   
   Scanner scan = new Scanner(System.in);
   Scanner catread = new Scanner(catfile);   //reads the file CatInTheHat      
      
   System.out.println("Enter file name > "); //asks the user for the input filename
   textfile = scan.next();
   
   while( inFile.hasNext() ){
     engword = catread.next(); 
     //search the array of UseCount objects for an object that contains the word just read (ignoring case).
     
     if  
   }
      
   }
}

public class UseCount implements Comparable<UseCount> {
   private String word;  //one String to hold the English word
   private int count;    //an int to hold the count of times this word appeared in the text.
   
   public UseCount( String word ){    //constructor
      this.word = word;
      count  = 1;
   } 
   
   /* For sorting with the Comparable interface */
   public int compareTo( UseCount other ) {
   return other.count – this.count;
   }
}